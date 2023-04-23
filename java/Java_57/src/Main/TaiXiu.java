package Main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
	public static void main(String[] args) {
		double taikhoannguoiChoi = 5000000;
		Scanner sc = new Scanner(System.in);
		
		Locale lc = new Locale("vi","VN");
		NumberFormat numf =  NumberFormat.getCurrencyInstance(lc);
		int luachon = 0;
		do {
			System.out.println("-----------Moi ban lua chon------");
			System.out.println("Chon (1) de tiep tuc choi.");
			System.out.println("chon phim bat ky de thoat.");
			luachon = sc.nextInt();
			if(luachon==1) {
				System.out.println("*****Bat dau choi:");
				System.out.println("*****Tai khoan cua ban: "+numf.format(taikhoannguoiChoi)+",ban muon dat cuoc bao nhieu?");
				//dat cuoc
				double datcuoc = 0;
				do {
					System.out.println("***** Dat cuoc (0< so tien cuoc <="+numf.format(taikhoannguoiChoi)+":");
					datcuoc = sc.nextDouble();
				}while(datcuoc <=0 || datcuoc > taikhoannguoiChoi);
				//chon tai xiu
				int luaChonTaiXiu = 0;
				do {
					System.out.println("*****chon 1 <=> tai hoac 2 <=> xiu");
					luaChonTaiXiu = sc.nextInt();
				}while(luaChonTaiXiu!= 1 && luaChonTaiXiu!=2);
				//tung xuc sac
				Random xucxac1 = new Random();
				Random xucxac2 = new Random();
				Random xucxac3 = new Random();
				
				int giaTri1 = xucxac1.nextInt(5)+1;
				int giaTri2 = xucxac2.nextInt(5)+1;
				int giaTri3 = xucxac3.nextInt(5)+1;
				int tong = giaTri1+giaTri2+giaTri3;
				
				// tinh toan ket qua
				System.out.println("***** Ket qua :"+giaTri1+" - "+giaTri2+" - "+giaTri3);
				if(tong ==3 || tong ==18) {
					taikhoannguoiChoi-=datcuoc;
					System.out.println("***** Tong la :"+tong+" => Nha cai an het , ban da thua !");
					System.out.println("***** tai khoan cua ban la :"+numf.format(taikhoannguoiChoi));
					
				}else if(tong >=4 && tong <=10) {
					System.out.println("*****Tong la :"+tong+" => xiu");
					if(luaChonTaiXiu == 2) {
						System.out.println("***** ban da thang ");
						taikhoannguoiChoi += datcuoc;
						System.out.println("***** Tai khoan cua ban la :"+numf.format(taikhoannguoiChoi));
					}
					else {
						System.out.println("*****Ban da thua cuoc !");
						taikhoannguoiChoi-=datcuoc;
						System.out.println("*****Tai khoan :"+numf.format(taikhoannguoiChoi));
						
					}
				}else {
					System.out.println("*****Tong la :"+tong+" => Tai");
					if(luaChonTaiXiu == 1) {
						System.out.println("***** ban da thang ");
						taikhoannguoiChoi += datcuoc;
						System.out.println("***** Tai khoan cua ban la :"+taikhoannguoiChoi);
					}
					else {
						System.out.println("*****Ban da thua cuoc !");
						taikhoannguoiChoi-=datcuoc;
						System.out.println("*****Tai khoan :"+taikhoannguoiChoi);
						
					}
				}
				
			}
		}while(luachon == 1);
	}
}
