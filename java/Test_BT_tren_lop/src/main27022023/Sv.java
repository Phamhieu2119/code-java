package main27022023;

import java.util.Scanner;

public class Sv {
	private String hoTen;
	private String gioiTinh;
	private int namSinh;
	private double tin1,tin2,tin3;
	private Scanner input;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public double getTin1() {
		return tin1;
	}
	public void setTin1(double tin1) {
		this.tin1 = tin1;
	}
	public double getTin2() {
		return tin2;
	}
	public void setTin2(double tin2) {
		this.tin2 = tin2;
	}
	public double getTin3() {
		return tin3;
	}
	public void setTin3(double tin3) {
		this.tin3 = tin3;
	}
	void nhapThongTin() {
		 input = new Scanner(System.in);
		System.out.println("Nhap ho ten : "); hoTen = input.nextLine();
		System.out.println("Nhap gioi tinh : "); gioiTinh = input.nextLine();
		System.out.println("Nhap nam sinh : "); 
		namSinh = Integer.parseInt(input.nextLine());
		System.out.println("Nhap tin1 : ");
		tin1 = Double.parseDouble(input.nextLine());
		System.out.println("Nhap tin 2 :"); tin2 = input.nextDouble();
		System.out.println("Nhap tin 3 :"); tin3 = input.nextDouble();
	}
	double diemTB() {
		return (tin1+tin2+2*tin3)/4;
	}
	void inThongtin() {
		System.out.println(hoTen+","+namSinh+","+gioiTinh+","+tin1+","+tin2+","+tin3+",");
	}
	public static void nhapsinhvien(Sv []x) {
		for(int i=0;i<x.length;i++) {
			System.out.println("Sinh vien thu "+(i+1));
			x[i] = new Sv();
			x[i].nhapThongTin();
		}
	}
	
	public static void inSinhVien(Sv []x) {
		
		for (Sv sv : x) {
			sv.inThongtin();
		}
	}
	
	public static void sapxepNamTangdan(Sv []x) {
		System.out.println("\n--------Sap xep nam sinh tang dan-------");
		for(int i=0;i<x.length;i++) {
			for(int j=i+1 ;j<x.length;j++) {
				if(x[i].getNamSinh() > x[j].getNamSinh()) {
					Sv temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		inSinhVien(x);
	}
	public static void maxDiemTB(Sv []x) {
		System.out.println("\n------Mac diem trung binh---");
		double  maxTB;
		maxTB = x[0].diemTB();
		for (Sv sv : x) {
			if(maxTB < sv.diemTB()) {
				maxTB = sv.diemTB();
				System.out.println("Diem trung binh lon nhat la :"+maxTB);
			}
		}
	}
	public static void diemTBlonohn8(Sv []x) {
		System.out.println("------In thong tin sinh vien co diem trung binh lon hon 8----");
		for (Sv sv : x) {
			if(sv.diemTB()>8) {
				sv.inThongtin();
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so sinh vien :");
		int n = input.nextInt();
		Sv []sv = new Sv[n];
		nhapsinhvien(sv);
		inSinhVien(sv);
		maxDiemTB(sv);
		diemTBlonohn8(sv);
		sapxepNamTangdan(sv);
	}
}
