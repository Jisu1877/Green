package day0302.t3_method;

import java.util.Scanner;

public class Test6 {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산할 2개의 숫자를 입력하세요?");
		Calculator3 calc = new Calculator3(scanner.nextInt(), scanner.nextInt());
		
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
		
		scanner.close();
	}
}
