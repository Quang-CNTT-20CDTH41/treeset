package vd3;

import java.util.*;

import vd2.SV;


public class Management {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Phanso> set = new TreeSet<Phanso>(new ComparePhanSo());	
		System.out.println("nhap n: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Nhap phan so " + i + ", tu: " );
			int tu = sc.nextInt();
			System.out.println("mau: ");
			int mau = sc.nextInt();
			Phanso e = new Phanso(tu, mau);
			set.add(e);
		}
		for (Phanso x : set) {
			System.out.println(x.tu + "/" + x.mau + " = " + x.getValue());
		}
	}
}
