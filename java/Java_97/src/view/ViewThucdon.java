package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.nio.ByteOrder;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;

import controller.ThucdonListener;
import model.ThucdonModel;

public class ViewThucdon extends JFrame {
	public ThucdonModel thucdonModel;
	

	public JLabel jLabel_thongtin;
	public JButton jButton_thanhtoan;
	
	public JComboBox jComboBox_monchinh;
	public JList<String> jlist_monphu;

	public ViewThucdon() {
		this.thucdonModel = new ThucdonModel();
		this.init();
	}

	private void init() {
		this.setTitle("Thuc don");
		this.setSize(800, 500);
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
		jPanel_monchinh.setLayout(new FlowLayout());
		String[] monchinh_luachon = new String[] { "Com", "Pho", "Banh Mi" };
		 jComboBox_monchinh = new JComboBox<>(monchinh_luachon);
		jComboBox_monchinh.setFont(font);

		jPanel_monchinh.add(jComboBox_monchinh);

		JPanel jPanel_monphu = new JPanel();
		jPanel_monphu.setLayout(new GridLayout(4,1));
		String[] monphu_luachon = new String[] { "CoCacola", "Trasua", "Banhngot", "Nem" };
		 jlist_monphu = new JList<String>(monphu_luachon);
		//jlist_monphu.setFont(font);

		jPanel_monphu.add(jlist_monphu);

		JPanel jPanel_luachon = new JPanel();
		jPanel_luachon.setLayout(new BorderLayout());
		jPanel_luachon.add(jPanel_monchinh, BorderLayout.NORTH);
		jPanel_luachon.add(jPanel_monphu, BorderLayout.CENTER);
		this.add(jPanel_luachon, BorderLayout.CENTER);

		JPanel jPanel_thanhtoan = new JPanel();
		jLabel_thongtin = new JLabel();
		// jLabel_thongtin.setFont(font);
		jButton_thanhtoan = new JButton("Thanh Toan");
		jButton_thanhtoan.setFont(font);

		ThucdonListener ac = new ThucdonListener(this);
		jButton_thanhtoan.addActionListener(ac);

		jPanel_thanhtoan.setLayout(new GridLayout(1, 2));
		jPanel_thanhtoan.add(jLabel_thongtin);
		jPanel_thanhtoan.add(jButton_thanhtoan);
		this.add(jPanel_thanhtoan, BorderLayout.SOUTH);

		this.setVisible(true);

	}

	public void hienthiKetqua() {

		String kq = "Mon chinh : " + this.thucdonModel.getLuachon_chinh() + " ; Mon phu : "
				+ this.thucdonModel.getLuachon_phu() + " ; Tong tien : " + this.thucdonModel.getTongTien();
		this.jLabel_thongtin.setText(kq);
	}
}
