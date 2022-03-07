package day0225.t3_array2;

// 배열복사 : System.arraycopy(원본배열,원본시작인덱스,복사될배열,복사될시작인덱스,복사횟수)
public class Test8 {
	public static void main(String[] args) {
		int[] su1 = {10,20,30,40,50};				// 보내는 쪽 크기 : 5
		int[] su2 = new int[6];						// 받는 쪽 크기 : 6 // 이러면 에러가 나지 않는다. 마지막 값이 0이 나온다. 하지만 크기가 보내는쪽 > 받는 쪽 이라면 에러가 난다.
		
		System.arraycopy(su1, 0, su2, 0, su1.length);
		
		System.out.println("su1 배열의 내용");
		for(int i=0; i<su1.length; i++) {
			System.out.println("su1["+i+"] : " + su1[i]);
		}
		System.out.println();

		System.out.println("su2 배열의 내용");
		for(int i=0; i<su2.length; i++) {
			System.out.println("su2["+i+"] : " + su2[i]);
		}
	}
	
}
