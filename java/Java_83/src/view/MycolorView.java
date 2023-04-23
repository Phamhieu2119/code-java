package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MycolorListener;
import model.MycolorModel;

public class MycolorView extends JFrame {
	private MycolorModel mycolorModel;
	private JLabel jlabel;

	public MycolorView() {
		this.mycolorModel = new MycolorModel();
		this.init();
	}

	private void init() {
		this.setTitle("MyColor");
		this.setSize(1200, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MycolorListener ac = new MycolorListener(this);
		jlabel = new JLabel("---TEXT---", JLabel.CENTER);

		JPanel jpanel = new JPanel();
		jpanel.setLayout(new GridLayout(2, 3));

		Font font = new Font("Times New Roman", Font.BOLD, 20);

		JButton jbutton_text_red = new JButton("Red text");
		jbutton_text_red.setFont(font);
		jbutton_text_red.setForeground(Color.RED);
		jbutton_text_red.addActionListener(ac);
		
		JButton jbutton_text_Yellow = new JButton("Yellow text");
		jbutton_text_Yellow.setFont(font);
		jbutton_text_Yellow.setForeground(Color.YELLOW);
		jbutton_text_Yellow.addActionListener(ac);
		
		JButton jbutton_text_Green = new JButton("Green text");
		jbutton_text_Green.setFont(font);
		jbutton_text_Green.setForeground(Color.GREEN);
		jbutton_text_Green.addActionListener(ac);
		
		JButton jbutton_back_red = new JButton("Red back");
		jbutton_back_red.setFont(font);
		jbutton_back_red.setBackground(Color.RED);
		jbutton_back_red.addActionListener(ac);
		
		JButton jbutton_back_Yellow = new JButton("Yellow back");
		jbutton_back_Yellow.setFont(font);
		jbutton_back_Yellow.setBackground(Color.YELLOW);
		jbutton_back_Yellow.addActionListener(ac);
		
		JButton jbutton_back_Green = new JButton("Green back");
		jbutton_back_Green.setFont(font);
		jbutton_back_Green.setBackground(Color.GREEN);
		jbutton_back_Green.addActionListener(ac);
		
		jpanel.add(jbutton_text_red);
		jpanel.add(jbutton_text_Yellow);
		jpanel.add(jbutton_text_Green);
		jpanel.add(jbutton_back_red);
		jpanel.add(jbutton_back_Yellow);
		jpanel.add(jbutton_back_Green);

		this.setLayout(new BorderLayout());
		this.add(jlabel, BorderLayout.CENTER);
		this.add(jpanel, BorderLayout.SOUTH);

		this.setVisible(true);

	}
	public void changeText(Color color) {
		this.jlabel.setForeground(color);
	}
	public void changeBack(Color color) {
		this.jlabel.setBackground(color);
		this.jlabel.setOpaque(true);
	}
}
