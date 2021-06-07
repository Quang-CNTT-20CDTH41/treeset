package vd1;

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
		return "SV Ten: " + ten + "\t dtb: " + dtb;
	}
	public String getTen() {
		return ten;
	}
}
