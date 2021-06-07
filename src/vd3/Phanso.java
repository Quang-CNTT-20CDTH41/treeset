package vd3;

public class Phanso {
	int tu, mau;

	public Phanso(int tu, int mau) {
		super();
		this.tu = tu;
		this.mau = mau;
	}
	public double getValue() {
		return (double)tu/mau;
	}
}
