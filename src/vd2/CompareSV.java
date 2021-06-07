package vd2;

import java.util.*;

public class CompareSV implements Comparator<SV> {

	public int compare(SV s1, SV s2) {
		if(s1.getDtb() < s2.getDtb()) {
			return 1;
		}else if(s1.getDtb() == s2.getDtb()) {
			return 0;
		}else { 
			return -1;
		}
	}

}
