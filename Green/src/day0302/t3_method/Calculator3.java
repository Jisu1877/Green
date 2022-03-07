package day0302.t3_method;

public class Calculator3 {
	int su1, su2, res;
	
	public Calculator3(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
	void add() {
		res = su1 + su2;
		System.out.println(su1 + " + " + su2 + " = " + res);	//출력하고 끝이니까 리턴할 값이 없다. 그래서 리턴 삭제함. 그래서 리턴타입이 void로 변경
	}
	
	void sub() {
		res = su1 - su2;
		System.out.println(su1 + " - " + su2 + " = " + res);
	}
	
	void mul() {
		res = su1 * su2;
		System.out.println(su1 + " * " + su2 + " = " + res);
	}
	
	void div() {
		res = su1 / su2;
		System.out.println(su1 + " / " + su2 + " = " + res);
	}
}
