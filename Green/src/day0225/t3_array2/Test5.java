package day0225.t3_array2;

public class Test5 {
	public static void main(String[] args) {
		int[][] su = {
				{10,20},
				{30,40,50},
				{60}
		};
		
		
		for(int i=0; i<su.length; i++) {
			for(int j=0; j<su[i].length; j++) {
//				for(int j=0; j<su[i].length; j++) {			// 여기서 j<su[0]을 적었단 이야기는 0번 열의 크기 만큼까지 for문을 돌리겠다는 의미이다. 그 크기는 바로 2이다.
															// 근데 2번 열의 크기는 1이기 때문에 for문을 돌리면서 출력해줄 내용이 없다. 그래서 에러가 난다. 
															// 이와 같이 j<su[1]을 적으면 1번열의 크기 만큼 for문을 돌리자는 의미인데 바로 3이다. 근데 0번 열의 크기는 2이기때문에 (0,2) 자리에서 에러가 난다.
				System.out.println("su["+i+"]["+j+"] = " + su[i][j]);				
			}
		}
	}
}