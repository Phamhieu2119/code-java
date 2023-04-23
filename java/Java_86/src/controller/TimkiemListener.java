package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ViewTimkiem;

public class TimkiemListener implements ActionListener{
	private ViewTimkiem vtk;
	
	public TimkiemListener(ViewTimkiem vtk) {
		this.vtk = vtk;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.vtk.timkiem();
		
	}

}
