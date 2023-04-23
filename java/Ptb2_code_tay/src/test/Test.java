package test;

import javax.swing.LookAndFeel;
import javax.swing.UIManager;

import view.ViewPtb2;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			new ViewPtb2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
