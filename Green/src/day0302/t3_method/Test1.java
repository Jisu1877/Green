package day0302.t3_method;

public class Test1 {
	public static void main(String[] args) {
		 Calculator calc = new Calculator();
		 
		 int res = calc.add(10, 20);			//return값을 돌려받을 변수 res를 만들어줌.
		 System.out.println("10 + 20 = " + res);
		 
		 res = calc.sub(10, 20);
		 System.out.println("10 - 20 = " + res);
		 
		 res = calc.mul(10, 20);
		 System.out.println("10 * 20 = " + res);
		 
		 res = calc.div(10, 20);
		 System.out.println("10 / 20 = " + res);
	}
}
