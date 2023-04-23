package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

import view.JMenubarView;

public class JmenubarListener implements ActionListener {
	private JMenubarView jmv;
	
	public JmenubarListener(JMenubarView jmv) {
		this.jmv = jmv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		 if(src.equals("Exit")) {
			//this.jmv.setLabel("ban da chon exit");
			System.exit(0);
		}else if(src.equals("JToolbar")) {
			AbstractButton checkbox =(AbstractButton) e.getSource();
			boolean check = checkbox.getModel().isSelected();
			if(check) {
				this.jmv.enableJtoolbar();
			}else {
				this.jmv.disableJtoolbar();
			}
		}
		else	{
			this.jmv.setLabel("ban da click :"+src);
		}
		
	}
	
}
