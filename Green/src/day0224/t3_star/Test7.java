package day0224.t3_star;
/*
	  * * * * *
	  * * * * 
	  * * * 
	  * * 
      * 
 */
public class Test7 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {			// 6-i 는 i가 5 4 3 2 1 이렇게 변하게 하기 위해서 지정했다.
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
