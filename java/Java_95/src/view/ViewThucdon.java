package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.nio.ByteOrder;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;

import controller.ThucdonListener;
import model.ThucdonModel;

public class ViewThucdon extends JFrame{
	public ThucdonModel thucdonModel;
	public JRadioButton jRadioButton_com;
	public JRadioButton jRadioButton_pho;
	public JRadioButton jRadioButton_banhmi;
	public ButtonGroup buttonGroup_monchinh;
	public JCheckBox jCheckBox_cocacola;
	public JCheckBox jCheckBox_trasua;
	public JCheckBox jCheckBox_banhngot;
	public JCheckBox jCheckBox_nem;
	
	public JLabel jLabel_thongtin;
	public JButton jButton_thanhtoan;
	public ArrayList<JCheckBox> list_buttonGroup_monphu;
	public ViewThucdon() {
		this.thucdonModel = new ThucdonModel();
		this.init();
	}
	private void init() {
		this.setTitle("Thuc don");
		this.setSize(800,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		Font font = new Font("Times new Roman", Font.BOLD, 35);
		
		JPanel jPanel_tieude = new JPanel();
		JLabel jLayer_tieude = new JLabel("Thuc Don Nha Hang");
		jLayer_tieude.setFont(font);
		jPanel_tieude.add(jLayer_tieude);
		this.add(jPanel_tieude, BorderLayout.NORTH);
		
		JPanel jPanel_monchinh = new JPanel();
		jPanel_monchinh.setLayout(new GridLayout(1,3,20,10));
		 jRadioButton_com = new JRadioButton("Com");
		jRadioButton_com.setFont(font);
		 jRadioButton_pho = new JRadioButton("Pho");
		jRadioButton_pho.setFont(font);
		 jRadioButton_banhmi = new JRadioButton("Banh Mi");
		jRadioButton_banhmi.setFont(font);
		
		 buttonGroup_monchinh = new ButtonGroup();
		buttonGroup_monchinh.add(jRadioButton_com);
		buttonGroup_monchinh.add(jRadioButton_pho);
		buttonGroup_monchinh.add(jRadioButton_banhmi);
		jPanel_monchinh.add(jRadioButton_com);
		jPanel_monchinh.add(jRadioButton_pho);
		jPanel_monchinh.add(jRadioButton_banhmi);
		
		
		JPanel jPanel_monphu = new JPanel();
		jPanel_monphu .setLayout(new GridLayout(2,2,30,30));
		jCheckBox_cocacola = new JCheckBox("CoCacola");
		jCheckBox_cocacola.setFont(font);
		 jCheckBox_trasua = new JCheckBox("Trasua");
		jCheckBox_trasua.setFont(font);
		 jCheckBox_banhngot = new JCheckBox("Banhngot");
		jCheckBox_banhngot.setFont(font);
		 jCheckBox_nem = new JCheckBox("Nem");
		jCheckBox_nem.setFont(font);
		
		list_buttonGroup_monphu = new ArrayList<JCheckBox>();
		list_buttonGroup_monphu.add(jCheckBox_cocacola);
		list_buttonGroup_monphu.add(jCheckBox_trasua);
		list_buttonGroup_monphu.add(jCheckBox_banhngot);
		list_buttonGroup_monphu.add(jCheckBox_nem);
		jPanel_monphu.add(jCheckBox_cocacola);
		jPanel_monphu.add(jCheckBox_trasua);
		jPanel_monphu.add(jCheckBox_banhngot);
		jPanel_monphu.add(jCheckBox_nem);
		
		
		JPanel jPanel_luachon = new JPanel();
		jPanel_luachon.add(jPanel_monchinh);
		jPanel_luachon.add(jPanel_monphu);
		this.add(jPanel_luachon, BorderLayout.CENTER);
		
		JPanel jPanel_thanhtoan = new JPanel();
		 jLabel_thongtin = new JLabel();
		 //jLabel_thongtin.setFont(font);
		 jButton_thanhtoan = new JButton("Thanh Toan");
		jButton_thanhtoan.setFont(font);
		
		ThucdonListener ac = new ThucdonListener(this);
		jButton_thanhtoan.addActionListener(ac);
		
		jPanel_thanhtoan.setLayout(new GridLayout(1,2));
		jPanel_thanhtoan.add(jLabel_thongtin);
		jPanel_thanhtoan.add(jButton_thanhtoan);
		this.add(jPanel_thanhtoan , BorderLayout.SOUTH);
		
		
		
		
		
		
		this.setVisible(true);
		
	}
	
	public void hienthiKetqua() {
		
		String kq = "Mon chinh : "+ this.thucdonModel.getLuachon_chinh()+" ; Mon phu : "+this.thucdonModel.getLuachon_phu()+" ; Tong tien" + this.thucdonModel.getTongTien();
		this.jLabel_thongtin.setText(kq);
	}
}
