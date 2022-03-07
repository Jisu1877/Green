package day0302.t3_method;

public class Sum {
	int res;
	int add(int[] su)  {				//  su 배열을 받음.
		for(int i=0; i<su.length; i++) {
			res += su[i];
		}
		return res;
	}
}
