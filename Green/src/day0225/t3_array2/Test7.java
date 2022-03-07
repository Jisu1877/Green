package day0225.t3_array2;

// 배열 복사
public class Test7 {
	public static void main(String[] args) {
		int[] su1 = {10,20,30,40,50};
		int[] su2 = new int[5];
		
		//su1 배열의 값을 su2배열로 복사
		for(int i=0; i<su1.length; i++) {
			su2[i] = su1[i];
		}
		
		System.out.println("su1 배열의 내용");
		for(int i=0; i<su1.length; i++) {
			System.out.println("su1["+i+"] : " + su1[i]);
		}
		System.out.println();

		System.out.println("su2 배열의 내용");
		for(int i=0; i<su2.length; i++) {
			System.out.println("su1["+i+"] : " + su1[i]);
		}
	}
}
