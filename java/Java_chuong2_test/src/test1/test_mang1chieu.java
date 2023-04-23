package test1;

import java.util.Arrays;
import java.util.Scanner;

public class test_mang1chieu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang :");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Nhap mang :");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] :", i);
			a[i] = sc.nextInt();
		}
		System.out.printf("Mang da nhap :");
		for (int i = 0; i < n; i++) {
			System.out.printf(a[i] + " ");
		}
		System.out.println("\nMang goc :" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Mang sau khi su dung sort : " + Arrays.toString(a));
		int i = Arrays.binarySearch(a, 8);
		System.out.println("Vi tri dau tien xuat hien so 8 : " + i);
		Arrays.fill(a, 0);
		System.out.println("Mang sau fill : " + Arrays.toString(a));
	}

}
