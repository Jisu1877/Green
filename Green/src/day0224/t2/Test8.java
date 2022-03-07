package day0224.t2;

public class Test8 {
	public static void main(String[] args) {
		
		System.out.println("* 2단 ~ 5단 *");
		for(int i=2; i<=5; i++) {
			System.out.println("* "+i+"단");
			for(int j=1; j<=10; j++) {
				System.out.println(i+" * " +j+ " = " + (i*j));
			}
			System.out.println();
		}
	}
}
