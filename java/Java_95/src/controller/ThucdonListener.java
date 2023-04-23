package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;

import view.ViewThucdon;

public class ThucdonListener implements ActionListener{
	private ViewThucdon vtd;
	
	public ThucdonListener(ViewThucdon vtd) {
		this.vtd = vtd;
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		String monchinh = "";
		Enumeration<AbstractButton>   buttons_monchinh = vtd.buttonGroup_monchinh.getElements();
		while(buttons_monchinh.hasMoreElements()) {
			AbstractButton b = buttons_monchinh.nextElement();
			if(b.isSelected()) {
				monchinh = b.getText();
			}
		}
		String monphu = "";
		for (AbstractButton b : vtd.list_buttonGroup_monphu) {
			if(b.isSelected()) {
				monphu = monphu + b.getText()+" , ";
			}
			
		}
		vtd.thucdonModel.setLuachon_chinh(monchinh);
		vtd.thucdonModel.setLuachon_phu(monphu);
		vtd.thucdonModel.tinhtongtien();
		vtd.hienthiKetqua();
	}

}
