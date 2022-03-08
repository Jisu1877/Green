package day0308.t6_interfaceEx;

public class Tank implements Toy {

	@Override
	public void moving() {}

	@Override
	public void light() {}

	@Override
	public void missile() {
		System.out.println("미사일 발사를 할 수 있습니다.");
	}

}
