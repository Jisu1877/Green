package day0307.t9_exam;

public class Exam1 {
	public static void main(String[] args) {
		int tot = 0;
		for(int i=0; i<=100; i++) {
			if(i % 2 == 0) {
				tot = tot + i;
			}
		}
		System.out.println("2의 배수의 합 : " + tot);
		System.out.println();
		for(int i=0; i<=100; i++) {
			if(i % 3 == 0) {
				tot = tot + i;
			}
		}
		System.out.println("3의 배수의 합 : " + tot);
		System.out.println();
	}		
}
