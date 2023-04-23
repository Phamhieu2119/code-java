package test;

import java.util.Scanner;

import mainn.DanhSachSinhVien;
import mainn.SinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luachon =0;
		do {
			System.out.println("MENU----------");
			System.out.println(
				"1.  Them sinh vien vao danh sach.\n"
			   +"2.  In danh sach sinh vien ra man hinh.\n"
			   +"3.  kiem tra danh sach co rong hay khong.\n"
			   +"4.  Lay ra so luong sinh vien trong danh sach"
			   +"5.  Lam rong danh sach sinh vien.\n"
			   +"6.  Kiem tra sinh vien co ton tai trong danh sach hay khong , dua tren ma sinh vien.\n"
			   +"7.  Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien.\n"
			   +"8.  Tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim.\n"
			   +"9.  Xuat ra danh sach sinh vien co diem tu cao den thap.\n"
			   +"0.  Thoat khoi chuong trinh"
			);
			luachon = sc.nextInt();
			sc.nextLine();
			if(luachon == 1) {
				System.out.println("Nhap ma sinh vien :"); String maSinhVien = sc.nextLine();
				System.out.println("Nhap ho va ten : "); String hoVaTen = sc.nextLine();
				System.out.println("Nhap nam sinh : "); int namSinh = sc.nextInt();
				System.out.println("Diem trung binh :"); float diemTrungBinh = sc.nextFloat();
				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);
			}else if(luachon == 2) {
				dssv.inDanhSachSinhVien();
			}else if(luachon == 3) {
				System.out.println("Danh sach rong "+dssv.kiemTraDanhSachRong());
			}else if(luachon == 4) {
				System.out.println("So luong hien tai :"+dssv.laySoLuongSinhVien());
				
			}else if(luachon == 5) {
				dssv.lamRongDanhSach();
			}else if(luachon == 6) {
				System.out.println("Nhap ma sinh vien :"); String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Kiem tra sinh vien co trong danh sach :"+dssv.kiemTraTonTai(sv));
			}else if(luachon == 7) {
				System.out.println("Nhap ma sinh vien :"); String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Xoa sinh vien trong danh sach :"+dssv.xoaSinhVien(sv));
			}else if(luachon == 8) {
				System.out.println("Nhap ho va ten can tim :"); String  hoVaTen = sc.nextLine();
				System.out.println("Ket qua tim kiem : ");
				dssv.timSinhVien(hoVaTen);
			}else if(luachon == 9) {
				dssv.sapxepSinhVienGiamdantheodiem();
				dssv.inDanhSachSinhVien();
			}
		}while(luachon!=0);
	}
}
