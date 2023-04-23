package quanlySach;

public class Test {
	public static void main(String[] args) {
		ngay day = new ngay(21, 1, 2003);
		tacGia tg = new tacGia("ngay moi", day);
		Sach book1 = new Sach("nam moi", 100, 2005, tg);
		Sach book2 = new Sach("nam moi", 200, 2005, tg);
		book1.intTensach();
		System.out.println("kt nam : " + book1.checkNam(book2));
		System.out.println("Gia sua khi giam "+book1.giaSaukhigiam(10));
	}
}
