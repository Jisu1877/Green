package day0222.t1;

public class Test1 {
//	클래스 명은 첫글자 대문자!
	public static void main(String[] args) {
//		가상머신(JVM)이 main함수를 읽고 실행시키기 때문에 main함수는 실행시키고자 하는 클래스에선 필수이다.
		int atom;
		atom = 100;		//		정수

		
		int su1 = 05;	// 8진수표기시는 첫문자에 '0'을 붙여준다.
		int su2 = 010;	// 8진수 10은 10진수? 10진수로 8
		int su3 = 017;	
		
		System.out.println("atom : " + atom);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		System.out.println("su3 : " + su3);
		System.out.println();
		
		// 16진수를 표시할때는 앞쪽에 '0x' 표시한다.
		int su11 = 0x5;		// 16진수 5는 10진수? 5
		int su12 = 0xA;		// 16진수 A는 10진수? 10
		int su13 = 0xF;		// 16진수 F는 10진수? 15
		int su14 = 0xa;		// 대소문자 구분없이 0xa도 10
		int su15 = 0x20;		// 16진수 a는 10진수? 32
		System.out.println("su11 : " + su11);
		System.out.println("su12 : " + su12);
		System.out.println("su13 : " + su13);
		System.out.println("su14 : " + su14);
		System.out.println("su15 : " + su15);
		System.out.println();
		
		// 2진수는 '0b'로 시작표시한다.
		int su21 = 0b1;		// 2진수 1은 10진수? 1
		int su22 = 0b10;	// 2진수 10은 10진수? 2
		int su23 = 0b1100;	// 2진수 1100은 10진수? 12
		
		System.out.println("su21 : " + su21);
		System.out.println("su22 : " + su22);
		System.out.println("su23 : " + su23);
	}
}
