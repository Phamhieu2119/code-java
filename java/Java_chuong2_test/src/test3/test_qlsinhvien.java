package test3;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class test_qlsinhvien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang :");
		int n = Integer.parseInt(sc.nextLine()); 
		//InputStream inputStream = new InputStream();
		//(new InputStream()).skip(n);
		String[] a = new String[n];
		System.out.println("Nhap mang :");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] : ", i);
			//sc.nextLine();
			
			a[i] = sc.nextLine();
			
			
			
		}
		String q = "abc";
		String e = new String("snv");
		System.out.println("Xuat mang in hoa :");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i].toUpperCase());
			
		}

	}
}
