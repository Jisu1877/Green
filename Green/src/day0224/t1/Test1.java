package day0224.t1;

import java.util.Scanner;

// 최대/최소값 구하기(입력되는 수는 2자리 이하의 정수가 입력된다.)
// 1. 초기값 할당법
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = -99;
		int min = 99;
		int su;
		boolean flag = true;

		while (flag) {
			System.out.print("두자리 정수를 입력하세요?(종료시는 999입력)");
			su = sc.nextInt();

			if (su == 999)
				break;

			if (su > max) max = su;
			if (su < min) min = su;
		}
			System.out.println("최대값은?" + max);
			System.out.println("최소값은?" + min);
			sc.close();
		}
	}
