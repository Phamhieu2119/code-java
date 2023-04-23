package main;

public class Circle {
	private int x;
	private int y;
	private double r;
	public Circle(int x, int y, double r) {
		
		this.x = x;
		this.y = y;
		this.r = r;
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
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public void in() {
		System.out.println("Toa do tam 0("+getX()+","+getY()+") va ban kinh r = "+getR());
	}
	public static void main(String[] args) {
		Circle cc = new Circle(1, 2, 3);
		cc.in();
	}
}
