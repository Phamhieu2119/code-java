package model;

public class ModelPtb2 {
	private int a, b, c;
	private String kq;

	public ModelPtb2() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
		this.kq = "";
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

//	public String getKq() {
//		return kq;
//	}
//
//	public void setKq(String kq) {
//		this.kq = kq;
//	}

	public void hienthi() {
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					kq = "Phuong trinh vo so nghiem";
				} else {
					kq = "Phuong trinh vo nghiem";
				}
			} else {
				kq = "Phuong tirnh co nghiem x = " + (-b / a);
			}
		} else {
			double delta = b * b - 4 * a * c;
			if(delta >0) {
				kq = "Phuong tirnh co 2 nghiem phan biet x1 = "+((-b + Math.sqrt(delta)) / (2*a)) +" ; x2 = "+((-b - Math.sqrt(delta)) / (2*a));
			}else if(delta == 0) {
				kq = "Phuong trinh co nghiem kep x = "+(-b/(2*a));
			}else {
				kq = "Phuong trinh vo nghiem";
			}
			
		}
		System.out.println(kq);
	}
	
}
