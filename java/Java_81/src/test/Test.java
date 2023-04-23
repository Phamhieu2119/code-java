package test;

import model.countermodel;
import view.counterview;

public class Test {
	public static void main(String[] args) {
		countermodel ct = new countermodel();
		ct.increment();
		ct.increment();
		ct.increment();
		System.out.println(ct.getValue());
		ct.decrement();
		System.out.println(ct.getValue());
		
		counterview ctv = new counterview();
	}
}	
