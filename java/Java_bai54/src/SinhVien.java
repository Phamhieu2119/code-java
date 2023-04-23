
public class SinhVien implements Comparable {
	private int maSinhVien;
	private String hoVaten;
	private String tenLop;
	private double diemtrungBinh;
	
	public SinhVien(int maSinhVien, String hoVaten, String tenLop, double diemtrungBinh) {
		
		this.maSinhVien = maSinhVien;
		this.hoVaten = hoVaten;
		this.tenLop = tenLop;
		this.diemtrungBinh = diemtrungBinh;
	}
	
	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaten() {
		return hoVaten;
	}

	public void setHoVaten(String hoVaten) {
		this.hoVaten = hoVaten;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemtrungBinh() {
		return diemtrungBinh;
	}

	public void setDiemtrungBinh(double diemtrungBinh) {
		this.diemtrungBinh = diemtrungBinh;
	}
	public String getten() {
		String s = this.hoVaten.trim();
		if(s.indexOf(" ")>=0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt + 1);
		}else {
			return s;
		}
	}
	

	@Override
	public int compareTo(Object o) {
		// <0
		// =0
		// >0
		// Dua tren so sanh ten
		// Ten: Adam, Barack Obama,     Nguyen Van A     , Tran Thi Thanh Yen
		int tenThis = (int)this.getDiemtrungBinh();
		int tenO=(int)((SinhVien) o).getDiemtrungBinh();
		
		return tenThis - tenO;
	}
}
