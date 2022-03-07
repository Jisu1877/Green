package day0302.t3_method;

public class Calculator2 {
	int su1, su2, res;
	
	public Calculator2(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
	int add() {
		res = su1 + su2;
		return res;					
	}
	
	int sub() {
		res = su1 - su2;
		return res;
	}
	
	int mul() {
		res = su1 * su2;
		return res;
	}
	
	int div() {
		res = su1 / su2;
		return res;
	}
}
