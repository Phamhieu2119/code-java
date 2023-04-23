package main5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class Test_collection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list1 = new ArrayList<String>();
		String src;
		do {
			System.out.println("Nhap vao list : ");
			src = sc.nextLine();
			list1.add(src);
		}while(!src.equals("k"));
		
		list1.add("Hello");
		list1.add("Java");
//		for (String s : list1) {
//			System.out.println(s);
//		}
		
		// khai bao 1 mang arr voi do dai cua arrlist
		String[] arr = new String[list1.size()];
		// chuyen arrlist thanh arr
		list1.toArray(arr);
		for (String string : arr) {
			System.out.println(string+", ");
		}
		
		
	}
}
