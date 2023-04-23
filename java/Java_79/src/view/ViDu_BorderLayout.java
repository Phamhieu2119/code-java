package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_BorderLayout extends JFrame{
	public ViDu_BorderLayout() {
		this.setTitle("ViDu_BorderLayout");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		BorderLayout boerderLayout = new BorderLayout();
		this.setLayout(boerderLayout);
		
		JButton jbutton_1 = new JButton("1");
		JButton jbutton_2 = new JButton("2");
		JButton jbutton_3 = new JButton("3");
		JButton jbutton_4 = new JButton("4");
		JButton jbutton_5 = new JButton("5");
		
		this.add(jbutton_1,BorderLayout.NORTH);
		this.add(jbutton_2,BorderLayout.SOUTH);
		this.add(jbutton_3,BorderLayout.CENTER);
		this.add(jbutton_4,BorderLayout.EAST);
		this.add(jbutton_5,BorderLayout.WEST);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ViDu_BorderLayout();
	}
}
