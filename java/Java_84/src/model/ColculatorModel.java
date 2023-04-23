package model;

public class ColculatorModel {
	private double firstvalue;
	private double secondvalue;
	private double answer;

	public ColculatorModel() {
	}

	public double getFirstvalue() {
		return firstvalue;
	}

	public void setFirstvalue(double firstvalue) {
		this.firstvalue = firstvalue;
	}

	public double getSecondvalue() {
		return secondvalue;
	}

	public void setSecondvalue(double secondvalue) {
		this.secondvalue = secondvalue;
	}

	public double getAnswer() {
		return answer;
	}

	public void setAnswer(double answer) {
		this.answer = answer;
	}

	public void cong() {
		this.answer = this.firstvalue + this.secondvalue;
	}

	public void tru() {
		this.answer = this.firstvalue - this.secondvalue;
	}

	public void nhan() {
		this.answer = this.firstvalue * this.secondvalue;
	}

	public void chia() {
		this.answer = this.firstvalue / this.secondvalue;
	}

	public void chiadu() {
		this.answer = this.firstvalue % this.secondvalue;
	}

	public void pow() {
		this.answer = Math.pow(this.firstvalue, this.secondvalue);
	}

}
