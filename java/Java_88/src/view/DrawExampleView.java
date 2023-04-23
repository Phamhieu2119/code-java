package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DrawExampleView extends JFrame{
	public DrawExampleView() {
		this.setTitle("Draw");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		
		DrawJPanel drawJPanel = new DrawJPanel();
		
		this.setLayout(new BorderLayout());
		this.add(drawJPanel,BorderLayout.CENTER);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new DrawExampleView();
	}
}
