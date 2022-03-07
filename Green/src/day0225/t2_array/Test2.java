package day0225.t2_array;

public class Test2 {
	public static void main(String[] args) {
//		int kor = 100;
//		int eng = 80;
//		int mat = 70;
//		int soc = 90;
//		int sci = 60;
		int[] jumsu = new int[5];	// [5]는 길이를 말하는 것이다. int[]로 열었으면 반드시 new int[5];
		
		jumsu[0] = 100;				// 여기선 [] 안에 있는 숫자는 인덱스번지를 말한다.
		jumsu[1] = 80;
		jumsu[2] = 70;
		jumsu[3] = 90;
		jumsu[4] = 60;
		
		int tot = 0;
		double avg = 0.0;
		
//		tot = kor + eng + mat + soc + sci;
//		avg = tot / 5.0;
		
//		tot = jumsu[0] + jumsu[1] + jumsu[2] + jumsu[3] + jumsu[4];		//이렇게 짜면 배열이 의미가 없다.
		for(int i=0; i<5; i++) {
			tot += jumsu[i];
		}
		avg = tot /5.0;
		
		System.out.println("국어 : " + jumsu[0]);
		System.out.println("영어 : " + jumsu[1]);
		System.out.println("수학 : " + jumsu[2]);
		System.out.println("사회 : " + jumsu[3]);
		System.out.println("과학 : " + jumsu[4]);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
	}
}
