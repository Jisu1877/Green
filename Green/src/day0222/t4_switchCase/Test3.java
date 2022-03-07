package day0222.t4_switchCase;

import java.util.Scanner;

// 점수를 입력받는다.
// 점수가 90점 이상은 'A', 80점 이상은 'B', 70점 이상은 'C', 60점 이상은 'D', 60점 미만은 'F'
public class Test3 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int jumsu;
		String grade;
		
		System.out.print("점수를 입력하세요. ");
		jumsu = sc.nextInt();
		
		switch(jumsu / 10) {			// 와 진짜 변수를 나눌 생각은 1도 못했다...
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
				
		}
		System.out.println("입력된 점수 "+jumsu+"는 "+grade+"학점 입니다.");
		sc.close();
	}
}
