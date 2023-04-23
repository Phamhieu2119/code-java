package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.controlerListener;
import model.Model;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public Model model;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	private JLabel lblNewLabel_1;
	

	/**
	 * Create the frame.
	 */
	public Test() {
		this.model = new Model();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);
		
		this.setTitle("     My first Swing Example");
		
		controlerListener ac = new controlerListener(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblNewLabel = new JLabel("User");
		lblNewLabel.setBounds(30, 48, 121, 32);
		lblNewLabel.setFont(new Font("time new roman", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		 lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(30, 106, 121, 32);
		lblNewLabel_1.setFont(new Font("time new roman", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(137, 48, 242, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 106, 242, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(ac);
		btnNewButton.setFont(new Font("time new roman", Font.PLAIN, 18));
		btnNewButton.setBounds(32, 185, 100, 40);
		contentPane.add(btnNewButton);
		this.setVisible(true);
	}


	public void hienthi() {
		this.model.setUser(this.textField.getText());
		this.model.setPass(this.textField_1.getText());
		
	}
}
