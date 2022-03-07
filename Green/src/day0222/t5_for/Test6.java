package day0222.t5_for;

import java.util.Scanner;

// 두수를 입력하여 첫수부터 두번째 수까지의 합을 구하시오?
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1, su2, tot = 0;

		while (true) {
			System.out.print("첫번째 정수를 입력하세요? ");
			su1 = sc.nextInt();
			System.out.print("두번째 정수를 입력하세요? ");
			su2 = sc.nextInt();
			if(su1 < su2) {
				break;
			}
			else {
				System.out.println("첫번째 수는 두번째 수보다 작은 수를 입력하셔야 합니다.");
			}
		}

		for (int i = su1; i <= su2; i++) {
			tot += i;
		}
		System.out.println(su1 + "부터 " + su2 + "까지의 합은?" + tot);
		sc.close();
	}
}
