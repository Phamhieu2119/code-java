package Vidu;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String s = "hom nay , troi mua . dau dau";
		String[] b = s.split(" ");
		System.out.println(Arrays.toString(b));
		String[] c = s.split(",");
		System.out.println(Arrays.toString(c));
		String[] d = s.split("\\.|\\,");
		System.out.println(Arrays.toString(d));
		String e = "nguyen van A";
		String[] f = e.split(" ");
		System.out.println("ten :"+f[f.length-1]);
	}
}
