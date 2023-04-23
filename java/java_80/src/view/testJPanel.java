package view;

import java.awt.BorderLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class testJPanel extends JFrame{
	public testJPanel() {
		this.setTitle("vidu");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField jtextField = new JTextField(50);
		JPanel jpanel_head = new JPanel();
		jpanel_head.setLayout(new BorderLayout());
		jpanel_head.add(jtextField, BorderLayout.CENTER);
		
		JButton jbutton_0 = new JButton("0");
		JButton jbutton_1 = new JButton("1");
		JButton jbutton_2 = new JButton("2");
		JButton jbutton_3 = new JButton("3");
		JButton jbutton_4 = new JButton("4");
		JButton jbutton_5 = new JButton("5");
		JButton jbutton_6 = new JButton("6");
		JButton jbutton_7 = new JButton("7");
		JButton jbutton_8 = new JButton("8");
		JButton jbutton_9 = new JButton("9");
		JButton jbutton_cong = new JButton("+");
		JButton jbutton_tru = new JButton("-");
		JButton jbutton_nhan = new JButton("*");
		JButton jbutton_chia = new JButton("/");
		JButton jbutton_bang = new JButton("=");
		
		JPanel jpanel_buttons = new JPanel();
		jpanel_buttons.setLayout(new GridLayout(5, 3));
		jpanel_buttons.add(jbutton_0);
		jpanel_buttons.add(jbutton_1);
		jpanel_buttons.add(jbutton_2);
		jpanel_buttons.add(jbutton_3);
		jpanel_buttons.add(jbutton_4);
		jpanel_buttons.add(jbutton_5);
		jpanel_buttons.add(jbutton_6);
		jpanel_buttons.add(jbutton_7);
		jpanel_buttons.add(jbutton_8);
		jpanel_buttons.add(jbutton_9);
		jpanel_buttons.add(jbutton_cong);
		jpanel_buttons.add(jbutton_tru);
		jpanel_buttons.add(jbutton_nhan);
		jpanel_buttons.add(jbutton_chia);
		jpanel_buttons.add(jbutton_bang);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_head, BorderLayout.NORTH);
		this.add(jpanel_buttons, BorderLayout.CENTER);
		
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new testJPanel();
	}
}
