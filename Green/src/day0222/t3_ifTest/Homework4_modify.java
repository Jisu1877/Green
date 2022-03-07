package day0222.t3_ifTest;

import java.util.Scanner;

// 문제4) 두수를 입력받아 큰수에서 적은수로 값을 나누어서 출력되는 결과를 소수이하 2자리까지 출력시키시오.
public class Homework4_modify {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		System.out.println("두 수를 입력하면 나눈 값을 알려드립니다.");
		while(true) {
			System.out.print("첫번째 수를 입력하세요. ");
			num1 = sc.nextDouble();
			System.out.print("두번째 수를 입력하세요. ");
			num2 = sc.nextDouble();
			
			if(num1 == 0 || num2 ==0) {
				 System.out.println("0으로는 나눌 수 없습니다. 다시 입력해주세요.");
			}
			else {
				break;
			}
		}
		double result = num1>=num2 ? num1/num2 : num2/num1;
		System.out.printf("나눈 결과는 %1.2f입니다.", result);
		
//		아래와 같은 연산을 위 삼항연산자로 줄여 수정하였다.
//		if(num1 >= num2) {
//			result = (num1 / num2);
//			System.out.printf("나눈 결과는 %1.2f입니다." ,result);
//		}
//		else (num1 < num2) {
//			result = (num2 / num1);
//			System.out.printf("나눈 결과는 %1.2f입니다." ,result);
//		}
		sc.close();
	}
}
