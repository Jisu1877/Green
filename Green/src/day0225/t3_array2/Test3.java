package day0225.t3_array2;

public class Test3 {
	public static void main(String[] args) {
		int[][] su = new int[2][3];
		
//		su[0][0] = 10;
//		su[0][1] = 20;
//		su[0][2] = 30;
//		su[1][0] = 40;
//		su[1][1] = 50;
//		su[1][2] = 60;
		
		int num = 0;
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				num += 10;
				su[i][j] = num; 
			}
		}
		
//		System.out.println("su[0][0] = " + su[0][0]);
//		System.out.println("su[0][1] = " + su[0][1]);
//		System.out.println("su[0][2] = " + su[0][2]);
//		System.out.println("su[1][0] = " + su[1][0]);
//		System.out.println("su[1][1] = " + su[1][1]);
//		System.out.println("su[1][2] = " + su[1][2]);
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("su["+i+"]["+j+"] = " + su[i][j]);				
			}
		}
	}
}
