package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.TimkiemListener;
import model.TimkiemModel;

public class ViewTimkiem extends JFrame {
	private TimkiemModel timkiemModel;
	private JLabel jlabel_vanban;
	private JTextArea jtextArea_vanban;
	private JLabel jlabel_tukhoa;
	private JButton jbutton_thongke;
	private JLabel jlabel_thongke;
	private JTextField jTextField_tukhoa;

	public ViewTimkiem() {
		this.timkiemModel = new TimkiemModel();
		this.init();
	}

	private void init() {
		this.setTitle("Tim kiem");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font font = new Font("Times new Roman", Font.BOLD, 35);

		TimkiemListener ac = new TimkiemListener(this);
		jlabel_vanban = new JLabel("Van Ban");
		jlabel_vanban.setFont(font);

		jtextArea_vanban = new JTextArea(100,100);
		jtextArea_vanban.setFont(font);

		JScrollPane jscrollpane = new JScrollPane(jtextArea_vanban);
		
		jlabel_tukhoa = new JLabel("Tu Khoa ");
		jlabel_tukhoa.setFont(font);

		jTextField_tukhoa = new JTextField();
		jTextField_tukhoa.setFont(font);
		
		

		jbutton_thongke = new JButton("Thong ke");
		jbutton_thongke.setFont(font);
		jbutton_thongke.setBackground(Color.BLUE);
		jbutton_thongke.addActionListener(ac);

		jlabel_thongke = new JLabel();
		jlabel_thongke.setFont(font);
		jlabel_thongke.setBackground(Color.YELLOW);
		jlabel_thongke.setOpaque(true);
		

		JPanel jpanel = new JPanel();
		jpanel.setLayout(new GridLayout(2, 2, 10, 10));
		jpanel.add(jlabel_tukhoa);
		jpanel.add(jTextField_tukhoa);
		jpanel.add(jbutton_thongke);
		jpanel.add(jlabel_thongke);

		this.setLayout(new BorderLayout());
		this.add(jlabel_vanban, BorderLayout.NORTH);
		this.add(jscrollpane, BorderLayout.CENTER);
		this.add(jpanel, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public void timkiem() {
		this.timkiemModel.setVanban(this.jtextArea_vanban.getText());
		this.timkiemModel.setTimKiem(this.jTextField_tukhoa.getText());
		this.timkiemModel.timkiem();
		this.jlabel_thongke.setText(this.timkiemModel.getKetqua());
		
	}
}
