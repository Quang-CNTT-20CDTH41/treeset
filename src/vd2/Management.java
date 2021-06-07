package vd2;

import java.util.*;

public class Management {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<SV> set = new TreeSet<SV>(new CompareSV());
		System.out.println("nhap n: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Nhap ten sv " + i );
			String ten = sc.next();
			System.out.println("Nhap dtb sv ");
			double dtb = sc.nextDouble();
			set.add(new SV(ten, dtb));
		}
		SV s = new SV("", 5);
		for (SV sv : ((TreeSet<SV>) set).headSet(s)) {
			System.out.println(sv);
		}
	}
}
