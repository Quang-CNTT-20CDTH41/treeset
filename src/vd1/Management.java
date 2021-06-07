package vd1;
import java.util.*;
public class Management {

	public static void main(String[] args) {
		Set<SV> set = new TreeSet<SV>(new CompareSV());
		set.add(new SV("Ti", 9.9));
		set.add(new SV("Suu", 5.9));
		set.add(new SV("Dan", 7.9));
		set.add(new SV("Mao", 6.9));
		for (SV sv : set) {
			System.out.println(sv.toString());
		}
	}
}
