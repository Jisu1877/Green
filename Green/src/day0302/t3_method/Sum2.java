package day0302.t3_method;

public class Sum2 {
	int res;
	int add(int...su)  {					//...연산자가 매개변수를 여러개 받아서 배열처럼 처리. 매개변수의 값을 모를때 사용.
		for(int i=0; i<su.length; i++) {
			res += su[i];
		}
		return res;
	}
}
