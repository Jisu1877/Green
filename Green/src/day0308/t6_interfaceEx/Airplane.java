package day0308.t6_interfaceEx;

public class Airplane implements Toy{

	@Override
	public void moving() {}

	@Override
	public void light() {
		System.out.println("불빛발사를 할 수 있습니다.");
	}

	@Override
	public void missile() {
		System.out.println("미사일 발사를 할 수 있습니다.");
	}

}
