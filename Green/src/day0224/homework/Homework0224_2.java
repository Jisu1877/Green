package day0224.homework;

import java.util.Scanner;

/*문제2) 컴퓨터가 1~100까지의 정수형 난수를 발생시켜서 기억시켜두고, 사용자는 그 숫자를 맞춰보자.

이때 기억된 수가 78이었다라고 한다면, 78보다 적은수를 입력하였다면 '더큰수를 입력하세요', 또한 '78'보다 큰수를 입력했다면 '더 작은수를 입력하세요'라는 문구를 출력한다.

최종적으로 맞추었을때의 수행 횟수를 출력하시오.*/
public class Homework0224_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int res, guess;
		res = (int)(Math.random()*100);
		int cnt=0;
		System.out.print("숫자를 맞춰보세요.");
		while(true) {
			cnt++;
			guess = sc.nextInt();		
			if(res > guess) {
				System.out.print("더 큰수를 입력하세요.");
			}else if(res < guess) {
				System.out.print("더 작은 수를 입력하세요.");
			}else {
				System.out.println("축하합니다. "+cnt+"번만에 맞췄습니다! 정답은 "+res+"입니다.");
				break;
			}
		}
		sc.close();
	}
}