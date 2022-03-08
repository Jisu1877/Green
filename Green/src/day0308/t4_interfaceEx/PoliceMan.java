package day0308.t4_interfaceEx;

public class PoliceMan implements Action {

	@Override
	public void catching() {
		System.out.println("범인을 잡습니다.");
	}

	@Override
	public void search() {
		System.out.println("물건(사람)을 찾습니다.");
	}

	@Override
	public void fire() {}

	@Override
	public void rescue() {}

	@Override
	public void cooking() {}

	@Override
	public void spagetti() {}

}
