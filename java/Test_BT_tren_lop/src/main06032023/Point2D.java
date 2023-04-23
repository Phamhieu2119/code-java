package main06032023;

import java.util.ArrayList;
import java.util.List;

public class Point2D {
	private double x,y;
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	

	public double getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	public String show() {
		return ("Point2D ["+this.x+" , "+this.y+"]");
	}
	public double Distance() {
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
	public static void main(String[] args) {
		List<Point2D> listPoint2d = new ArrayList<Point2D>();
		Point2D p1_2D = new Point2D(1.0, 4.0);
		Point2D p2_2D = new Point2D(3.0, 6.0);
		Point2D p3_2D = new Point2D(4.0, 7.0);
		//add elements to the list
		listPoint2d.add(p1_2D);
		listPoint2d.add(p2_2D);
		listPoint2d.add(p3_2D);
		for (Point2D point2d : listPoint2d) {
			System.out.println(point2d.show());
		}
		double sum2D = 0.0;
		for (Point2D point2d : listPoint2d) {
			sum2D += point2d.Distance();
		}
		System.err.println("Distance of Point2D: "+sum2D);
	}
}
