
public class Test {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe(15,1,2003);
		HoaDonCaPhe hd1 = new HoaDonCaPhe(15,1,2003);
		System.out.println(hd);
		System.out.println("so sanh hd va hd1 : " + hd.equals(hd1));
		System.out.println(hd.hashCode());
	}
}
