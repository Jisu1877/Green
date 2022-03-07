package day0222.homework;

import java.util.Scanner;

/*
 문제5) 두수와 연산자를 입력받아 계산하는 프로그램을 만드시오? 출력참조.
(단, 입력되는 연산자는 +, -, *, /, % 중에서 하나만 입력받도록 처리하시오)
첫번째 수? 10
두번째 수? 6
연산자(+, -, *, /, %)를 입력하세요? A

연산자는 '+, -, *, /, %'중에서 하나만 입력하셔야 합니다.
연산자(+, -, *, /, %)를 입력하세요? *
결과 : 10 * 6 = 60
 */
public class Homework0223_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1, su2, res = 0;
		char sign;

		System.out.print("첫번째 수?");
		su1 = sc.nextInt();
		System.out.print("두번째 수?");
		su2 = sc.nextInt();

		while (true) {
			System.out.print("연산자(+, -, *, /, %)를 입력하세요?");
			sign = sc.next().charAt(0);								//String 타입을 char 타입으로 변환시켜 입력받기. String문자열의 0번째에 입력받겠다는 의미. 자세한 내용은 https://colossus-java-practice.tistory.com/31 참조.
			if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '%') {
				break;
			} else {
				System.out.println("연산자는 '+, -, *, /, %'중에서 하나만 입력하셔야 합니다.");
			}
		}
		switch (sign) {
			case '+':
				res = su1 + su2;
				break;
			case '-' :
				res = su1 - su2;
				break;
			case '*' :
				res = su1 * su2;
				break;
			case '/' :
				res = su1 / su2;
				break;
			case '%' :
				res = su1 % su2;
				break;
//		if(sign == '+') {				//if문으로도 작성가능.
//			res = su1 + su2;
//		}else if(sign == '-') {
//			res = su1 - su2;
//		}else if(sign == '*') {
//			res = su1 * su2;
//		}else if(sign == '/') {
//			res = su1 / su2;
//		}else if(sign == '%') {
//			res = su1 % su2;
//		}
		}
		System.out.println("결과 : "+su1+" "+sign+" "+su2+" = "+res+" ");
		sc.close();
	}
}
