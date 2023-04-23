package Test;

import javax.swing.UIManager;

import view.ptbac2;

public class TestCode {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			new ptbac2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
