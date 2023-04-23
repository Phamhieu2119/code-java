package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.ThiSinh;
import model.Tinh;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Container;

public class QLSVView extends JFrame {

	public JPanel contentPane;
	public QLSVModel model;
	public JTextField textField_mathisinh_timkiem;
	public JTable table;
	public JTextField textField_mathisinh;
	public JTextField textField_hovaten;
	public JTextField textField_ngaysinh;
	public JTextField textField_mon1;
	public JTextField textField_mon2;
	public JTextField textField_mon3;
	public ButtonGroup btn_gioitinh;
	public JComboBox comboBox_quequan;
	public JRadioButton jRadioButton_nam;
	public JRadioButton jRadioButton_nu;
	public JComboBox comboBox_timkiem;

	public QLSVView() {
		this.model = new QLSVModel();
		setTitle("QLSV");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1029, 756);

		QLSVController ac = new QLSVController(this);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		menuBar.add(menuFile);

		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.addActionListener(ac);
		menuOpen.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		menuFile.add(menuOpen);

		JSeparator separator = new JSeparator();
		menuFile.add(separator);

		JMenuItem menuSave = new JMenuItem("Save");
		menuSave.addActionListener(ac);
		menuSave.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		menuFile.add(menuSave);

		JSeparator separator_1 = new JSeparator();
		menuFile.add(separator_1);

		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.addActionListener(ac);
		menuExit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		menuFile.add(menuExit);

		JMenu menuAbout = new JMenu("About");
		menuAbout.addActionListener(ac);
		menuAbout.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		menuBar.add(menuAbout);

		JMenuItem menuAboutme = new JMenuItem("About me");
		menuAboutme.addActionListener(ac);
		menuAboutme.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		menuAbout.add(menuAboutme);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel jlabel_quequan = new JLabel("      Quê Quán");
		jlabel_quequan.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jlabel_quequan.setBounds(24, 19, 150, 42);
		contentPane.add(jlabel_quequan);

