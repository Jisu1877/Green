package day0307.t8_abstractEx2;

public class Lg extends Phone {

	public Lg(String name) {
		super(name + "(LG)");
	}

	@Override
	public void function() {
		System.out.println(name + "폰은 화질 성능이 우수합니다.");
	}

	@Override
	public void sound() {
		System.out.println(name + "폰의 전화벨소리는 따르릉입니다.");
	}
	
	public void functionLg() {
		System.out.println("이번에 심박동 측정기를 추가했습니다.");
	}

	@Override
	public void functionSamsung() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void functionHyeondae() {
		// TODO Auto-generated method stub
		
	}
}
