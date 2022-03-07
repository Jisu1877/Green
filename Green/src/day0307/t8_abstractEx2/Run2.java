package day0307.t8_abstractEx2;
// 요구사항분석....
// 1. 각 회사(삼성(Samsung)/LG(lg)에서 전화기(Phone)을 생산하고 있다.
// 2. 각 전화기(Phone)에는 반드시 사용해야할, 주된 기능(founction())과 기본 소리(sound())가 있다.
// 3. 삼성전화기의 주된기능은 '사진촬영기능'이고, LG전화기의 주된기능은 '화질이 우수함'이다.
// 4. 각 전화기가 공통적으로 사용하고 있는 기능은? 전원켜기(powerOn()), 전원끄기(powerOff())가 있다.
// 5. 사용자가 선택한 전화기에 따른 각각의 모든 특징과 기능을 출력해보시오.
public class Run2 {
	public static void main(String[] args) {
		
		Phone phonelg = new Lg("홍길동");
		phonelg.powerOn();
		phonelg.sound();
		phonelg.function();
		
		Lg phonelg_1 = (Lg) phonelg;
		phonelg_1.functionLg();
		phonelg.powerOff();
		System.out.println();
		
		
		Phone PhoneSamsung = new Samsung("김말숙");
		PhoneSamsung.powerOn();
		PhoneSamsung.sound();
		PhoneSamsung.function();
		
		Samsung poneSamsung_1 = (Samsung) PhoneSamsung;
		poneSamsung_1.functionSamsung();
		PhoneSamsung.powerOff();
	}
}
