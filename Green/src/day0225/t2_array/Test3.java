package day0225.t2_array;

public class Test3 {
	public static void main(String[] args) {
		int[] jumsu = new int[5];	// [5]는 길이를 말하는 것이다. int[]로 열었으면 반드시 new int[5];
		/*
		String[] kwamok = new String[5];
		
		kwamok[0] = "국어";
		kwamok[1] = "영어";
		kwamok[2] = "수학";
		kwamok[3] = "사회";
		kwamok[4] = "과학";
		 */
		
		String[] kwamok = {"국어", "영어", "수학", "사회", "과학"};	//new를 안쓰고서도 heap 영역에 객체생성을 하면서 바로 내용을 넣을 수 있다. 자동적으로 길이를 5로 지정한 것. 값과 크기를 바로 지정.
		
		jumsu[0] = 100;				// 여기선 [] 안에 있는 숫자는 인덱스번지를 말한다.
		jumsu[1] = 80;				// jumsu[]에는 내용을 입력받을거라서 String[] kwamok = {"국어", "영어", "수학", "사회", "과학"}; 이런식으로 고정시키지 않는다. 점수는 계속 변하는 영역이므로.
		jumsu[2] = 70;
		jumsu[3] = 90;
		jumsu[4] = 60;
		
		
		int tot = 0;
		double avg = 0.0;
		
		for(int i=0; i<5; i++) {
			tot += jumsu[i];
		}
		avg = tot /5.0;
		
//		System.out.println("국어 : " + jumsu[0]);
//		System.out.println("영어 : " + jumsu[1]);
//		System.out.println("수학 : " + jumsu[2]);
//		System.out.println("사회 : " + jumsu[3]);
//		System.out.println("과학 : " + jumsu[4]);
		for(int i=0; i<5; i++) {
			System.out.println(kwamok[i] + "의 점수는 "+jumsu[i]+"입니다.");
		}
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
	}
}
