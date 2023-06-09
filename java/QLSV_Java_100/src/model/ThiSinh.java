package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ThiSinh implements Serializable{
	private int maThisinh;
	private String tenThisinh;
	private Tinh queQuan;
	private Date ngaySinh;
	private boolean gioiTinh;
	private float diemMon1;
	private float diemMon2;
	private float diemMon3;
	public ThiSinh() {
		
	}
	public ThiSinh(int maThisinh, String tenThisinh, Tinh queQuan, Date ngaySinh, boolean gioiTinh, float diemMon1,
			float diemMon2, float diemMon3) {
	
		this.maThisinh = maThisinh;
		this.tenThisinh = tenThisinh;
		this.queQuan = queQuan;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diemMon1 = diemMon1;
		this.diemMon2 = diemMon2;
		this.diemMon3 = diemMon3;
	}
	public int getMaThisinh() {
		return maThisinh;
	}
	public void setMaThisinh(int maThisinh) {
		this.maThisinh = maThisinh;
	}
	public String getTenThisinh() {
		return tenThisinh;
	}
	public void setTenThisinh(String tenThisinh) {
		this.tenThisinh = tenThisinh;
	}
	public Tinh getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(Tinh queQuan) {
		this.queQuan = queQuan;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public float getDiemMon1() {
		return diemMon1;
	}
	public void setDiemMon1(float diemMon1) {
		this.diemMon1 = diemMon1;
	}
	public float getDiemMon2() {
		return diemMon2;
	}
	public void setDiemMon2(float diemMon2) {
		this.diemMon2 = diemMon2;
	}
	public float getDiemMon3() {
		return diemMon3;
	}
	public void setDiemMon3(float diemMon3) {
		this.diemMon3 = diemMon3;
	}
	@Override
	public int hashCode() {
		return Objects.hash(diemMon1, diemMon2, diemMon3, gioiTinh, maThisinh, ngaySinh, queQuan, tenThisinh);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ThiSinh other = (ThiSinh) obj;
		return Float.floatToIntBits(diemMon1) == Float.floatToIntBits(other.diemMon1)
				&& Float.floatToIntBits(diemMon2) == Float.floatToIntBits(other.diemMon2)
				&& Float.floatToIntBits(diemMon3) == Float.floatToIntBits(other.diemMon3) && gioiTinh == other.gioiTinh
				&& maThisinh == other.maThisinh && Objects.equals(ngaySinh, other.ngaySinh)
				&& Objects.equals(queQuan, other.queQuan) && Objects.equals(tenThisinh, other.tenThisinh);
	}
	@Override
	public String toString() {
		return "ThiSinh [maThisinh=" + maThisinh + ", tenThisinh=" + tenThisinh + ", queQuan=" + queQuan + ", ngaySinh="
				+ ngaySinh + ", gioiTinh=" + gioiTinh + ", diemMon1=" + diemMon1 + ", diemMon2=" + diemMon2
				+ ", diemMon3=" + diemMon3 + "]";
	}
	
	
}
