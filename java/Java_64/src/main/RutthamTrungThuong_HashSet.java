package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutthamTrungThuong_HashSet {
	Set<String> thungPhieuDuThuong = new HashSet<String>();
	
	
	
	public RutthamTrungThuong_HashSet() {
	}
	public boolean themPhieu(String giatri) {
		return this.thungPhieuDuThuong.add(giatri);
	}
	public boolean xoaPhieu(String giatri) {
		return this.thungPhieuDuThuong.remove(giatri);
	}
	public boolean kiemTraPhieuTonTai(String giatri) {
		return this.thungPhieuDuThuong.contains(giatri);
	}
	public void xoaTatCaPhieuDuThuong() {
		this.thungPhieuDuThuong.clear();
	}
	public int laySoLuong() {
		return this.thungPhieuDuThuong.size();
	}
	public String rutMojtPhieu() {
		String ketqua = "";
		Random rd = new Random();
		int vitri = rd.nextInt(this.thungPhieuDuThuong.size());
		ketqua =  (String) this.thungPhieuDuThuong.toArray()[vitri];
		return ketqua;
	}
	public void inTatCa() {
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}
	public static void main(String[] args) {
		int luachon = 0;
		Scanner sc = new Scanner(System.in);
		RutthamTrungThuong_HashSet rt = new RutthamTrungThuong_HashSet();
		do {
			System.out.println("---------------");
			System.out.println("MENU: ");
			System.out.println("1. Them ma du phong.");
			System.out.println("2. Xoa ma so du phong");
			System.out.println("3. Kiem tra ma so du phong co ton tai hay khong ?");
			System.out.println("4. Xoa tat ca cac phieu du phong.");
			System.out.println("5. So luong phieu du phong.");
			System.out.println("6. Rut tham trung thuong.");
			System.out.println("7. In tat ca phieu");
			System.out.println("0. Chon 0 de thoat .");
			luachon = sc.nextInt();
			sc.nextLine();
			if(luachon == 1 || luachon == 2 || luachon == 3) {
				System.out.println("Nhap vao ma phieu du phong:");
				String giaTri = sc.nextLine();
				if(luachon ==1) {
					rt.themPhieu(giaTri);
				}else if(luachon == 2) {
					rt.xoaPhieu(giaTri);
				}else {
					System.out.println("Ket qua kiem tra :"+rt.kiemTraPhieuTonTai(giaTri));
				}
			}else if(luachon == 4) {
				rt.xoaTatCaPhieuDuThuong();
			}else if(luachon == 5) {
				System.out.println("So phieu la : "+rt.laySoLuong());
			}else if(luachon ==6) {
				System.out.println("Ma so trung thuong la :"+rt.rutMojtPhieu());
			}else if(luachon ==7) {
				System.out.println("Cac ma phieu du phong la :");
				rt.inTatCa();
			}
		}while(luachon!= 0);
	}
}
