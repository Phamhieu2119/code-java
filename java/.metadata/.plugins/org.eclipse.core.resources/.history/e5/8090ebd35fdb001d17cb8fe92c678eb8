package main7;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBagLayoutExample {
	 public static void main(String[] args) {
	      JFrame frame = new JFrame("GridBagLayout Example");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      JPanel panel = new JPanel(new GridBagLayout());
	      GridBagConstraints constraints = new GridBagConstraints();
	      constraints.insets = new Insets(5, 5, 5, 5);

	      JButton button1 = new JButton("Button 1");
	      constraints.gridx = 0;
	      constraints.gridy = 0;
	      constraints.gridwidth = 2;
	      panel.add(button1, constraints);

	      JButton button2 = new JButton("Button 2");
	      constraints.gridx = 2;
	      constraints.gridy = 0;
	      constraints.gridwidth = 1;
	      panel.add(button2, constraints);

	      JButton button3 = new JButton("Button 3");
	      constraints.gridx = 0;
	      constraints.gridy = 1;
	      constraints.gridwidth = 3;
	      panel.add(button3, constraints);

	      frame.add(panel);
	      frame.pack();
	      frame.setVisible(true);
	   }
}
