package day0224.homework;

/*문제3) 아래과 같은 패턴으로 출력되는 프로그램을 만드시오?
@****
*@***
**@**
***@*
****@ */
public class Homework0224_3 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i == j) {
					System.out.print("@");
				}else	{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
