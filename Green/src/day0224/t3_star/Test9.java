package day0224.t3_star;
/*
 * * * * *
   * * * * 
     * * * 
       * * 
         * 
 */
public class Test9 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {					// 행을 만들어주는 for문
			for(int j=1; j<=i-1; j++) {				// 열에서 공백을 만들어주는 for문
				System.out.print(" ");
			}
			for(int j=1; j<=6-i; j++) {			
				System.out.print("*");				// 열에서 *을 만들어주는 for문
			}
			System.out.println();
		}
	}
}
