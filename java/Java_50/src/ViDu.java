
public class ViDu {
	public static void main(String[] args) {
		String s1 = "titv.vn";
		String s2 = "TITV.vn";
		String s3 = "titv.vn";
		System.out.println("s1 equals s2 :"+s1.equals(s2));
		System.out.println("s1 equals s3 :"+s1.equals(s3));
		System.out.println("------------");
		System.out.println("s1 equals s2 :"+s1.equalsIgnoreCase(s2));
		System.out.println("s1 equals s3 :"+s1.equalsIgnoreCase(s3));
	}
}
