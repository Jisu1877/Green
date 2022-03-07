package day0225.t3_array2;

public class Test1 {
	public static void main(String[] args) {
		int[][] su = new int[2][3];
		
		System.out.println("배열의 크기 (su.length) : " + su.length); 	// 배열이름만 넣으면 행의 크기를 알 수 있다.
		System.out.println("배열의 크기 (su[0].length) : " + su[0].length); 	//0번 행 열의 갯수를 알 수 있다.
		System.out.println("배열의 크기 (su[1].length) : " + su[1].length); 	//1번 행 열의 갯수를 알 수 있다.
	}
}
