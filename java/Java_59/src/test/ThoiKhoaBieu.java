package test;

public class ThoiKhoaBieu {
	private Day thu;
	private String cacMonhoc;
	
	public ThoiKhoaBieu(Day thu, String cacMonhoc) {
		super();
		this.thu = thu;
		this.cacMonhoc = cacMonhoc;
	}
	public Day getThu() {
		return thu;
	}
	public void setThu(Day thu) {
		this.thu = thu;
	}
	public String getCacMonhoc() {
		return cacMonhoc;
	}
	public void setCacMonhoc(String cacMonhoc) {
		this.cacMonhoc = cacMonhoc;
	}
	@Override
	public String toString() {
		return "ThoiKhoaBieu [thu=" + thu + ", cacMonhoc=" + cacMonhoc + "]";
	}
	
}
