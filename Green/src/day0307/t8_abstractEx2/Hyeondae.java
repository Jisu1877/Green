package day0307.t8_abstractEx2;

public class Hyeondae extends Phone{

	public Hyeondae(String name) {
		super(name + "(Hyeondae)");
	}

	@Override
	public void function() {
		System.out.println(name + "폰은 내구성이 뛰어납니다.");
	}

	@Override
	public void sound() {
		System.out.println(name + "폰의 전화벨소리는 띠로링입니다.");
	}

	@Override
	public void functionLg() {}

	@Override
	public void functionSamsung() {}

	@Override
	public void functionHyeondae() {
		System.out.println("이번에 칼로리측정 기능을 추가했습니다.");
	}
}
