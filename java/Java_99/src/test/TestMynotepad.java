package test;

import javax.swing.UIManager;

import view.MynotepadView;

public class TestMynotepad {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			new MynotepadView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
