package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListener;
import model.LastButton;

public class ViewLastbutton extends JFrame{
	private LastButton lastbutton;
	private JLabel jlabel;
	public ViewLastbutton() {
		this.lastbutton = new LastButton();
		
		this.init();
	}
	private void init() {
		this.setTitle("LastButton");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener ac = new LastButtonListener(this);
		
		Font font = new Font("Times New Roman", Font.BOLD ,20);
		JButton jbutton_1 = new JButton("1");
		jbutton_1.setFont(font);
		jbutton_1.addActionListener(ac);
		JButton jbutton_2 = new JButton("2");
		jbutton_2.setFont(font);
		jbutton_2.addActionListener(ac);
		JButton jbutton_3 = new JButton("3");
		jbutton_3.setFont(font);
		jbutton_3.addActionListener(ac);
		JButton jbutton_4 = new JButton("4");
		jbutton_4.setFont(font);
		jbutton_4.addActionListener(ac);
		
		JPanel jpanel_center = new JPanel();
		jpanel_center.setLayout(new GridLayout(2,2));
		jpanel_center.add(jbutton_1);
		jpanel_center.add(jbutton_2);
		jpanel_center.add(jbutton_3);
		jpanel_center.add(jbutton_4);
		
		jlabel = new JLabel("----", JLabel.CENTER);
		jlabel.setFont(font);
		JPanel jpanel_footer = new JPanel();
		jpanel_footer.setLayout(new BorderLayout());
		jpanel_footer.add(jlabel , BorderLayout.CENTER);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_center, BorderLayout.CENTER);
		this.add(jpanel_footer, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	public void chang_1() {
		this.lastbutton.change_1();
		jlabel.setText("Last button:"+this.lastbutton.getValue());
	}
	public void chang_2() {
		this.lastbutton.change_2();
		jlabel.setText("Last button:"+this.lastbutton.getValue());
	}
	public void chang_3() {
		this.lastbutton.change_3();
		jlabel.setText("Last button:"+this.lastbutton.getValue());
	}
	public void chang_4() {
		this.lastbutton.change_4();
		jlabel.setText("Last button:"+this.lastbutton.getValue());
	}
}
