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
		String monchinh =vtd.jComboBox_monchinh.getSelectedItem().toString();
		
		String monphu = "";
		Object[] luachon_phu = vtd.jlist_monphu.getSelectedValues();
		for (Object object : luachon_phu) {
			monphu = monphu + object.toString()+" , ";
		}
		
		vtd.thucdonModel.setLuachon_chinh(monchinh);
		vtd.thucdonModel.setLuachon_phu(monphu);
		vtd.thucdonModel.tinhtongtien();
		vtd.hienthiKetqua();
	}

}
