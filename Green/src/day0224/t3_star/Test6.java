package day0224.t3_star;
/*
      * 
      * * 
      * * * 
      * * * * 
      * * * * *
 */
public class Test6 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {			// 열인 j가 i갯수만큼 찍히게 하기 위해 j<=i로 수정
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
