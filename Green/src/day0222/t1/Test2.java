package day0222.t1;
// 정수형(byte, short, char, int, long)
public class Test2 {
	public static void main(String[] args) {
		byte bb1 = 10;
		byte bb2 = 127;
		//		byte bb3 = 128;
		System.out.println("bb1 : " + bb1);
		System.out.println("bb2 : " + bb2);
		
		short ss1 = 128;
		short ss2 = 32000;
		//		short ss2 = 33000;
		System.out.println("ss1 : " + ss1);
		System.out.println("ss2 : " + ss2);
		
		int ii1 = 33000;
		int ii2 = 2100000000;
		//		int ii3 = 2200000000;
		System.out.println("ii1 : " + ii1);
		System.out.println("ii2 : " + ii2);
		
		long ll1 = 2200000000L;
		long ll2 = 123400000000L;
		System.out.println("ll1 : " + ll1);
		System.out.println("ll2 : " + ll2);
		
		char cc1 = 'A';		// 유니코드 : 65(아스키코드값과 같다) 외워야함 // B는 66
		char cc2 = 'a';		// 유니코드 : 97(영문 대문자와의 차이값은 +32 소문자로 바꾸고싶으면 32를 더하기) 
		
		System.out.println(cc1);
		System.out.println(cc2);
		
		int iii1 = 'A';
		int iii2 = 'a';
		System.out.println(iii1);
		System.out.println(iii2);
	}
}
