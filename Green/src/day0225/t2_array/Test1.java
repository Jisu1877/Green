package day0225.t2_array;

public class Test1 {
	public static void main(String[] args) {
		int kor = 100;
		int eng = 80;
		int mat = 70;
		int soc = 90;
		int sci = 60;
		
		int tot = 0;
		double avg = 0.0;
		
		tot = kor + eng + mat + soc + sci;
		avg = tot / 5.0;
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("사회 : " + soc);
		System.out.println("과학 : " + sci);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
	}
}
