package model;

public class MynotepadModel {
	private String filename;
	private String content;
	public MynotepadModel() {
		this.filename = "";
		this.content = "";
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
