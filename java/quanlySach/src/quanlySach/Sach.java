package quanlySach;

public class Sach {
	private String tenSach;
	private double giaBan;
	private int namXuatban;
	private tacGia Tacgia;
	
	
	
	public Sach(String tenSach, double giaBan, int namXuatban, tacGia tacgia) {
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatban = namXuatban;
		Tacgia = tacgia;
	}
	
	

	public tacGia getTacgia() {
		return Tacgia;
	}



	public void setTacgia(tacGia tacgia) {
		Tacgia = tacgia;
	}
	


	public String getTenSach() {
		return tenSach;
	}



	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}



	public void intTensach() {
		System.out.println("Ten sach "+ this.getTenSach());
	}
	public boolean checkNam(Sach sachkhac) {
		return this.namXuatban == sachkhac.namXuatban;
	}
	public double giaSaukhigiam(double x) {
		return this.giaBan*(1-x/100);
	}
	
	
	
}
