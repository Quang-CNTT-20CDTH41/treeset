package vd4;

import java.util.*;

public class CompareCVTG implements Comparator<Tamgiac> {
	@Override
	public int compare(Tamgiac a, Tamgiac b) {
		if(a.CVTG() < b.CVTG())return 1;
		else if(a.CVTG() == b.CVTG()) return 0;
		else return -1;
	}

}
