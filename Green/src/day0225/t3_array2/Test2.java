package day0225.t3_array2;

public class Test2 {
	public static void main(String[] args) {
		int[][] su = new int[2][3];
		
		su[0][0] = 10;
		su[0][1] = 20;
		su[0][2] = 30;
		su[1][0] = 40;
		su[1][1] = 50;
		su[1][2] = 60;
		
		System.out.println("su[0][0] = " + su[0][0]);
		System.out.println("su[0][1] = " + su[0][1]);
		System.out.println("su[0][2] = " + su[0][2]);
		System.out.println("su[1][0] = " + su[1][0]);
		System.out.println("su[1][1] = " + su[1][1]);
		System.out.println("su[1][2] = " + su[1][2]);
	}
}
