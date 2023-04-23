package main2;

import java.util.HashMap;
import java.util.Scanner;

public class TestPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		HashMap<Character,Integer> src = new HashMap<>();
	    for(int i  = 0; i < inputString.length();i++){
	        char ch = inputString.charAt(i);
	        src.put(ch, src.getOrDefault(ch , 0) +1);
	    }
//	    int count = 0;
//	    for ( int key : src.keySet()) {
//	        if(src.getOrDefault(key,0) %2==1 && src.getOrDefault(key,0) > 1){
//	            //return false;
//	        }
//	         if(src.getOrDefault(key,0)==1){
//	            count++;
//	        }
//	    }
	   // System.out.println(count);
		for(Character key : src.keySet()) {
			System.out.println(src.getOrDefault(key, 0));
		}
	}
}
