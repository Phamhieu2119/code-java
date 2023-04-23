package Vidu;

import java.util.Arrays;

public class Test {
	public static int[] reverse(int[] x) {
		int[] sc = new int[x.length];
		int index = 0;
		for(int i= x.length -1;i>=0;i--) {
			sc[index] = x[i];
			index++;
		}
		return sc;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {1,2,5,3,7,1,4};
		int[] b = new int[10];
		System.out.println("Mang ban dau : "+ Arrays.toString(a));
		//sap xep
		Arrays.sort(a);
		System.out.println("Mang sap xep "+ Arrays.toString(a));
		//tim kiem
		System.out.println("tim 1:"+Arrays.binarySearch(a, 2));
		System.out.println("Tim 2 :"+Arrays.binarySearch(a,0));
		//dien gia tri
		Arrays.fill(b, 2);
		System.out.println("mang b :"+Arrays.toString(b));
		//sap xep nguoc
		a = Test.reverse(a);
		System.out.println("Mang nguoc :"+Arrays.toString(a));
	}
}
