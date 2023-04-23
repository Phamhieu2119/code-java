package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;

import model.ThiSinh;
import model.Tinh;
import view.QLSVView;

public class QLSVController implements ActionListener{
	private QLSVView view;
	public QLSVController(QLSVView view2) {
		this.view = view2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		//JOptionPane.showMessageDialog(view, "Ban vua nhan vao : "+src);
		if(src.equals("Thêm")) {
			this.view.xoaForm();
			this.view.model.setLuachon("Thêm");
		}else if(src.equals("Lưu")) {
			try {
				this.view.thucHienThemthiSinh();		
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}else if(src.equals("Cập nhật")) {
			this.view.hienThithongtinthisinhdachon();
		}else if(src.equals("Xoá")) {
			this.view.thucHienXoa();
		}else if(src.equals("Hủy bỏ")) {
			this.view.xoaForm();
		}else if(src.equals("Tìm kiếm")){
			this.view.thucHienTim();
		}else if(src.equals("Hủy")) {
			this.view.thucHientaiLaiDuLieu();
		}else if(src.equals("About me")) {
			this.view.hienThiAbout();
		}else if(src.equals("Exit")) {
			this.view.thoatkhoiChuongtrinh();
		}else if(src.equals("Save")) {
			this.view.thucHienSaveFile();
		}else if(src.equals("Open")) {
			this.view.thucHienOpenFile();
		}
		
		
		
		
		
	}

}
