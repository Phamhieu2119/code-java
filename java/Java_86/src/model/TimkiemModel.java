package model;

public class TimkiemModel {
	private String vanban;
	private String timKiem;
	private String ketqua;

	public TimkiemModel() {
		this.vanban = "";
		this.timKiem = "";
		this.ketqua = "";
	}

	public String getVanban() {
		return vanban;
	}

	public void setVanban(String vanban) {
		this.vanban = vanban;
	}

	public String getTimKiem() {
		return timKiem;
	}

	public void setTimKiem(String timKiem) {
		this.timKiem = timKiem;
	}

	public String getKetqua() {
		return ketqua;
	}

	public void setKetqua(String ketqua) {
		this.ketqua = ketqua;
	}

	public void timkiem() {
		int dem = 0;
		int vitri = 0;
		while (true) {
			int i = this.vanban.indexOf(this.timKiem, vitri);
			if (i == -1) {
				break;
			} else {
				dem++;
				vitri = i + 1;
			}
		}
		this.ketqua = "Co : " + dem + " " + this.timKiem;
		System.out.println(ketqua);
	}

}
