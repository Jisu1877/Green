package day0308.t4_interfaceEx;

public class FireMan implements Action {

	@Override
	public void catching() {}

	@Override
	public void search() {}

	@Override
	public void fire() {
		System.out.println("불을 끕니다.");
	}

	@Override
	public void rescue() {
		System.out.println("인명을 구조합니다.");
	}

	@Override
	public void cooking() {}

	@Override
	public void spagetti() {}

}
