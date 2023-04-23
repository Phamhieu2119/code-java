package model;

public class ModelExampleMouse {
	private int x;
	private int y;
	private int num ;
	private String check;
	public ModelExampleMouse() {
		this.x = 0;
		this.y = 0;
		this.num = 0;
		this.check = "no";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public void addclick() {
		this.num++;
	}
	public void enter() {
		this.check = "yes";
	}
	public void exit() {
		this.check = "no";
	}
}
