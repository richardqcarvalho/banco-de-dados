package smk.system;

import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {
    private static final long serialVersionUID = 1L;

    public Window(String title) {
        super(title);
        setLayout(new FlowLayout());

        JPanel jpnId = new JPanel();
		add(jpnId);
		JPanel jpnAmount = new JPanel();
		add(jpnAmount);
		JPanel jpnButtons = new JPanel();
        add(jpnButtons);
        
        jpnId.add(new JLabel("Digite o código do produto: "));
		JTextField id = new JTextField(15);
		jpnId.add(id);
		jpnAmount.add(new JLabel("Digite a quantidade de " + id.getText() + "que você deseja: "));
		JTextField amount = new JTextField(15);
        jpnAmount.add(amount);
        
        JButton btnConfirm = new JButton("Confirmar");
		jpnButtons.add(btnConfirm);
		JButton btnClean = new JButton("Limpar");
        jpnButtons.add(btnClean);
        
        btnClean.addActionListener((ev) -> {
			id.setText("");
			amount.setText("");
		});
    }
}