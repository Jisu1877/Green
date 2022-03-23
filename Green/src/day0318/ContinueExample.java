package day0318;

public class ContinueExample {
	public static void main(String[] args) {
		int tot = 0;
		for(int i = 1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			tot += i;
			System.out.println(i);
		}
		System.out.println("짝수의 합은? " + tot);
	}
}
