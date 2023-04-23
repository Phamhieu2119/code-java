package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.JmenubarListener;

public class JMenubarView extends JFrame{
	private JLabel jLabel;

	public JMenubarView() {
		this.setTitle("Menu_Bar");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JmenubarListener ac = new JmenubarListener(this);
		
		JMenuBar jMenuBar = new JMenuBar();
		
		JMenu jMenu_file = new JMenu("File");
		
		JMenu jMenuItem_open = new JMenu("OPen");
		jMenuItem_open.addActionListener(ac);
		
		JMenuItem jMenuItem_abc = new JMenuItem("abc");
		JMenuItem jMenuItem_efg = new JMenuItem("efg");
		
		jMenuItem_open.add(jMenuItem_abc);
		jMenuItem_open.addSeparator();
		jMenuItem_open.add(jMenuItem_efg);

		
		JMenuItem jMenuItem_exit = new JMenuItem("Exit");
		jMenuItem_exit.addActionListener(ac);
		
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);
		
		JMenu jMenu_help = new JMenu("Help");
		
		JMenuItem jMenu_welcome = new JMenuItem("Welcome");
		
		jMenu_welcome.addActionListener(ac);
		
		jMenu_help.add(jMenu_welcome);
		
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		
		jLabel = new JLabel();
		
		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.CENTER);
		this.setJMenuBar(jMenuBar);
		
		this.setVisible(true);
	}

	public void setLabel(String s) {
		this.jLabel.setText(s);
		
	}
}
