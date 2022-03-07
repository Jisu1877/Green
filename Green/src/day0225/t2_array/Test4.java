package day0225.t2_array;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] jumsu = new int[5];	// [5]는 길이를 말하는 것이다. int[]로 열었으면 반드시 new int[5];

		String[] kwamok = {"국어", "영어", "수학", "사회", "과학"};	//new를 안쓰고서도 heap 영역에 객체생성을 하면서 바로 내용을 넣을 수 있다. 자동적으로 길이를 5로 지정한 것.
		
//		jumsu[0] = 100;				// 여기선 [] 안에 있는 숫자는 인덱스번지를 말한다.
//		jumsu[1] = 80;				// jumsu[]에는 내용을 입력받을거라서 String[] kwamok = {"국어", "영어", "수학", "사회", "과학"}; 이런식으로 고정시키지 않는다. 점수는 계속 변하는 영역이므로.
//		jumsu[2] = 70;
//		jumsu[3] = 90;
//		jumsu[4] = 60;
		
		for(int i=0; i<5; i++) {
			System.out.print(kwamok[i] + "점수를 입력하세요? ");
			jumsu[i] = sc.nextInt();
		}
		int tot = 0;
		double avg = 0.0;
		
		for(int i=0; i<5; i++) {
			tot += jumsu[i];
		}
		avg = tot /5.0;
		
		for(int i=0; i<5; i++) {
			System.out.println(kwamok[i] + "의 점수는 "+jumsu[i]+"입니다.");
		}
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		
		sc.close();
		
	}			// 메인 메소드 중괄호
}				// 클래스 중괄호    **마지막에 중괄호는 무조건 2개!
