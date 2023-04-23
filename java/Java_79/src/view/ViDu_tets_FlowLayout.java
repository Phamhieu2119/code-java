package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_tets_FlowLayout extends JFrame {
	public  ViDu_tets_FlowLayout() {
		this.setTitle("ViDu_tets_FlowLayout");
		this.setSize(600,400);
		//can giua o chuong trinh
		this.setLocationRelativeTo(null);
		
		//set layout
		FlowLayout flowLayout = new FlowLayout();
		FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER,50,50);
		this.setLayout(flowLayout_2);
		
		JButton jbotton_1 = new JButton("1");
		JButton jbotton_2 = new JButton("2");
		JButton jbotton_3 = new JButton("3");
		
		//add thanh phan
		this.add(jbotton_1);
		this.add(jbotton_2);
		this.add(jbotton_3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new ViDu_tets_FlowLayout();
	}
}
