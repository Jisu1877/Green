package day0308.t6_interfaceEx;

public class Robot implements Toy {

	@Override
	public void moving() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}

	@Override
	public void light() {}

	@Override
	public void missile() {
		System.out.println("미사일 발사를 할 수 있습니다.");
	}
	
}
