package quanlySach;

public class tacGia {
	private String tenTacgia;
	private ngay ngaysinh;
	
	public tacGia(String tenTacgia, ngay ngaysinh) {
		this.tenTacgia = tenTacgia;
		this.ngaysinh = ngaysinh;
	}
	public String gettenTacgia() {
		return tenTacgia;
	}
	public void settenTacgia(String ten) {
		this.tenTacgia = ten;
	}
	public ngay getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(ngay ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	
	
}
