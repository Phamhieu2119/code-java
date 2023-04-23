package ViDu;

import javax.swing.JFrame;

public class Test_class_Jframe {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		//hien ten
		jf.setTitle("Vi du JFrame");
		//xet size
		jf.setSize(600,400);
		//lam xuat hien cua so
		jf.setVisible(true);
		// thoat ra khoi chuong trinh khi dong cua so jframe
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
