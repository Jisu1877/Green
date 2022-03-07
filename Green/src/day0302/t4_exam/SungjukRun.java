package day0302.t4_exam;

import java.util.Scanner;

public class SungjukRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sungjuk sungjuk = new Sungjuk();
		
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
		
		
		
		tot = sungjuk.sum(kor, eng, mat);
		avg = sungjuk.avg(tot);
		grade = sungjuk.grade(avg);
		
		
		System.out.println("성명 : " + name);
		System.out.println("총점 : " + tot);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("학점 : " + grade);
		System.out.println("수고하셨습니다.");
		
		sc.close();
	}
}
