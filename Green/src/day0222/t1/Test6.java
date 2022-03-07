package day0222.t1;

// 타입변환
public class Test6 {
	public static void main(String[] args) {
		byte bb1 = 10;
		short ss1 = 5000;
		System.out.println("bb1 : " + bb1);
		System.out.println("ss1 : " + ss1);
		System.out.println();
		
//		ss1 = bb1; // 자동타입변환.
		bb1 = (byte) ss1;	//강제타입변환.
		System.out.println("ss1 : " + ss1);
		System.out.println("bb1 : " + bb1);

		int a1 = 100, a2;
		double b1 = 3.14;
		
		a2 = a1 + 200;	//값을 받기만할때는 초기화값이 없어도 가능하다.
		System.out.println("a2 : " + a2);
		System.out.println("a2 : " + a2);
		
		a2 = a1 + (int) b1;	//받는 쪽을 기준으로 타입을 변환시켜준다. a2가 int라서 b1을 int로 변경
		System.out.println("a2 : " + a2);
	
	}
}
