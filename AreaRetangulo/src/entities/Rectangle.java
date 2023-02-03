package entities;

public class Rectangle {
	
	public double a;
	public double b;
	
	
	public double area() {
		double s = 2 * (a*b);
		return s;
	}
	
	
	public double perimetro() {
		double p = (a+b);
		return p;
	}
	
	public double diagonal() {
		double d = a*a + b*b;
		return Math.sqrt(d);
	}
	

}
