package day0302.t3_method;

public class Test2 {
	public static void main(String[] args) {
		 Calculator calc = new Calculator();
		 int su1 = 100;
		 int su2 = 200;
		 
		 int res = calc.add(su1, su2);			//return값을 돌려받을 변수 res를 만들어줌.
		 System.out.println(su1 + " + " + su2+ " = " + res);
		 
		 res = calc.sub(su1, su2);
		 System.out.println(su1 + " - " + su2+ " = " + res);
		 
		 res = calc.mul(su1, su2);
		 System.out.println(su1 + " * " + su2+ " = " + res);
		 
		 res = calc.div(su1, su2);
		 System.out.println(su1 + " / " + su2+ " = " + res);
	}
}
