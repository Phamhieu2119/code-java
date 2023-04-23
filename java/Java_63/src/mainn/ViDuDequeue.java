package mainn;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViDuDequeue {
	public static void main(String[] args) {
		Deque<String> danhSachSV = new ArrayDeque<String>();
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("Nguyen van B");
		danhSachSV.offer("TITV 2");
		
		danhSachSV.offerLast("TITV 4");
		danhSachSV.offerFirst("TITV 0");
		//them vao 2 dau cua deque vif Deque la hang doi 2 dau
		while(true) {
			String ten = danhSachSV.poll();
			if(ten == null) {
				break;
			}
			System.out.println(ten);	
		}
		
	}
}
