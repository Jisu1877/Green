package day0222.t3_ifTest;

import java.util.Scanner;

// 성명, 국어, 영어, 수학 점수를 입력받아서, 총점, 평균, 학점을 계산하시오.
// 합격 불합격을 판정하시오.
// 합격의 조건은 평균이 60이상이고, 각 과목의 점수가 40점 이상일 경우이다.
// 앞의 조건을 만족하지 않으면 모두 불합격 처리시키시오.(불합격 처리 사유도 입력- 평균미달, 과목미달)
public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, mat, tot;
		double avg;
		String grade;
		
		System.out.print("성명을 입력하세요? ");
		name = sc.next();				//next()와 nextLine()과의 차이?
		System.out.print("국어점수를 입력하세요? ");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요? ");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요? ");
		mat = sc.nextInt();
		
		tot = kor + eng + mat;
		avg = (double) tot / 3;
		
		if(avg >= 90) grade = "A";
		else if(avg >= 80) grade = "B";
		else if(avg >= 70) grade = "C";
		else if(avg >= 60) grade = "D";
		else grade = "F";

		// 합격자 판별처리
		String result = " ";
		if(avg >= 60) {
			if(kor >= 40) {
				if(eng >= 40) {
					if(mat >= 40) {
						result = "합격";
					}
					else {
						result = "수학점수 과락으로 불합격";
					}
				}
				else {
					result = "영어점수 과락으로 불합격";
				}
			}
			else {
				result = "국어점수 과락으로 불합격";
			}
		}
		else {
			result = "평균점수 미달로 불합격";
		}
		System.out.println("========================");
		System.out.println("성명은? " + name);
		System.out.println("국어점수는? " + kor);
		System.out.println("영어점수는? " + eng);
		System.out.println("수학점수는? " + mat);
		System.out.println("총점은? " + tot);
		System.out.printf("평균은? %.2f\n", avg);	//0자리확보후 소수점 2자리까지 출력. %f는 실수.
		System.out.println("학점은? " + grade);
		System.out.println("판별? " + result);
		
		sc.close();
	}
}
