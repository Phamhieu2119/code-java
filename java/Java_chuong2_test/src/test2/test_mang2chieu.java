package test2;

import java.util.Scanner;

public class test_mang2chieu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap m :");
		int m = sc.nextInt();
		System.out.println("Nhap n :");
		int n = sc.nextInt();
		int[][] a = new int[m][n];
		System.out.println("Nhap mang : ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("a[%d][%d] : ",i,j);
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Mang sau khi nhap : ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf(a[i][j]+"  ");
								
			}
			System.out.printf("\n");
		}
		
	}
}
