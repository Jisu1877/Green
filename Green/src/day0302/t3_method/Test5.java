package day0302.t3_method;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1, su2, res;
		
		System.out.print("첫번째 수를 입력하세요?");
		su1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요?");
		su2 = sc.nextInt();
		
		Calculator2 calc = new Calculator2(su1,su2);
		
		res = calc.add();
		System.out.println("res = " + res);
		res = calc.sub();
		System.out.println("res = " + res);
		res = calc.mul();
		System.out.println("res = " + res);
		res = calc.div();
		System.out.println("res = " + res);
		
		sc.close();
	}
}
