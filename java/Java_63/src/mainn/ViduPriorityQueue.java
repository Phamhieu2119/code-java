package mainn;

import java.util.PriorityQueue;
import java.util.Queue;

public class ViduPriorityQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new PriorityQueue<String>();
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("Nguyen van B");
		danhSachSV.offer("TITV 2");
		
		while(true) {
			String ten = danhSachSV.poll();//ham poll() lay ra va xoa
			if(ten == null) {
				break;
			}
			//peek => lay ra nhung khong xoa
			System.out.println(ten);
		}
	}
	
}
