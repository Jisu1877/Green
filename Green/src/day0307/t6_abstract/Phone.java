package day0307.t6_abstract;

public abstract class Phone {
	public String name;
	
	public Phone(String name) {
		this.name = name;
	}
	
	// 추상메소드는 추상클래스를 상속받아 구현하는 모든클래스가 꼭 사용해야 하는 메소드이다.
	public abstract void function(); // 각 회사의 주요기능
	public abstract void sound(); 	// 각 회사의 전화벨소리
	
	public abstract void functionLg(); //Lg에서 사용할 기능을 추상클래스로 등록시켰다.
	
	// 아래 두개의 메소드는 모든회사에서 공통적으로 사용
	// 필요시에는 사용하고 필요없을 때는 사용하지 않아도 된다.
	public void powerOn() {
		System.out.println(name + "님의 전화기 전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println(name + "님의 전화기 전원을 끕니다.");
	}
	
	
}
