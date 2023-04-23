package controller;




import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.ViewExampleMouse;

public class MouseExampleListener implements MouseListener, MouseMotionListener{
	private ViewExampleMouse vex;
	
	public MouseExampleListener(ViewExampleMouse vex) {

		this.vex = vex;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.vex.click();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.vex.enter();
		int x = e.getX();
		int y = e.getY();
		this.vex.update(x,y);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.vex.exit();
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		int x = e.getX();
		int y = e.getY();
		this.vex.update(x,y);
		
	}
	
	
	

}
