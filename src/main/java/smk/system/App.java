package smk.system;

import java.awt.*;
import javax.swing.*;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		JFrame window = new Window("Supermercado SMK");
		window.size = (800, 800);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
