package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.Test;

public class controlerListener implements ActionListener {
	private Test view;
	
	

	public controlerListener(Test view2) {
		this.view =  view2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("login")) {
			this.view.hienthi();
			JOptionPane.showMessageDialog(view, "thong tin vua dien " + this.view.model.toString());
		}
	}
	
}
