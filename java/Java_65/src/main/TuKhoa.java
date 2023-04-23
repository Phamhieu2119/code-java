package main;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuKhoa {
	private Map<String, String> duLieu = new TreeMap<String,String>();
	
	public String themTu(String tukhoa,String ynghia) {
		return this.duLieu.put(tukhoa, ynghia);
	}
	public String xoaTu(String tukhoa) {
		return this.duLieu.remove(tukhoa);
	}
	public String timTu(String tukhoa) {
		String ynghia = this.duLieu.get(tukhoa);
		return ynghia;
	}
	public void inTukhoa() {
		Set<String> intukhoa = this.duLieu.keySet();
		System.out.println(Arrays.toString(intukhoa.toArray()));
	}
	public int laySoluong() {
		return this.duLieu.size();
	}
	public void xoaTatca() {
		this.duLieu.clear();
	}
	
	public static void main(String[] args) {
		TuKhoa tuDien = new TuKhoa();
		int luachon = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("--------------------");
			System.out.println("----MENU------------");
			System.out.println("Nhap lua chon cua ban , nhap 0 de thoat\n"
					+"1.Them tu \n"
					+"2.Xoa tu \n"
					+"3.Tim y nghia cua tu khoa => Tra tu\n"
					+"4.In ra danh sach tu khoa\n"
					+"5.In ra so luong tu\n"
					+"6.Xoa tat ca cac tu khoa\n"
					+"0.Thoat\n"
					);
			luachon = sc.nextInt();
			sc.nextLine();
			if(luachon == 1) {
				System.out.println("Nhap tu khoa :");
				String tukhoa = sc.nextLine();
				System.out.println("Nhap y nghia :");
				String ynghia = sc.nextLine();
				tuDien.themTu(tukhoa, ynghia);
			}
			else if(luachon==2 || luachon ==3) {
				System.out.println("Nhap tu khoa:");
				String tukhoa = sc.nextLine();
				if(luachon==2) {
					tuDien.xoaTu(tukhoa);
				}else {
					System.out.println("Y nghia la :"+tuDien.timTu(tukhoa));
				}
			}
			else if(luachon == 4) {
				tuDien.inTukhoa();
			}
			else if(luachon == 5) {
				System.out.println("So luong tu :"+tuDien.laySoluong());
				
			}
			else if(luachon == 6) {
				tuDien.xoaTatca();
			}
		}while(luachon!=0);
	}
}
