package vd2;

public class SV {
	private String ten;
	private double dtb;
	public SV(String ten, double dtb) {
		this.ten = ten;
		this.dtb = dtb;
	}
	public double getDtb() {
		return dtb;
	}
	@Override
	public String toString() {
		return "SV ten: " + ten + "\t dtb: " + dtb;
	}
}
