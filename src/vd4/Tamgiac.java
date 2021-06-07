package vd4;

public class Tamgiac {
	private double a,b,c;

	public Tamgiac(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double DTTG() {
		double p = (a+b+c)/2;
		double s = (p*(p-a)*(p-b)*(p-c));
		return (s);
	}
	public double CVTG() {
		return a+b+c;
	}
	@Override
	public String toString() {
		return "Tamgiac chuvi: " + CVTG() + "\t dientich: " + DTTG() ;
	}
	
}
