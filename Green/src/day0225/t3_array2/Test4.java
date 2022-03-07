package day0225.t3_array2;

public class Test4 {
	public static void main(String[] args) {
//		int[][] su = new su[]; 		// 이 땐 크기를 넣어주지 않으면 에러난다. new su[] 라는건 이미 heap 영역에 자리를 만들어 놓고 값을 넣을 준비를 한단 소린데 값을 안넣었으니 에러가 난다.
//		int[][] su = {}; 			// 이 땐 크기를 넣어주지 않아도 에러가 안난다? {}; 이렇게 표현했다는건 주소값만 찍었고 new 처럼 자리를 만든건 아니다. 그래서 동적메모리로 사용하겠다는 뜻으로 받아들인다. 나중에 내용을 넣어주겠다는 뜻.
//		int[][] su = {{10,20,30},{40,50,60}};
		int[][] su = {
				{10,20,30},
				{40,50,60}
		};
		
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.println("su["+i+"]["+j+"] = " + su[i][j]);				
//			}
//		}
		for(int i=0; i<su.length; i++) {
			for(int j=0; j<su[0].length; j++) {
				System.out.println("su["+i+"]["+j+"] = " + su[i][j]);				
			}
		}
	}
}