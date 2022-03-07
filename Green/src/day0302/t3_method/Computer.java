package day0302.t3_method;

public class Computer {
	int su1, su2, res;
	
	public Computer(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	void add() {
		res = su1 + su2;
		System.out.println(su1 + " + " + su2 + " = " + res);
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
	
	void add_sub() {	//덧셈 뺄셈을 한꺼번에 같이 하고 싶을 때...
		add();			//내부에서 내부에 있는 메소드 호출.
		sub();
	}
	
	void mul_div() {
		mul();
		div();
	}
}
