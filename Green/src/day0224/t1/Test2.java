package day0224.t1;

import java.util.Scanner;

// 최대/최소값 구하기(입력되는 수는 2자리 이하의 정수가 입력된다.)
// 2. Two Read방식
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max,min, su;
		boolean flag = true;

		System.out.print("두자리 정수를 입력하세요?(종료시는 999입력)");
		su = sc.nextInt();
		max = su;
		min = su;
		
		while (flag) {
			System.out.print("두자리 정수를 입력하세요?(종료시는 999입력)");
			su = sc.nextInt();

			if (su == 999) break;

			if (su > max) { 
				max = su;
			}
			else if (su < min) {
				min = su;
			}
		}
			System.out.println("최대값은?" + max);
			System.out.println("최소값은?" + min);
			sc.close();
		}
	}



//if (su > max) max = su;
//else if (su < min) min = su;		//이렇게 정리해도 된다.
