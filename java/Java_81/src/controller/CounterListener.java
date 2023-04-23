package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.counterview;

public class CounterListener implements ActionListener{
	private counterview ctv;
	public CounterListener(counterview ctv) {
		this.ctv = ctv;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Nhan nut!");
		String src = e.getActionCommand();
		if(src.equals("UP")) {
			this.ctv.increment();
		}else if(src.equals("Down")) {
			this.ctv.decrement();
		}else if(src.equals("Reset")) {
			this.ctv.reset();
		}
	}

}
