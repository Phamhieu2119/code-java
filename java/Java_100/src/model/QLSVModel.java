package model;

import java.util.ArrayList;

public class QLSVModel {
	private ArrayList<ThiSinh> dsThisinh;

	public QLSVModel() {
		this.dsThisinh = new ArrayList<>();
	}

	public QLSVModel(ArrayList<ThiSinh> dsThisinh) {
		
		this.dsThisinh = dsThisinh;
	}

	public ArrayList<ThiSinh> getDsThisinh() {
		return dsThisinh;
	}

	public void setDsThisinh(ArrayList<ThiSinh> dsThisinh) {
		this.dsThisinh = dsThisinh;
	}
	public void insert(ThiSinh thiSinh) {
		this.dsThisinh.add(thiSinh);
	}
	public void delete(ThiSinh thiSinh) {
		this.dsThisinh.remove(thiSinh);
	}
	public void update(ThiSinh thiSinh) {
		this.dsThisinh.remove(thiSinh);
		this.dsThisinh.add(thiSinh);
	}
}
