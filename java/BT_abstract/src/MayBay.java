
public class MayBay extends PhuongTienDiChuyen{
	private String laoiNhienLieu;

	public MayBay(String loaiPhuongTien, HangSanXuat hangSanXuat, String laoiNhienLieu) {
		super(loaiPhuongTien, hangSanXuat);
		this.laoiNhienLieu = laoiNhienLieu;
	}

	public String getLaoiNhienLieu() {
		return laoiNhienLieu;
	}

	public void setLaoiNhienLieu(String laoiNhienLieu) {
		this.laoiNhienLieu = laoiNhienLieu;
	}

	@Override
	public double layVanToc() {
		return 1000;
	}
	public void catCanh() {
		System.out.println("Cat canh!");
	}
	public void haCanh() {
		System.out.println("Ha canh!");
	}

	
	
	
}
