package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ptb2Listener;
import model.modelptb2;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ptbac2 extends JFrame {
	private modelptb2 model;
	private JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;

	
	public ptbac2() {
		model = new modelptb2();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 448);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ptb2Listener ac = new ptb2Listener(this);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("      GIẢI PHƯƠNG TRINH BẬC 2");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(123, 10, 284, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hệ số a");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(70, 70, 90, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hệ số b");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(70, 131, 90, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hệ số c");
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(70, 187, 90, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Kết quả");
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(52, 253, 90, 45);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(216, 60, 175, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(216, 120, 175, 45);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(216, 187, 175, 45);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(154, 253, 369, 45);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("GIẢI PHƯƠNG TRÌNH");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(39, 348, 201, 40);
		btnNewButton.addActionListener(ac);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("XÓA");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(290, 348, 85, 40);
		btnNewButton_1.addActionListener(ac);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("THOÁT");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_2.setBounds(401, 348, 85, 40);
		btnNewButton_2.addActionListener(ac);
		contentPane.add(btnNewButton_2);
		
		
		setVisible(true);
	}

	public void giai() {
		this.model.setA(Double.parseDouble(this.textField.getText()));
		this.model.setB(Double.parseDouble(this.textField_1.getText()));
		this.model.setC(Double.parseDouble(this.textField_2.getText()));
		this.model.GiaiPT();
		this.textField_3.setText(this.model.getKq());
	}

	public void xoa() {
		this.textField.setText("");
		this.textField_1.setText("");
		this.textField_2.setText("");
		this.textField_3.setText("");
		
	}
}
