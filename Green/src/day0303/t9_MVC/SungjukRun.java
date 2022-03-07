package day0303.t9_MVC;

import java.util.Scanner;

public class SungjukRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] st = new int[4];
		String name = "";
		String[] title = {"학번", "성명", "국어점수", "영어점수", "수학점수", "총점", "평균", "학점"};
		
		System.out.print(title[0] + "을 입력하세요? ");
        st[0] = sc.nextInt();
        System.out.print(title[1] + "을 입력하세요? ");
        name = sc.next();
		
		for(int i=2; i<5; i++) {
			System.out.print(title[i] + "을 입력하세요? ");
			st[i-1] = sc.nextInt();
		}
		
		SungjukVO vo = new SungjukVO(st[0], name, st[1], st[2], st[3]);
		SungjukService service = new SungjukService();
		System.out.println();
		
		System.out.println("\t\t**성적표**");
		System.out.println("=============================================================");
		for(int i=0; i<title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
		System.out.println("=============================================================");
		System.out.println(st[0] + "\t" + name + "\t" + st[1] + "\t" + st[2] + "\t" + st[3] + "\t" + vo.getTot() + "\t" + String.format("%.2f", vo.getAvg()) + "\t" + service.getGrade(vo.getAvg()));
		
	}
}
