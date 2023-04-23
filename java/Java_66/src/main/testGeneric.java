package main;

import java.util.Set;

public class testGeneric {
	public static void main(String[] args) {
		Generic b1 = new Generic<Integer>(15);
		System.out.println("Gia tri :"+b1.getValue());
		
		Generic b2 = new Generic<String>("abc");
		System.out.println("Chuoi :"+b2.getValue());
		
		
	}

}
