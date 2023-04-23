import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ho ten : ");  String ht = sc.nextLine();
		System.out.println("Gioi tinh "); String gt = sc.nextLine();
		System.out.println("So dien thoai : ");  String sdt = sc.nextLine();
		System.out.println("Tuoi : ");  int tuoi = sc.nextInt();
		
		System.out.println("------Thong tin cua sinh -----------");
		System.out.printf("%-15s %-12s %-5s\n", "Ho ten","Gioi tinh","Tuoi");
		System.out.printf("%-15s %-12s %-5s\n",ht,gt,tuoi);
		
 	}
}
