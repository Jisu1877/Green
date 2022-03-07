package day0307.t6_abstract;

public class Samsung extends Phone {
	public Samsung(String name) {
		super(name + "(Samsung)");
	}

	@Override
	public void function() {
		System.out.println(name + "폰은 사진 촬영기능이 우수합니다.");
	}

	@Override
	public void sound() {
		System.out.println(name + "폰의 전화벨소리는 삐리리리입니다.");
	}
	
	public void functionSamsung() {
		System.out.println("이번에 만보기를 추가했습니다.");
	}
	
	//아래의 메소드는 Lg모델에만 적용되기에 삼성에서는 사용하지 않는 메소드...
	@Override
	public void functionLg() {}
	
}
