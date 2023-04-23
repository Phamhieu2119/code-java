package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.*;

public class ViewExampelIcon extends JFrame{
	
	private JMenu menu;
	private JMenuItem jMenuItem_new;
	private JMenuItem jMenuItem_save;
	
	private JMenuItem jMenuItem_saveas;
	private JMenuItem jMenuItem_exit;
	private JMenuItem jMenuItem_Pate;
	private Container submenu;
	private JLabel jLabel;
	
	private JMenuBar mb1;
	private JMenuBar mb;

	public ViewExampelIcon() {
		this.setTitle("Icon");
		this.setLocationRelativeTo(null);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		//tao icon => JFrame
		URL urfIconNotepad = ViewExampelIcon.class.getResource("main.png");
		Image img = Toolkit.getDefaultToolkit().createImage(urfIconNotepad);
		this.setIconImage(img);
				
		//tao JMenuBar
		 mb = new JMenuBar();
		 menu = new JMenu("Menu");
		 jMenuItem_new  = new JMenuItem("New");
		 jMenuItem_new.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage( ViewExampelIcon.class.getResource("new.png"))));
		 jMenuItem_save = new JMenuItem("Save");
		 jMenuItem_save.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage( ViewExampelIcon.class.getResource("save.png"))));
		 jMenuItem_saveas = new JMenuItem("Save as");
		 jMenuItem_saveas.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage( ViewExampelIcon.class.getResource("saveas.png"))));
		 jMenuItem_exit = new JMenuItem("exit");
		 jMenuItem_exit.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage( ViewExampelIcon.class.getResource("exit.png"))));
		 jMenuItem_Pate = new JMenuItem("Pate");
		
		submenu = new JMenu("Submenu");
		submenu.add(jMenuItem_exit);
		submenu.add(jMenuItem_Pate);
		
		menu.add(jMenuItem_new);
		menu.add(jMenuItem_save);
		menu.add(jMenuItem_saveas);
		menu.add(submenu);
		mb.add(menu);
		
		
		//tao label
		 jLabel = new JLabel();
		
		// tao button
		Font font = new Font("Times new Roman", Font.BOLD, 40);
		JButton jButton = new JButton("Text JButton");
		jButton.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage( ViewExampelIcon.class.getResource("exit.png"))));
		jButton.setFont(font);
		
		
		this.setJMenuBar(mb);
		this.add(jLabel,BorderLayout.CENTER);
		this.add(jButton,BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			new ViewExampelIcon();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
