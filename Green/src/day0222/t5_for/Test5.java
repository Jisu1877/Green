package day0222.t5_for;

import java.util.Scanner;

// 두수를 입력하여 첫수부터 두번째 수까지의 합을 구하시오?
// 전제조건, 첫번째 수는 두번째수보다 클 수 없다.
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1, su2, tot=0;
		
		System.out.print("첫번째 정수를 입력하세요? ");
		su1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요? ");
		su2 = sc.nextInt();
		
		for(int i=su1; i<=su2; i++) {
			tot += i;
		}
		System.out.println(su1 + "부터 "+su2+"까지의 합은?" + tot);
		sc.close();
	}
}
