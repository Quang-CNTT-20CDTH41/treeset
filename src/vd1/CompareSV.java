package vd1;
import java.util.*;
public class CompareSV implements Comparator<SV> {
	@Override
	public int compare(SV s1, SV s2) {
//		if(s1.getDtb() < s2.getDtb()) {
//			return 1;
//		}else if(s1.getDtb() == s2.getDtb()) {
//			return 0;
//		}else { 
//			return -1;
//		}
		if(s1.getTen().compareTo(s2.getTen()) > 0) {
			return 1;
		}else if(s1.getTen() == s2.getTen()) {
			return 0;
		}else { 
			return -1;
		}
	}
}
