package view;

import java.awt.BorderLayout;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.JmenubarListener;
import controller.MenuExampleMouseListener;

public class JMenubarView extends JFrame {
	private JLabel jLabel;
	public JPopupMenu jPopupMenu;
	private JToolBar jToolBar;

	public JMenubarView() {
		this.setTitle("Menu_Bar");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JmenubarListener ac = new JmenubarListener(this);

		JMenuBar jMenuBar = new JMenuBar();

		JMenu jMenu_file = new JMenu("File");
		jMenu_file.setMnemonic(KeyEvent.VK_S);

		JMenu jMenuItem_open = new JMenu("OPen");

		jMenuItem_open.addActionListener(ac);

		JMenuItem jMenuItem_abc = new JMenuItem("abc", KeyEvent.VK_M);
		jMenuItem_abc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_DOWN_MASK));
		JMenuItem jMenuItem_efg = new JMenuItem("efg", KeyEvent.VK_N);
		jMenuItem_efg.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		jMenuItem_open.add(jMenuItem_abc);
		jMenuItem_open.addSeparator();
		jMenuItem_open.add(jMenuItem_efg);

		JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_E);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
		jMenuItem_exit.addActionListener(ac);

		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);

		JMenu jMenu_help = new JMenu("Help");

		JMenuItem jMenu_welcome = new JMenuItem("Welcome");

		jMenu_welcome.addActionListener(ac);

		jMenu_help.add(jMenu_welcome);

		
		//tao tich xanh
		JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("JToolbar");
		jCheckBoxMenuItem.addActionListener(ac);
		JMenu jMenu_checkbox = new JMenu("View");
		jMenu_checkbox.add(jCheckBoxMenuItem);
		
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_checkbox);
		jMenuBar.add(jMenu_help);

		jLabel = new JLabel();

		this.setLayout(new BorderLayout());
		// tao thanh cong cu
		 jToolBar = new JToolBar();
		JButton jbtuButton_undo = new JButton("Undo");
		jbtuButton_undo.setToolTipText("Nhan vao day de quay lai thao tac .");
		jbtuButton_undo.addActionListener(ac);
		JButton jbtuButton_coppy = new JButton("Coppy");
		jbtuButton_coppy.addActionListener(ac);
		JButton jbtuButton_cut = new JButton("Cut");
		jbtuButton_cut.addActionListener(ac);
		JButton jbtuButton_pate = new JButton("Pate");
		jbtuButton_pate.addActionListener(ac);
		JButton jbtuButton_delete = new JButton("Detele");
		jbtuButton_delete.addActionListener(ac);

		jToolBar.add(jbtuButton_undo);
		jToolBar.add(jbtuButton_coppy);
		jToolBar.add(jbtuButton_cut);
		jToolBar.add(jbtuButton_pate);
		jToolBar.add(jbtuButton_delete);
		
		MenuExampleMouseListener acm = new MenuExampleMouseListener(this);
		this.addMouseListener(acm);
		// tao chuot phai JpopupMenu
		 jPopupMenu = new JPopupMenu();
		
		JMenu jMenuPopup = new JMenu("Font");
		JMenuItem jMenuItemtype = new JMenuItem("Type");
		JMenuItem jMenuItemsize = new JMenuItem("Size");
		jMenuPopup.add(jMenuItemtype);
		jMenuPopup.add(jMenuItemsize);
		
		jPopupMenu.add(jMenuPopup);
		
		JMenuItem jMenuItemCut1= new JMenuItem("Cut");
		JMenuItem jMenuItemCoppy1 = new JMenuItem("Coppy");
		JMenuItem jMenuItempate1 = new JMenuItem("Pate");
		jPopupMenu.add(jMenuItemCut1);
		jPopupMenu.add(jMenuItemCoppy1);
		jPopupMenu.add(jMenuItempate1);
		
		
		
		this.add(jPopupMenu);
		

		this.add(jLabel, BorderLayout.CENTER);
		this.setJMenuBar(jMenuBar);

		this.setVisible(true);
	}

	public void setLabel(String s) {
		this.jLabel.setText(s);
	}
	public void enableJtoolbar() {
		this.add(jToolBar, BorderLayout.NORTH);
		this.refresh();
	}
	public void disableJtoolbar() {
		this.remove(jToolBar);
		this.refresh();
	}
	public void refresh() {
		this.pack();
		this.setSize(300,300);
	}
	
}
