package mainn;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stackChuoi = new Stack<String>();
		
		System.out.println("Nhap vao chuoi :");
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++) {
			stackChuoi.push(s.charAt(i)+"");
			
		}
		System.out.println("Chuoi dao nguoc");
		for(int i=0;i<s.length();i++) {
			System.out.print(stackChuoi.pop());
		}
		System.out.println("\n");
		Stack<String> stackSoDu = new Stack<String>();
		System.out.println("Nhap 1 so nguyen duong :");
		int x = sc.nextInt();
		while( x > 0) {
			int sodu = x % 2;
			stackSoDu.push(sodu+"");
			x = x/2;
		}
		System.out.println("So nhi pha la :");
		int n = stackSoDu.size();
		for(int i=0;i<n;i++) {
			System.out.print(stackSoDu.pop());
		}
		
	}
}
