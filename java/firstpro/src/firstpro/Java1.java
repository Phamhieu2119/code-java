/**
 * 
 */
package firstpro;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Java1 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		String hoctap = "qua pc";
//		System.out.println("hoc gia java " + hoctap);
//		final int x = 10;
//		System.out.println("x = " + x);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap ho va ten :");
//		String hoVaten = sc.nextLine();
//		System.out.println("Nhap ma sinh vien :");
//		long maSinhvien = sc.nextLong();
//		System.out.println("Nhap vao diem thi :");
//		float diemThi = sc.nextFloat();
//		System.out.println("Ho va ten :"+ hoVaten);
//		System.out.println("Ma sinh vien :"+maSinhvien);
//		System.out.println("Diem thi : " + diemThi);
//		int a = 2;
//		System.out.println("a = "+a);
//		float c = a;
//		System.out.println("c = "+c);
//		int a, b;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap a = ");
//		a = sc.nextInt();
//		System.out.println("Nhap b = ");
//		b = sc.nextInt();
//		int tong = a + b;
//		System.out.println(a + " + " + b + " = " + tong);
//		float thuong = (float) a / b;
//		System.out.println(a + " / " + b + " = " + thuong);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap a = ");
//		int a = sc.nextInt();
//		String ketqua = (a % 2 == 0) ? "so chan " : "so le";
//		System.out.println(a + " la " + ketqua);
//		double r, chuvi;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Nhap r = ");
//		r = sc.nextDouble();
//		chuvi = r * Math.PI * 2;
//		System.out.println("Chu vi = " + Math.round(chuvi*100.0)/100.0);
//		int n;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap n = ");
//		n = sc.nextInt();
//		String nhiphan = "";
//		while(n>0) {
//			nhiphan = (n%2) + nhiphan;
//			n=n/2;
//		}
//		System.out.println("Xau nhi phan : "+nhiphan);
		double[] mang;
		Scanner sc = new Scanner(System.in); 
		int n;
		System.out.println("Nhap so phan tu cua mang : ");
		n = sc.nextInt();
		mang = new double[n];
		for(int i= 0;i<mang.length;i++) {
			System.out.println("Phan tu thu "+i+":");
			mang[i] = sc.nextDouble();
		}
		System.out.println("Mang vua nhap la : ");
		for (int i = 0; i < mang.length; i++) {
			System.out.println(mang[i]);
		}
		
		

	}
}
