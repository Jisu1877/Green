package day0302.t3_method;

import java.util.Scanner;

public class Sum2Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Sum2 sum2 = new Sum2();
		int res;
		
		System.out.print("더하고자 하는 정수를 입력하세요?(입력후 Enter)");
		
//		res = sum2.add(1,2,3,4,5);			//매개값 5개 넘기기
		res = sum2.add(sc.nextInt(),sc.nextInt(),sc.nextInt());			//매개값 5개 넘기기
		System.out.println("res = " + res);
		
		sc.close();
	}
}
