package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MycolorView;

public class MycolorListener implements ActionListener {
	private MycolorView mcl;
	 
	public MycolorListener(MycolorView mcl) {
		this.mcl = mcl;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Red text")) {
			this.mcl.changeText(Color.RED);
		}else if(src.equals("Yellow text")) {
			this.mcl.changeText(Color.YELLOW);
		}else if(src.equals("Green text")) {
			this.mcl.changeText(Color.GREEN);
		}else if(src.equals("Red back")) {
			this.mcl.changeBack(Color.RED);
		}else if(src.equals("Yellow back")) {
			this.mcl.changeBack(Color.YELLOW);
		}else if(src.equals("Green back")) {
			this.mcl.changeBack(Color.GREEN);
		}
		
	}

}
