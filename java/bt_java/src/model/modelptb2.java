package model;

public class modelptb2 {
	private double a,b,c;
	private String kq;

	public modelptb2() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
		this.kq = "";
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	public String getKq() {
		return kq;
	}

	public void setKq(String kq) {
		this.kq = kq;
	}
	public  void  GiaiPT() {
		if(a==0) {
			if(b==0) {
				if(c==0) {
					kq = "Phương trình vô số ngiệm";
				}else {
					kq = "Phương trình vô nghiệm";
				}
			}else {
				kq = "Phương trình có 1 nghiệm x = "+(-c/b);
			}
		}else {
			double delta = b*b - 4*a*c;
			if(delta == 0) {
				kq = "Phương trình có nghiệm kép x1 = x2 = "+(-b/(2*a));
			}else if(delta > 0) {
				kq = "Phương trình có 2 nghiệm phân biệt x1 = "+ ((-b + Math.sqrt(delta))/(2*a)) + " ; x2 = "+((-b - Math.sqrt(delta))/(2*a));
			}else {
				kq = "Phương trình vô nghiệm";
			}
			
		}
		System.out.println(kq);
	}
	
	
}
