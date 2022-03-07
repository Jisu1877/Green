package day0224.t3_star;

/*
	1 2 3
  4 5 6
  7 8 9
*/
public class Test1 {
	public static void main(String[] args) {
		int res = 0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				//res++;
				System.out.print(++res + " "); //++res는 출력전에 1을 더해준다. 전위연산자. res++을 하면 0부터 출력된다.
			}
			System.out.println();
		}
	}
}