		 comboBox_timkiem = new JComboBox();
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox_timkiem.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_timkiem.addItem(tinh.getTenTinh());
		}
		comboBox_timkiem.setBounds(171, 21, 132, 42);
		contentPane.add(comboBox_timkiem);

		JLabel jlabel_masinhvien = new JLabel("Mã Thí sinh");
		jlabel_masinhvien.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jlabel_masinhvien.setBounds(354, 19, 114, 42);
		contentPane.add(jlabel_masinhvien);

		textField_mathisinh_timkiem = new JTextField();
		textField_mathisinh_timkiem.setBounds(478, 22, 132, 42);
		contentPane.add(textField_mathisinh_timkiem);
		textField_mathisinh_timkiem.setColumns(10);

		JButton jbutton_timkiem = new JButton("Tìm kiếm");
		
		jbutton_timkiem.addActionListener(ac);
		jbutton_timkiem.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jbutton_timkiem.setBounds(646, 19, 125, 42);
		contentPane.add(jbutton_timkiem);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.GRAY);
		separator_2.setBounds(10, 73, 1057, 1);
		contentPane.add(separator_2);

		JLabel jlabel_danhsach = new JLabel("    Danh sách thí sinh");
		jlabel_danhsach.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jlabel_danhsach.setBounds(41, 83, 172, 34);
		contentPane.add(jlabel_danhsach);

		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Mã thí sinh", "H\u1ECD t\u00EAn", "Qu\u00EA qu\u00E1n", "Ng\u00E0y sinh",
						"Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3" }));
		table.setRowHeight(25);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 127, 989, 199);
		contentPane.add(scrollPane);

		JLabel jlabel_thongtin = new JLabel("    Thông tin thí sinh");
		jlabel_thongtin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jlabel_thongtin.setBounds(41, 360, 182, 34);
		contentPane.add(jlabel_thongtin);

		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(10, 345, 1057, 1);
		contentPane.add(separator_2_1);

		JLabel jlabel_ma = new JLabel("Mã Thí sinh");
		jlabel_ma.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jlabel_ma.setBounds(24, 404, 199, 42);
		contentPane.add(jlabel_ma);

		textField_mathisinh = new JTextField();
		textField_mathisinh.setColumns(10);
		textField_mathisinh.setBounds(171, 404, 172, 42);
		contentPane.add(textField_mathisinh);

		JLabel jlabel_ten = new JLabel("Họ và tên");
		jlabel_ten.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jlabel_ten.setBounds(24, 456, 199, 42);
		contentPane.add(jlabel_ten);

		textField_hovaten = new JTextField();
		textField_hovaten.setColumns(10);
		textField_hovaten.setBounds(171, 456, 172, 42);
		contentPane.add(textField_hovaten);

		JLabel jlabel_ngaysinh = new JLabel("Ngày sinh");
		jlabel_ngaysinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jlabel_ngaysinh.setBounds(24, 569, 181, 42);
		contentPane.add(jlabel_ngaysinh);

		textField_ngaysinh = new JTextField();
		textField_ngaysinh.setColumns(10);
		textField_ngaysinh.setBounds(171, 569, 172, 42);
		contentPane.add(textField_ngaysinh);

		JLabel jlabel_mon1 = new JLabel("Môn 1");
		jlabel_mon1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jlabel_mon1.setBounds(500, 455, 199, 34);
		contentPane.add(jlabel_mon1);

		textField_mon1 = new JTextField();
		textField_mon1.setColumns(10);
		textField_mon1.setBounds(686, 456, 172, 34);
		contentPane.add(textField_mon1);

		JLabel jlabel_mon2 = new JLabel("Môn 2");
		jlabel_mon2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jlabel_mon2.setBounds(500, 499, 199, 34);
		contentPane.add(jlabel_mon2);

		textField_mon2 = new JTextField();
		textField_mon2.setColumns(10);
		textField_mon2.setBounds(686, 499, 172, 42);
		contentPane.add(textField_mon2);

		JLabel jlabel_mon3 = new JLabel("Môn 3");
		jlabel_mon3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jlabel_mon3.setBounds(500, 543, 199, 42);
		contentPane.add(jlabel_mon3);

		textField_mon3 = new JTextField();
		textField_mon3.setColumns(10);
		textField_mon3.setBounds(686, 551, 172, 42);
		contentPane.add(textField_mon3);

		JLabel jlabel_masinhvien_2_1 = new JLabel("Quê quán");
		jlabel_masinhvien_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jlabel_masinhvien_2_1.setBounds(24, 508, 199, 42);
		contentPane.add(jlabel_masinhvien_2_1);

		comboBox_quequan = new JComboBox();

		comboBox_quequan.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_quequan.addItem(tinh.getTenTinh());
		}
		comboBox_quequan.setBounds(171, 508, 172, 42);
		contentPane.add(comboBox_quequan);

		JLabel jlabel_gioitinh = new JLabel("Giới tính");
		jlabel_gioitinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jlabel_gioitinh.setBounds(500, 401, 199, 42);
		contentPane.add(jlabel_gioitinh);

		jRadioButton_nam = new JRadioButton("Nam");
		jRadioButton_nam.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jRadioButton_nam.setBounds(686, 415, 103, 21);
		contentPane.add(jRadioButton_nam);

		jRadioButton_nu = new JRadioButton("Nữ");
		jRadioButton_nu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jRadioButton_nu.setBounds(807, 417, 103, 21);
		contentPane.add(jRadioButton_nu);

		btn_gioitinh = new ButtonGroup();
		btn_gioitinh.add(jRadioButton_nam);
		btn_gioitinh.add(jRadioButton_nu);
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setBounds(10, 627, 1057, 1);
		contentPane.add(separator_2_1_1);

		JButton jbutton_them = new JButton("Thêm");
		jbutton_them.addActionListener(ac);
		jbutton_them.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jbutton_them.setBounds(49, 638, 125, 48);
		contentPane.add(jbutton_them);

		JButton jbutton_xoa = new JButton("Xoá");
		jbutton_xoa.addActionListener(ac);
		jbutton_xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbutton_xoa.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jbutton_xoa.setBounds(238, 638, 125, 48);
		contentPane.add(jbutton_xoa);

		JButton jbutton_capnhat = new JButton("Cập nhật");
		jbutton_capnhat.addActionListener(ac);
		jbutton_capnhat.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jbutton_capnhat.setBounds(438, 638, 125, 48);
		contentPane.add(jbutton_capnhat);

		JButton jbutton_luu = new JButton("Lưu");
		jbutton_luu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jbutton_luu.setBounds(646, 638, 125, 48);
		contentPane.add(jbutton_luu);
		jbutton_luu.addActionListener(ac);

		JButton jbutton_huybo = new JButton("Huỷ bỏ");
		jbutton_huybo.addActionListener(ac);
		jbutton_huybo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jbutton_huybo.setBounds(838, 638, 125, 48);
		contentPane.add(jbutton_huybo);

		JButton jbutton_timkiem_huy = new JButton("Hủy");
		jbutton_timkiem_huy.addActionListener(ac);
		jbutton_timkiem_huy.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		jbutton_timkiem_huy.setBounds(819, 19, 125, 42);
		contentPane.add(jbutton_timkiem_huy);

		this.setVisible(true);
	}

	public void xoaForm() {
		textField_mathisinh.setText("");
		textField_hovaten.setText("");
		textField_ngaysinh.setText("");
		textField_mon1.setText("");
		textField_mon2.setText("");
		textField_mon3.setText("");
		comboBox_quequan.setSelectedIndex(-1);
		btn_gioitinh.clearSelection();

	}
	public void themThiSinhvaoTable(ThiSinh ts) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		model_table.addRow(
				new Object[] { ts.getMaThisinh() + "", ts.getTenThisinh() + "", ts.getQueQuan().getTenTinh(),
						ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/"
								+ (ts.getNgaySinh().getYear() + 1900),
						(ts.isGioiTinh() ? "Nam" : "Nữ"), ts.getDiemMon1() + "", ts.getDiemMon2() + "",
						ts.getDiemMon3() + "" });
	}
	public void themHoacCapnhatThivien(ThiSinh ts) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		if (!this.model.kiemTraTonTai(ts)) {
			this.model.insert(ts);

			this.themThiSinhvaoTable(ts);
		} else {
			this.model.update(ts);
			int soluongDong = model_table.getRowCount();
			for (int i = 0; i < soluongDong; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if (id.equals(ts.getMaThisinh() + "")) {
					model_table.setValueAt(ts.getMaThisinh() + "", i, 0);
					model_table.setValueAt(ts.getTenThisinh() + "", i, 1);
					model_table.setValueAt(ts.getQueQuan().getTenTinh() + "", i, 2);
					model_table.setValueAt(ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/"
							+ (ts.getNgaySinh().getYear() + 1900) + "", i, 3);
					model_table.setValueAt((ts.isGioiTinh() ? "Nam" : "Nữ") + "", i, 4);
					model_table.setValueAt(ts.getDiemMon1() + "", i, 5);
					model_table.setValueAt(ts.getDiemMon2() + "", i, 6);
					model_table.setValueAt(ts.getDiemMon3() + "", i, 7);

				}
			}
		}

	}

	public ThiSinh getThiSinhDangchon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow(); // lay ra duoc dong chon

		int maThisinh = Integer.valueOf(model_table.getValueAt(i_row, 0) + "");
		String tenThiSinh = model_table.getValueAt(i_row, 1) + "";
		Tinh tinh = Tinh.getTinhByTen(model_table.getValueAt(i_row, 2) + "");
		String s_ngaysinh = model_table.getValueAt(i_row, 3) + "";
		Date ngaySinh = new Date(s_ngaysinh);
		String textGioiTinh = model_table.getValueAt(i_row, 4) + "";
		boolean gioiTinh = textGioiTinh.equals("Nam");
		float diemMon1 = Float.valueOf(model_table.getValueAt(i_row, 5) + "");
		float diemMon2 = Float.valueOf(model_table.getValueAt(i_row, 6) + "");
		float diemMon3 = Float.valueOf(model_table.getValueAt(i_row, 7) + "");

		ThiSinh ts = new ThiSinh(maThisinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
		return ts;
	}

	public void hienThithongtinthisinhdachon() {
		ThiSinh ts = getThiSinhDangchon();

		this.textField_mathisinh.setText(ts.getMaThisinh() + "");
		this.textField_hovaten.setText(ts.getTenThisinh());
		this.comboBox_quequan.setSelectedItem(ts.getQueQuan().getTenTinh());
		String s_ngaySinh = ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/"
				+ (ts.getNgaySinh().getYear() + 1900);
		this.textField_ngaysinh.setText(s_ngaySinh + "");
		if (ts.isGioiTinh()) {
			jRadioButton_nam.setSelected(true);
		} else {
			jRadioButton_nu.setSelected(true);
		}

		this.textField_mon1.setText(ts.getDiemMon1() + "");
		this.textField_mon2.setText(ts.getDiemMon2() + "");
		this.textField_mon3.setText(ts.getDiemMon3() + "");

	}

	public void thucHienXoa() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn đã chắc chăn xóa dòng đã chọn ? ");
		if (luaChon == JOptionPane.YES_OPTION) {
			ThiSinh ts = getThiSinhDangchon();
			this.model.delete(ts);
			model_table.removeRow(i_row);
		}
	}

	public void thucHienThemthiSinh() {
		int maThiSinh = Integer.valueOf(this.textField_mathisinh.getText());
		String tenThiSinh = this.textField_hovaten.getText();
		int quequan = this.comboBox_quequan.getSelectedIndex() - 1;
		Tinh tinh = Tinh.getTinhByid(quequan);
		Date ngaySinh = new Date(this.textField_ngaysinh.getText());
		boolean gioiTinh = true;

		if (this.jRadioButton_nam.isSelected()) {
			gioiTinh = true;
		} else if (this.jRadioButton_nu.isSelected()) {
			gioiTinh = false;
		}
		float diemMon1 = Float.valueOf(this.textField_mon1.getText());
		float diemMon2 = Float.valueOf(this.textField_mon2.getText());
		float diemMon3 = Float.valueOf(this.textField_mon3.getText());
		ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
		this.themHoacCapnhatThivien(ts);

	}

	public void thucHienTim() {
		//goi ham huy tim kiem
		this.thucHientaiLaiDuLieu();
		
		//thuc hien tim kiem
		int quequan = this.comboBox_timkiem.getSelectedIndex() - 1;
		String maThiSinhTimKiem = this.textField_mathisinh_timkiem.getText();
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int soluongDong = model_table.getRowCount();

		Set<Integer> idCuathisinhCanxoa = new TreeSet<Integer>();
		if (quequan >= 0) {
			Tinh tinhDachon = Tinh.getTinhByid(quequan);
			for (int i = 0; i < soluongDong; i++) {
				String tenTinh = model_table.getValueAt(i, 2) + "";
				String id = model_table.getValueAt(i, 0) + "";
				if (!tenTinh.equals(tinhDachon.getTenTinh())) {
					idCuathisinhCanxoa.add(Integer.valueOf(id));
				}
			}
		}
		if (maThiSinhTimKiem.length() > 0) {
			for (int i = 0; i < soluongDong; i++) {
				
				String id = model_table.getValueAt(i, 0) + "";
				if (!id.equals(maThiSinhTimKiem)) {
					idCuathisinhCanxoa.add(Integer.valueOf(id));
				}
			}
		}
		for (Integer idCanxoa : idCuathisinhCanxoa) {
			
			soluongDong = model_table.getRowCount();
			for (int i = 0; i < soluongDong; i++) {
				
				String idTrongtable = model_table.getValueAt(i, 0) + "";
				if (idTrongtable.equals(idCanxoa.toString())) {
					try {
						model_table.removeRow(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}
	}
	
	public void thucHientaiLaiDuLieu() {
		while(true) {
			DefaultTableModel model_table = (DefaultTableModel) table.getModel();
			int soluongDong = model_table.getRowCount();
			if(soluongDong==0) {
				break;
			}else {
				try {
					model_table.removeRow(0);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		for (ThiSinh ts : this.model.getDsThisinh()) {
			this.themThiSinhvaoTable(ts);
		}
		
	}

	public void hienThiAbout() {
		JOptionPane.showMessageDialog(this, "Phần mềm quản lý thí sinh 1.0!");
		
	}

	public void thoatkhoiChuongtrinh() {
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn đã chắc chăn thoát khỏi chương trình ? ","Exit",JOptionPane.YES_NO_OPTION);
		if (luaChon == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		
	}
	public void saveFile(String path) {
		try {
			this.model.setTenFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(ThiSinh ts : this.model.getDsThisinh()) {
				oos.writeObject(ts);
			}
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void thucHienSaveFile() {
		if(this.model.getTenFile().length()>0) {
			saveFile(this.model.getTenFile());
		}else {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				saveFile(file.getAbsolutePath());
			}
		}
		
	}

	public void thucHienOpenFile() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			openFile(file);
			thucHientaiLaiDuLieu();
		}
		
	}

	private void openFile(File file) {
		ArrayList<ThiSinh> ds = new ArrayList<ThiSinh>();
		try {
			this.model.setTenFile(file.getAbsolutePath());
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ThiSinh ts = null;
			while((ts = (ThiSinh) ois.readObject())!=null) {
				ds.add(ts);
			}
			
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.model.setDsThisinh(ds);
	}

}
