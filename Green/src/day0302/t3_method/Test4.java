package day0302.t3_method;

public class Test4 {
	public static void main(String[] args) {
		Calculator2 calc = new Calculator2(100,200);
		
		int res;
		
		res = calc.add();
		System.out.println("res = " + res);
		res = calc.sub();
		System.out.println("res = " + res);
		res = calc.mul();
		System.out.println("res = " + res);
		res = calc.div();
		System.out.println("res = " + res);
		
	}
}
