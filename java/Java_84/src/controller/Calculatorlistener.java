package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ViewCalculator;

public class Calculatorlistener implements ActionListener {
	private ViewCalculator vcc;
	
	
	public Calculatorlistener(ViewCalculator vcc) {
		this.vcc = vcc;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("+")) {
			this.vcc.cong();
		}else if(src.equals("-")) {
			this.vcc.tru();
		}else if(src.equals("*")) {
			this.vcc.nhan();
		}else if(src.equals("/")) {
			this.vcc.chia();
		}else if(src.equals("%")) {
			this.vcc.chiadu();
		}else if(src.equals("^")) {
			this.vcc.pow();
		}
		
	}


		
	
	
}
