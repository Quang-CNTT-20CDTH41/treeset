package vd4;

import java.util.*;

public class CompareDTTG implements Comparator<Tamgiac> {
	@Override
	public int compare(Tamgiac a, Tamgiac b) {
		if(a.DTTG() > b.DTTG()) return 1;
		else if(a.DTTG() == b.DTTG()) return 0;
		else return -1;
	}

}
