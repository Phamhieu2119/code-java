package mainn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	
	private ArrayList<SinhVien> danhSach;
	
	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhsach) {
		this.danhSach = danhsach;
	}
	// 1. them sinh vien vao danh sach
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}
	// in danh dach sinh vien ra man hinh
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}
	// 3. kiem tra danh sach co rong hay khong
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}
	// 4. lay so luong sinh vien trong danh sach
	public int laySoLuongSinhVien() {
		return this.danhSach.size();
	}
	// 5. lam rong danh sach
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}
	//6. kiem tra sinh vien
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}
	//7. xoa sinh vien ra khoi danh sach
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}
	//8. tim sv dau vao ten nhap tu ban phim
	public void timSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if(sinhVien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}
	//9. xuat ra danh sach sv co diem tu cao den thap
	public void sapxepSinhVienGiamdantheodiem() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if(sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
					return 1;
				}
				else if(sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
					return -1;
				}else {
					return 0;
				}
				
			}
			
		});
	}
	
}
