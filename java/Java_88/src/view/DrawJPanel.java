package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawJPanel extends JPanel{

	public DrawJPanel() {
		this.setBackground(Color.WHITE);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.black);
		g.drawLine(15,15, 50, 150);
	}
	
}
