package main3;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		String[] a = inputString.split(".");
	    int[] b = new int[a.length];
	    for(int i = 0;i < a.length;i++){
	        b[i] = Integer.parseInt(a[i]);
	    }
	    System.out.println(Arrays.toString(b));
	    System.out.println(Arrays.toString(a));
	}
}
