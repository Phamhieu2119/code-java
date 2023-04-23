package main4;

import java.util.Arrays;
import java.util.Scanner;

public class nhap_ten_thay_the {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang : ");
		int n = Integer.parseInt(sc.nextLine());
		String[] a = new String[n];
		System.out.println("Nhap vao mang : ");
		for(int i=0;i<n;i++) {
			System.out.printf("a[%d] : ",i);
			a[i] = sc.nextLine();
		}
		System.out.println("Mang ban dau : ");
		System.out.println(Arrays.toString(a));
		for(int i=0;i<n;i++) {
			a[i] = a[i].replaceAll("An", "Anh");
		}
		System.out.println("Mang sau khi thay the : ");
		System.out.println(Arrays.toString(a));
	}
	
}
