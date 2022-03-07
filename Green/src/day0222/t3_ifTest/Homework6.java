package day0222.t3_ifTest;

import java.util.Scanner;

/*문제6) Green회사의 급여를 계산하려고 한다.
급여는 실제 수령받는 '실수령액'을 구하는데, 이때 입력받는 값은 '성명'과 '본봉'과 '야근시간'을 입력받는다.
이 회사의 야근수당은 1시간당 15000원이다. 또한 공제금액을 계산해야 하는데, 공제액은 받는 금액(본봉+야근수당)에서 10%를 세금으로 제외한다고 한다.
이 회사의 받게 되는 '실수령액'을 출력하시오.('성명, 본봉, 야근수당, 공제액, 실수령액' 모두를 출력하시오.)
실수령액 = 본봉 + 수당 - 공제액
 */
/*
예)
성명을 입력하세요? 홍길동

본봉을 입력하세요? 2000000

야근시간을 입력하세요? 10

성명 : 홍길동

본봉 : 2000000

야근수당 : 150000

공제액 : 215000

실수령액 : 1935000
*/
public class Homework6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Green회사의 급여(실수령액) 계산 도우미");
		System.out.print("성명을 입력하세요. ");
		String name = sc.nextLine();

		System.out.print("본봉을 입력하세요. ");
		int income = sc.nextInt();

		System.out.print("야근시간을 입력하세요. ");
		int time = sc.nextInt();

		int overtime, deductible;

		overtime = time * 15000;
		deductible = (income + overtime)/ 10;
		int income1 = income + overtime - deductible;

		System.out.println("==========================");
		System.out.println("성명은 " + name + "입니다.");
		System.out.println("본봉은 " + income + "입니다.");
		System.out.println("야근수당은 " + overtime + "입니다.");
		System.out.println("공제액은 " + deductible + "입니다.");
		System.out.println("실수령액은 " + income1 + "입니다.");

		sc.close();
	}
}
