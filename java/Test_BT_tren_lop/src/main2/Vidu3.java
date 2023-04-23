package main2;

import java.util.Scanner;

public class Vidu3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap fullname :");
		String fullname = sc.nextLine();
		fullname = fullname.trim();
		int i = fullname.indexOf(" "),
		j = fullname.lastIndexOf(" ");
		System.out.println("Ten : "+fullname.substring(j+1).toUpperCase());
		System.err.println("Dem : "+fullname.substring(i+1, j));
		System.out.println("Ho :"+fullname.substring(0, i));
	}
	
}
