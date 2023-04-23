package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.countermodel;

public class counterview extends JFrame{
	private countermodel counterModel;
	private JButton jbutton_up;
	private JButton jbutton_down;
	private JLabel jLaybel_value;
	private JButton jbutton_reset;
	 public counterview() {
		 this.counterModel = new countermodel();
		 this.init();
		 this.setVisible(true);
	 }
	 public void init() {
		 this.setTitle("Counter");
		 this.setSize(300,300);
		 this.setLocationRelativeTo(null);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 ActionListener ac = new CounterListener(this);
		 jbutton_up = new JButton("UP");
		 jbutton_up.addActionListener(ac);
		 
		 jbutton_down = new JButton("Down");
		 jbutton_down.addActionListener(ac);
		 
		 jLaybel_value = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);
		 
		 JPanel jpanel = new JPanel();
		 jpanel.setLayout(new BorderLayout());
		 jpanel.add(jbutton_up, BorderLayout.EAST);
		 jpanel.add(jbutton_down, BorderLayout.WEST);
		 jpanel.add(jLaybel_value, BorderLayout.CENTER);
		 
		 jbutton_reset = new JButton("Reset");
		 jbutton_reset.addActionListener(ac);
		 JPanel jpanel_foot = new JPanel();
		 jpanel_foot.setLayout(new BorderLayout());
		 jpanel_foot.add(jbutton_reset, BorderLayout.CENTER);
		 
		 this.setLayout(new BorderLayout());
		 this.add(jpanel,BorderLayout.CENTER);
		 this.add(jpanel_foot, BorderLayout.SOUTH);
		 
	 }
	 public void increment() {
		 this.counterModel.increment();
		 this.jLaybel_value.setText(this.counterModel.getValue()+"");
	 }
	 public void decrement() {
		 this.counterModel.decrement();
		 this.jLaybel_value.setText(this.counterModel.getValue()+"");
	 }
	 public void reset() {
		 this.counterModel.reset();
		 this.jLaybel_value.setText(this.counterModel.getValue()+"");
	 }
	 
}
