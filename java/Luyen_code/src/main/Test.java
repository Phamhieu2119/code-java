package main;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0 ;
		while(n > 0) {
			count++;
			n/=10;
		}
		int count1 = 0;
		int sum1 = 0;int sum2 =0;
		System.out.println(count);
		System.out.println(count/2);
		int a;
		while(n>0){
	         a = n % 10;
	        count1++;
	        n/=10;
	        if(count1 <= (count / 2)){
	            sum1+=a;
	        }
	        
	        else if (count1 > (count / 2)){
	            sum2+=a;
	        }
	       a = 0;
	    }
		System.out.println(sum1 + " ---" +sum2);
	}
	

}
