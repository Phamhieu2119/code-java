package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

import view.MynotepadView;

public class MynotepadComtroller implements ActionListener{
	private MynotepadView mtw;
	
	public MynotepadComtroller(MynotepadView mtw) {
		this.mtw = mtw;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		JFileChooser fc = new JFileChooser();
		if(src.equals("Open")) {
			int returnVal = fc.showOpenDialog(this.mtw);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				String filename = file.getName();
				this.mtw.model.setFilename(file.getAbsolutePath());
				 this.mtw.lblNewLabel.setText(this.mtw.model.getFilename());
				 if(filename.endsWith(".txt")) {
					 try {
						List<String> allText = Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
						 String result = "";
						 for (String line : allText) {
							result+= line;
							result+="\n";
						}
						 this.mtw.model.setContent(result);
						 this.mtw.textArea.setText(this.mtw.model.getContent());
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
				 }
					 
			}
		}else if(src.equals("Save")) {
			if(this.mtw.model.getFilename().length()>0) {
				save(this.mtw.model.getFilename());
			}else {
				int returnVal = fc.showSaveDialog(this.mtw);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					save(file.getAbsolutePath());
				}
			}
		}
		
	}
	public void save(String filename ) {
		try {
			PrintWriter pw = new PrintWriter(filename,"UTF-8");
			String data = this.mtw.textArea.getText();
			pw.print(data);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
	}
}
