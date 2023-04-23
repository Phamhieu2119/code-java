package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MynotepadComtroller;
import model.MynotepadModel;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import java.text.*;

public class MynotepadView extends JFrame {

	private JPanel contentPane;
	public MynotepadModel model;
	public JTextArea textArea;
	public JButton openbutton;
	public JButton savebutton;
	public JLabel lblNewLabel;
	
	
	
	public MynotepadView() {
		this.model = new MynotepadModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		 textArea = new JTextArea();
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10,50));
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 0, 418, 50);
		
		panel.add(lblNewLabel);
		
		MynotepadComtroller ac = new MynotepadComtroller(this);
		 openbutton = new JButton("Open");
		openbutton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		openbutton.addActionListener(ac);
		openbutton.setBounds(513, 10, 102, 30);
		panel.add(openbutton);
		
		 savebutton = new JButton("Save");
		savebutton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		savebutton.addActionListener(ac);
		savebutton.setBounds(635, 10, 102, 30);
		panel.add(savebutton);
		
		this.setVisible(true);
	}
}
