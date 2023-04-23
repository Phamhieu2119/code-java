
public class Test {
	public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("Hang 1", "Viet Nam");
		PhuongTienDiChuyen p1 = new XaOto("Xe o to", h1, "Truong hai");
		MayBay p2 = new MayBay("May bay", h1, "Xang");
		PhuongTienDiChuyen p3 = new XeDap("Xe dap", h1);
		
		System.out.println("p1 = "+ p1.layTenHangSanXuat());
		p2.batDau();
		System.out.println("P1 :"+p1.layVanToc());
		System.out.println("P2 : "+p2.layVanToc());
		System.out.println("P3 : "+ p3.layVanToc());
		
		
		
		
	}
}
