package vd4;
import java.util.*;
public class Management {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Tamgiac> dientich = new TreeSet<Tamgiac>(new CompareDTTG());
		Set<Tamgiac> chuvi = new TreeSet<Tamgiac>(new CompareCVTG());
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Nhap tam giac " + i + "\n a: ");
			double a = sc.nextDouble();
			System.out.println("b: ");
			double b = sc.nextDouble();
			System.out.println("c: ");
			double c = sc.nextDouble();
			chuvi.add(new Tamgiac(a,b,c));
			dientich.add(new Tamgiac(a,b,c));
		}
		System.out.println("Sap xep gia dan theo chu vi: ");
		for (Tamgiac tamgiac : chuvi) {
			System.out.println("Chu vi: " + tamgiac.CVTG() + "\tDien tich: " + tamgiac.DTTG());
		}
		System.out.println("\nSap xep tang dan theo dien tich: ");
		for (Tamgiac tamgiac : dientich) {
			System.out.println("Chu vi: " + tamgiac.CVTG() + "\tDien tich: " + tamgiac.DTTG());
		}
	}

}
