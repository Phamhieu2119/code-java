package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import view.ptbac2;

public class ptb2Listener implements ActionListener{
	private ptbac2 view;
	
	public ptb2Listener(ptbac2 view) {
		this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("GIẢI PHƯƠNG TRÌNH")) {
			this.view.giai();
		}else if(src.equals("XÓA")) {
			this.view.xoa();
		}else if(src.equals("THOÁT")) {
			int reet = JOptionPane.showConfirmDialog(view, "Bạn có muốn thoát không ","THOÁT",JOptionPane.YES_NO_OPTION);
			if(reet == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
	}
	
}
