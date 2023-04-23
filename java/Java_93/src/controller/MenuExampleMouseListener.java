package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.JMenubarView;

public class MenuExampleMouseListener implements MouseListener{
	private JMenubarView jmv ;
	
	public MenuExampleMouseListener(JMenubarView jmv) {
		
		this.jmv = jmv;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.isPopupTrigger()) {
			this.jmv.jPopupMenu.show(e.getComponent(),e.getX(),e.getY());
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.isPopupTrigger()) {
			this.jmv.jPopupMenu.show(e.getComponent(),e.getX(),e.getY());
		}
		//cho windown
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
