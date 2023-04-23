package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ViewLastbutton;

public class LastButtonListener implements ActionListener{
	private ViewLastbutton vbt;
	
	public LastButtonListener(ViewLastbutton vbt) {
		this.vbt = vbt;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("1")) {
			this.vbt.chang_1();
		}else if(src.equals("2")) {
			this.vbt.chang_2();
		}else if(src.equals("3")) {
			this.vbt.chang_3();
		}else if(src.equals("4")) {
			this.vbt.chang_4();
		}
		
	}

}
