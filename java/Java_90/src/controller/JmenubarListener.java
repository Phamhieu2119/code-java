package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.JMenubarView;

public class JmenubarListener implements ActionListener {
	private JMenubarView jmv;
	
	public JmenubarListener(JMenubarView jmv) {
		this.jmv = jmv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("OPen")) {
			this.jmv.setLabel("ban da chon open ");
		}else if(src.equals("Exit")) {
			//this.jmv.setLabel("ban da chon exit");
			System.exit(0);
		}else if(src.equals("Welcome")) {
			this.jmv.setLabel("ban da chon welcome");
		}
		
	}
	
}
