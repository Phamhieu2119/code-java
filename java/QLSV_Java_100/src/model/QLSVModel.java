package model;

import java.util.ArrayList;

public class QLSVModel {
	private ArrayList<ThiSinh> dsThisinh;
	private String luachon;
	private String tenFile;
	public QLSVModel() {
		this.dsThisinh = new ArrayList<ThiSinh>();
		this.luachon = "";
		this.tenFile = "";
	}
	public QLSVModel(ArrayList<ThiSinh> dsThisinh) {
		super();
		this.dsThisinh = dsThisinh;
	}
	public ArrayList<ThiSinh> getDsThisinh() {
		return dsThisinh;
	}
	public void setDsThisinh(ArrayList<ThiSinh> dsThisinh) {
		this.dsThisinh = dsThisinh;
	}
	public void insert(ThiSinh thisinh) {
		this.dsThisinh.add(thisinh);
	}
	public void delete(ThiSinh thisinh) {
		this.dsThisinh.remove(thisinh);
	}
	public void update(ThiSinh thisinh) {
		this.dsThisinh.remove(thisinh);
		this.dsThisinh.add(thisinh);
	}
	public String getLuachon() {
		return luachon;
	}
	public void setLuachon(String luachon) {
		this.luachon = luachon;
	}
	public boolean kiemTraTonTai(ThiSinh ts) {
		for (ThiSinh thiSinh : dsThisinh) {
			if(thiSinh.getMaThisinh()== ts.getMaThisinh())
				return true;
		}
		return false;
		
	}
	public String getTenFile() {
		return tenFile;
	}
	public void setTenFile(String tenFile) {
		this.tenFile = tenFile;
	}
	
}
