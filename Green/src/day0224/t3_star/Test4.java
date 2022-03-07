package day0224.t3_star;

/*
  3 2 1
  6 5 4
  9 8 7
*/
public class Test4 {
	public static void main(String[] args) {
		int res = 4;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				res--;
				System.out.print(res + " ");
			}
			res += 6;				//1에서 다음으로 넘어가면 0인데 0에서 다음인 6이 출력되려면 +6을 해줘야한다.
			System.out.println();
		}
	}
}
