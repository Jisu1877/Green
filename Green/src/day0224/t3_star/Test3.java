package day0224.t3_star;

/*
  1 4 7
  2 5 8
  3 6 9
*/
public class Test3 {
	public static void main(String[] args) {
		int res = -2;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				res += 3;
				System.out.print(res + " ");
			}
			res -= 8;
			System.out.println();
		}
	}
}
