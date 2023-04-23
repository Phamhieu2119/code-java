package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MouseExampleListener;
import model.ModelExampleMouse;

public class ViewExampleMouse extends JFrame{
	private ModelExampleMouse modelExampleMouse;
	private JPanel jpanel_mouse;
	private JLabel jlabel_position;
	private JLabel jlabel_x;
	private JLabel jlabel_y;
	private JLabel jlabel_num;
	private JLabel jLabel_n;
	private JLabel jlabel_emty1;
	private JLabel jlabel_compontion;
	private JLabel jlabel_check;
	private JLabel jlabel_emty2;
	
	public ViewExampleMouse() {
		this.modelExampleMouse = new ModelExampleMouse();
		this.init();
	}

	private void init() {
		this.setTitle("Mouse Example");
		this.setSize(600,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font font = new Font("Times new Roman", Font.BOLD, 25);
		
		MouseExampleListener ac= new MouseExampleListener(this);
		
		jpanel_mouse = new JPanel();
		jpanel_mouse.setBackground(Color.CYAN);
		jpanel_mouse.addMouseListener(ac);
		jpanel_mouse.addMouseMotionListener(ac);
		
		
		jlabel_position = new JLabel("Position");
		jlabel_position.setFont(font);
		
		jlabel_x = new JLabel("x = ");
		jlabel_x.setFont(font);
		
		jlabel_y = new JLabel("y = ");
		jlabel_y.setFont(font);
		
		jlabel_num = new JLabel("number of clicks : ");
		jlabel_num.setFont(font);
		
		jLabel_n = new JLabel("n= ");
		jLabel_n.setFont(font);
		
		jlabel_emty1 = new JLabel();
		jlabel_emty1.setFont(font);
		
		jlabel_compontion = new JLabel("Mouse is in compo...");
		jlabel_compontion.setFont(font);
		
		jlabel_check = new JLabel("no");
		jlabel_check.setFont(font);
		
		jlabel_emty2 = new JLabel();
		jlabel_emty2.setFont(font);
		
		JPanel jpanel_footer = new JPanel();
		jpanel_footer.setLayout(new GridLayout(3,3,10,10));
		jpanel_footer.add(jlabel_position);
		jpanel_footer.add(jlabel_x);
		jpanel_footer.add(jlabel_y );
		jpanel_footer.add(jlabel_num);
		jpanel_footer.add(jLabel_n );
		jpanel_footer.add(jlabel_emty1);
		jpanel_footer.add(jlabel_compontion );
		jpanel_footer.add(jlabel_check);
		jpanel_footer.add(jlabel_emty2);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_mouse,BorderLayout.CENTER);
		this.add(jpanel_footer, BorderLayout.SOUTH);
		
		this.setVisible(true);
		
	}

	public void click() {
		this.modelExampleMouse.addclick();
		this.jLabel_n.setText("n = "+ this.modelExampleMouse.getNum());
	}
	public void enter() {
		this.modelExampleMouse.enter();
		this.jlabel_check.setText(this.modelExampleMouse.getCheck());
	}
	public void exit() {
		this.modelExampleMouse.exit();
		this.jlabel_check.setText(this.modelExampleMouse.getCheck());
	}

	public void update(int x, int y) {
		this.modelExampleMouse.setX(x);
		this.modelExampleMouse.setY(y);
		this.jlabel_x.setText("x = "+this.modelExampleMouse.getX());
		this.jlabel_y.setText("y = "+this.modelExampleMouse.getY());
		
	}
}
