package model;

import java.util.StringTokenizer;

public class ThucdonModel {
	private String luachon_chinh;
	private String luachon_phu;
	private double tongTien;

	public ThucdonModel() {
		this.luachon_chinh = "";
		this.luachon_phu = "";
		this.tongTien = 0;
	}

	public String getLuachon_chinh() {
		return luachon_chinh;
	}

	public void setLuachon_chinh(String luachon_chinh) {
		this.luachon_chinh = luachon_chinh;
	}

	public String getLuachon_phu() {
		return luachon_phu;
	}

	public void setLuachon_phu(String luachon_phu) {
		this.luachon_phu = luachon_phu;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public void tinhtongtien() {
		this.tongTien =0;
		if(this.luachon_chinh.equals("Com")) {
			tongTien+=20000;
		}else if(this.luachon_chinh.equals("Pho")) {
			tongTien+=50000;
		}else if(this.luachon_chinh.equals("Banh mi")) {
			tongTien+=15000;
		}
		StringTokenizer stk = new StringTokenizer(this.luachon_phu,",");
		while(stk.hasMoreElements()){
			String monPhu = stk.nextToken();
			monPhu = monPhu.trim();
			if(monPhu.equals("CoCacola")) {
				tongTien+=10000;
			}else if(monPhu.equals("Trasua")) {
				tongTien+=50000;
			}else if(monPhu.equals("Banhngot")) {
				tongTien+=10000;
			}else if(monPhu.equals("Nem")) {
				tongTien+=10000;
			}
		}
	}
	
}
