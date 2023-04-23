package test;



import javax.swing.UIManager;

import view.JMenubarView;

public class TestjmenuBar {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());;
			new JMenubarView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
