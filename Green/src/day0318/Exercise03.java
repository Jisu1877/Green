package day0318;

public class Exercise03 {
	public static void main(String[] args) {
		int tot = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				tot += i;
			}
		}
		System.out.println("3의 배수의 합: " + tot);
	}
}
