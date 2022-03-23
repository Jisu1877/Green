package day0224.homework;

import java.util.Scanner;

/*
 문제1) 아래와 같은 모양의 다이아몬드 중간별의 갯수를 입력받아 다이아몬드를 만들어보자.(짝수로 입력시는 홀수개로 처리할 수 있도록 작업한다.)

중간별의 개수는? 9

    *

   ***

  *****

 *******

*********

 *******

  *****

   ***

    *
 */
public class Homework0224_diamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("중간별의 갯수를 입력해주세요.");
		num = sc.nextInt();

		if(num % 2 == 0) {
			num = num +1;
		}
	
		for(int i=1; i<=num/2+1; i++) {				// num/2+1을 한 이유는 예를들어 9를 입력받았을 때, 위에 삼각형에는 5개 행을 입력하고자 한것이다.
			for(int j=1; j<=num/2-i+1; j++) {		// num/2-i+1 은 예를들어 9를 입력받았을때 9/2-i+1이 되는데 이런 수식이 되어야(4 3 2 1 이렇게 줄어든다.)다음 행으로 넘어가며 계속 공백이 하나씩 줄어든다.
				System.out.print(" ");				
			}
			for(int j=1; j<=i*2-1; j++) {		// *을 누적해서 찍히게 하기 위해 j<=i*2-1 작성. 1<=1*2-1 는 1 <= 1 라서 *이 한개 찍히고 1<=2*2-1 는 1 <= 3 이기에 *이 세개 찍힌다.
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=1; i<=num/2; i++) {				// num/2을 한 이유는 예를들어 9를 입력받았을 때, 아래에 삼각형에는 4개 행을 입력하고자 한것이다.
			for(int j=1; j<=i; j++) {				// t3_star 패키지의 Test6처럼 하나씩 늘어가는 공백을 단순히 찍어준 것.
				System.out.print(" ");
			}
			for(int j=1; j<=num-2*i; j++) {			// num-2*i의 의미는 num-2n이다. *이 찍히는 값이 2개씩 줄어들게 하기 위해서. 예를들어 9를 입력받았을때 처음엔 1<=9-(2*1) 이기에 7개의 별이 찍힌다. 그다음엔 5개.
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}

