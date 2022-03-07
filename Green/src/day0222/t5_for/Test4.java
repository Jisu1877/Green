package day0222.t5_for;

import java.util.Scanner;

// 수를 입력하여 1부터 입력한 수까지의 합을 구하시오?
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su, tot=0;
		
		System.out.print("정수를 입력하세요? ");
		su = sc.nextInt();
		
		for(int i=1; i<=su; i++) {
			tot += i;
		}
		System.out.println("1부터 "+su+"까지의 합은?" + tot);
		sc.close();
	}
}
