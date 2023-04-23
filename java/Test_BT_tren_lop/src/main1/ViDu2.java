package main1;

import java.util.Scanner;

public class ViDu2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap username : ");
		String username = sc.nextLine();
		System.out.println("Nhap password :");
		String password = sc.nextLine();
		if(username.equalsIgnoreCase("hello") && password.length()>8) {
			System.out.println("Nhap hop le !");
			
		}else {
			System.out.println("Khong hop le !");
		}
	}
}
