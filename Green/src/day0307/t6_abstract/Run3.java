package day0307.t6_abstract;

public class Run3 {
	public static void main(String[] args) {
		Phone phoneSamsung = new Samsung("김말숙");
		phoneSamsung.powerOn();	//일반메소드호출
		phoneSamsung.sound(); 	//추상메소드호출(실제 수행할 내용은 구현클래스에서 오버라이드하여 사용하고 있다.)
		phoneSamsung.function();//추상메소드호출(실제 수행할 내용은 구현클래스에서 오버라이드하여 사용하고 있다.)
		
		//다운캐스팅을 이용하여 Samsung클래스의 functionSamsung()메소드 호출
		Samsung samsung = (Samsung) phoneSamsung;
		samsung.functionSamsung();
		
		phoneSamsung.powerOff(); //일반메소드호출
		System.out.println("===============================");
		
		Phone phoneLg = new Lg("홍길동");
		phoneLg.powerOn();	//일반메소드호출
		phoneLg.sound(); 	//추상메소드호출(실제 수행할 내용은 구현클래스에서 오버라이드하여 사용하고 있다.)
		phoneLg.function();//추상메소드호출(실제 수행할 내용은 구현클래스에서 오버라이드하여 사용하고 있다.)
		
		//추상클래스에 추상메소드로 등록 후 호출하는 방법
		
		
		phoneLg.powerOff(); //일반메소드호출
		System.out.println("===============================");
		
	}
}
