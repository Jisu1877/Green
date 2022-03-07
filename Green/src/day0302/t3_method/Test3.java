package day0302.t3_method;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		Calculator calc = new Calculator();
		int su1;
		int su2;
		 
		System.out.print("첫번째 수를 입력하세요?");
		su1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요?");
		su2 = sc.nextInt();
		
		int res = calc.add(su1, su2);			//return값을 돌려받을 변수 res를 만들어줌.
		System.out.println(su1 + " + " + su2+ " = " + res);
		 
		res = calc.sub(su1, su2);
		System.out.println(su1 + " - " + su2+ " = " + res);
		 
		res = calc.mul(su1, su2);
		System.out.println(su1 + " * " + su2+ " = " + res);
		 
		res = calc.div(su1, su2);
		System.out.println(su1 + " / " + su2+ " = " + res);
		 
		sc.close();
	}
}
