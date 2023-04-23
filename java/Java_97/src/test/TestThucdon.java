package test;

import javax.swing.UIManager;

import view.ViewThucdon;

public class TestThucdon {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			new ViewThucdon();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
