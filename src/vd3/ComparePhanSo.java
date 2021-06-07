package vd3;

import java.util.*;

public class ComparePhanSo implements Comparator<Phanso> {

	@Override
	public int compare(Phanso o1, Phanso o2) {
		if(o1.getValue() > o2.getValue()) return 1;
		else if(o1.getValue() == o2.getValue()) return 0;
		else return -1;
	}
	
}
