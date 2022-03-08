package day0308.t4_interfaceEx;

public class Chef implements Action {

	@Override
	public void catching() {}

	@Override
	public void search() {}

	@Override
	public void fire() {}

	@Override
	public void rescue() {}

	@Override
	public void cooking() {
		System.out.println("요리를 합니다.");
	}

	@Override
	public void spagetti() {
		System.out.println("스파게티를 만듭니다.");
	}

}
