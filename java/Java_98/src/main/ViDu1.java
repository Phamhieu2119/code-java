package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class ViDu1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtVidu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViDu1 frame = new ViDu1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViDu1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(160, 61, 83, 15);
		toolBar.setToolTipText("Vidu");
		toolBar.setBackground(Color.RED);
		toolBar.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		contentPane.add(toolBar);
		
		JPanel panel = new JPanel();
		panel.setBounds(197, 118, 83, 59);
		contentPane.add(panel);
		
		txtVidu = new JTextField();
		txtVidu.setText("Vidu");
		txtVidu.setBounds(56, 130, 96, 19);
		contentPane.add(txtVidu);
		txtVidu.setColumns(10);
	}
}
