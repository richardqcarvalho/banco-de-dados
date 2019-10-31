package smk.system;

import javax.swing.*;

public class App {
	public static void main(String[] args) {
		JFrame window = new Window("Supermercado SMK");
		window.setSize(800, 800);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
