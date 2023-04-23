package view;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.ModelPtb2;

public class ViewPtb2 extends JFrame{
	private ModelPtb2 model;

	public ViewPtb2() {
		this.model = new ModelPtb2();
		this.init();
	}

	private void init() {
		this.setTitle("Giai pt bac 2");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font font = new Font("time new roman",Font.BOLD,18);
		
		JLabel headjlabel = new JLabel("Giai phuong trinh bac 2");
		headjlabel.setFont(font);
		headjlabel.setForeground(Color.red);
		headjlabel.setHorizontalAlignment(SwingConstants.CENTER);
	
		JPanel jpanel1 = new JPanel(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		//constraint.insets = new Insets(8,8,8,8);
		constraint.fill = GridBagConstraints.HORIZONTAL;
		constraint.weightx = 4;
		constraint.weighty = 4;
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.gridwidth = 1;
		constraint.gridheight = 1;
		
		JLabel ajlabel = new JLabel("He so a ");
		ajlabel.setHorizontalAlignment(SwingConstants.CENTER);
		ajlabel.setFont(font);
		ajlabel.setForeground(Color.BLUE);
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.gridwidth = 2;
		jpanel1.add(ajlabel,constraint);
		
		JLabel bjlabel = new JLabel("He so b ");
		bjlabel.setHorizontalAlignment(SwingConstants.CENTER);
		bjlabel.setFont(font);
		bjlabel.setForeground(Color.BLUE);
		constraint.gridx = 0;
		constraint.gridy = 1;
		constraint.gridwidth = 2;
		jpanel1.add(bjlabel,constraint);
		
		JLabel cjlabel = new JLabel("He so c ");
		cjlabel.setHorizontalAlignment(SwingConstants.CENTER);
		cjlabel.setFont(font);
		cjlabel.setForeground(Color.BLUE);
		constraint.gridx = 0;
		constraint.gridy = 2;
		constraint.gridwidth = 2;
		jpanel1.add(cjlabel,constraint);
		
		JLabel kqjlabel = new JLabel("Ket qua  ");
		kqjlabel.setHorizontalAlignment(SwingConstants.CENTER);
		kqjlabel.setFont(font);
		kqjlabel.setForeground(Color.RED);
		constraint.gridx = 0;
		constraint.gridy = 3;
		constraint.gridwidth = 1;
		jpanel1.add(kqjlabel,constraint);
		
		JTextField texta = new JTextField(50);
		texta.setFont(font);
		constraint.gridx = 2;
		constraint.gridy = 0;
		constraint.gridwidth = 2;
		jpanel1.add(texta,constraint);
		
		JTextField textb = new JTextField(50);
		textb.setFont(font);
		constraint.gridx = 2;
		constraint.gridy = 1;
		constraint.gridwidth = 2;
		jpanel1.add(textb,constraint);
		
		JTextField textc = new JTextField(50);
		textc.setFont(font);
		constraint.gridx = 2;
		constraint.gridy = 2;
		constraint.gridwidth = 2;
		jpanel1.add(textc,constraint);
		
		JTextField textkq = new JTextField(50);
		textkq.setFont(font);
		constraint.gridx = 1;
		constraint.gridy = 3;
		constraint.gridwidth = 3;
		jpanel1.add(textkq,constraint);
		
		JPanel jpanelfoot = new JPanel(new FlowLayout(FlowLayout.CENTER,20,10));
		
		JButton giaiptJButton = new JButton("Giai phuong trinh");
		giaiptJButton.setFont(font);
		
		JButton xoaJButton = new JButton("Xoa");
		xoaJButton.setFont(font);
		
		JButton thoatJButton = new JButton("Thoat");
		thoatJButton.setFont(font);
		
		jpanelfoot.add(giaiptJButton);
		jpanelfoot.add(xoaJButton);
		jpanelfoot.add(thoatJButton);
		
		this.setLayout(new BorderLayout());
		this.add(headjlabel,BorderLayout.NORTH);
		this.add(jpanel1,BorderLayout.CENTER);
		this.add(jpanelfoot,BorderLayout.SOUTH);
		
		
		
		
		
		this.setVisible(true);
		
	}
	
}
