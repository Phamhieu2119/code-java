package model;

import java.util.Date;
import java.util.Objects;

public class ThiSinh {
	private int maThiSinh;
	private String tenThiSinh;
	private Tinh queQuan;
	private Date ngaySinh;
	private boolean gioiTinh;
	private float diemmon1,diemon2,diemmon3;
	
	public ThiSinh() {
	}

	public ThiSinh(int maThiSinh, String tenThiSinh, Tinh queQuan, Date ngaySinh, boolean gioiTinh, float diemmon1,
			float diemon2, float diemmon3) {
		this.maThiSinh = maThiSinh;
		this.tenThiSinh = tenThiSinh;
		this.queQuan = queQuan;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diemmon1 = diemmon1;
		this.diemon2 = diemon2;
		this.diemmon3 = diemmon3;
	}

	public int getMaThiSinh() {
		return maThiSinh;
	}

	public void setMaThiSinh(int maThiSinh) {
		this.maThiSinh = maThiSinh;
	}

	public String getTenThiSinh() {
		return tenThiSinh;
	}

	public void setTenThiSinh(String tenThiSinh) {
		this.tenThiSinh = tenThiSinh;
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

	public float getDiemmon1() {
		return diemmon1;
	}

	public void setDiemmon1(float diemmon1) {
		this.diemmon1 = diemmon1;
	}

	public float getDiemon2() {
		return diemon2;
	}

	public void setDiemon2(float diemon2) {
		this.diemon2 = diemon2;
	}

	public float getDiemmon3() {
		return diemmon3;
	}

	public void setDiemmon3(float diemmon3) {
		this.diemmon3 = diemmon3;
	}

	@Override
	public String toString() {
		return "ThiSinh [maThiSinh=" + maThiSinh + ", tenThiSinh=" + tenThiSinh + ", queQuan=" + queQuan + ", ngaySinh="
				+ ngaySinh + ", gioiTinh=" + gioiTinh + ", diemmon1=" + diemmon1 + ", diemon2=" + diemon2
				+ ", diemmon3=" + diemmon3 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(diemmon1, diemmon3, diemon2, gioiTinh, maThiSinh, ngaySinh, queQuan, tenThiSinh);
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
		return Float.floatToIntBits(diemmon1) == Float.floatToIntBits(other.diemmon1)
				&& Float.floatToIntBits(diemmon3) == Float.floatToIntBits(other.diemmon3)
				&& Float.floatToIntBits(diemon2) == Float.floatToIntBits(other.diemon2) && gioiTinh == other.gioiTinh
				&& maThiSinh == other.maThiSinh && Objects.equals(ngaySinh, other.ngaySinh)
				&& Objects.equals(queQuan, other.queQuan) && Objects.equals(tenThiSinh, other.tenThiSinh);
	}
	
}
