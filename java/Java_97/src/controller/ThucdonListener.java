package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

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
		
		String soTien_chuoi = (String) JOptionPane.showInputDialog(vtd, vtd.jLabel_thongtin.getText()+"\nNhap nay so tien ","Thong bao",JOptionPane.PLAIN_MESSAGE);
		try {
			Double soTien = Double.valueOf(soTien_chuoi);
			JOptionPane.showMessageDialog(vtd, "So tien tra lai : "+ (soTien - vtd.thucdonModel.getTongTien()),"Ìnformation",JOptionPane.PLAIN_MESSAGE);
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(vtd, "loi nhap lieu","Error",JOptionPane.ERROR_MESSAGE);
		}
	}

}
