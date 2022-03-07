package day0303.t7_Singleton;

public class Singleton2Run {
	public static void main(String[] args) {
		Singleton hkd = Singleton.getInstance();
		Singleton kms = Singleton.getInstance();
		Singleton lkj = Singleton.getInstance();
		
		if(hkd == kms) {
			System.out.println("홍길동과 김말숙은 같은 객체를 사용 중입니다.");
		}else {
			System.out.println("홍길동과 김말숙은 서로 다른 객체를 사용 중입니다.");
		}
		
		if(hkd == lkj) {
			System.out.println("홍길동과 이기자는 같은 객체를 사용 중입니다.");
		}else {
			System.out.println("홍길동과 이기자는 서로 다른 객체를 사용 중입니다.");
		}
	}
}
