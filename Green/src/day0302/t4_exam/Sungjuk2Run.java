package day0302.t4_exam;
// 생성자를 이용해서 처리하는 방법. 생성자를 생성하면서 값을 입력받는다.
import java.util.Scanner;

public class Sungjuk2Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, mat, tot;
		double avg;
		char grade;
		
		System.out.print("성명을 입력하세요? ");
		name  = sc.next();
		
		System.out.print("국어점수를 입력하세요? ");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요? ");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요? ");
		mat = sc.nextInt();
		
		Sungjuk2 sungjuk2 = new Sungjuk2(name, kor, eng, mat);
		
		
		tot = sungjuk2.sum();
		avg = sungjuk2.avg(tot);
		grade = sungjuk2.grade(avg);
		
		
		System.out.println("성명 : " + name);
		System.out.println("총점 : " + tot);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("학점 : " + grade);
		System.out.println("수고하셨습니다.");
		
		sc.close();
	}
}
