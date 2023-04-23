
public class HoaDonCaPhe {
	private int day;
	private int month;
	private int year;
	public HoaDonCaPhe(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "HoaDonCaPhe [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		HoaDonCaPhe other = (HoaDonCaPhe) obj;
		if(this.day != other.day)
			return false;
		if(this.month != other.month)
			return false;
		if(this.year != other.year)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + day;
		result = result * prime + month;
		result = result * prime + year;
		return result;
		
	}
}
