package day0224.t3_star;

/*
  9 8 7
  6 5 4
  3 2 1
*/
public class Test2 {
	public static void main(String[] args) {
		int res = 10;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				res--;
				System.out.print(res + " ");
			}
			System.out.println();
		}
	}
}
