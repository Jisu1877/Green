package day0222.t3_ifTest;

import java.util.Scanner;

// 키보드를 통한 입력클래스 : Scanner()
// 점수를 입력받아서 학점을 판정하시오.
// 점수가 90점 이상은 'A', 80점 이상은 'B', 70점 이상은 'C', 60점 이상은 'D', 60점 미만은 'F', 
public class Test7_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int jumsu;
		String grade;

		System.out.print("점수를 입력하세요. ");
		jumsu = sc.nextInt();

		if (jumsu >= 90) {
			grade = "A";
		} else if (jumsu >= 80) {
			grade = "B";
		} else if (jumsu >= 70) {
			grade = "C";
		} else if (jumsu >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("입력한 점수 " + jumsu + "는 " + grade + "입니다.");
		sc.close();
	}
}
