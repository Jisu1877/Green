package day0224.t4_random;

//random()메소드 : 난수
public class Test1 {
	public static void main(String[] args) {
		System.out.println("* 난수(0.0~1.0미만) 발생하기(0.0 <= 실수형 난수 < 1) *");
		System.out.println(Math.random());
		System.out.println();

		System.out.println("* 난수(0~9까지의 정수형난수) 발생하기(0 <= 실수형 난수 < 10) *");
		System.out.println((int)(Math.random()*10));								// (Math.random()*10) 한거에 강제타입변환해야한다. () 중요
		System.out.println();
		
		System.out.println("* 난수(1~10까지의 정수형난수) 발생하기(1 <= 실수형 난수 < 11) *");
		System.out.println((int)(Math.random()*10)+1);
		System.out.println();
		
		System.out.println("* 난수(1~10까지의 정수형난수) 발생하기(1 <= 실수형 난수 < 11) *");
		System.out.println((int)(Math.random()*45)+1);
		System.out.println();
	}
}
