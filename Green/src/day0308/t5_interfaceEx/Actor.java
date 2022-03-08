package day0308.t5_interfaceEx;

public class Actor implements PoliceMan, FireMan, Chef {

	@Override
	public void cooking() {
		System.out.println("요리를 합니다.");
	}

	@Override
	public void spagetti() {
		System.out.println("스파게티를 만듭니다.");
	}

	@Override
	public void fire() {
		System.out.println("불을 끕니다.");
	}

	@Override
	public void rescue() {
		System.out.println("인명을 구조합니다.");
	}

	@Override
	public void catching() {
		System.out.println("범인을 잡습니다.");
	}

	@Override
	public void search() {
		System.out.println("물건(사람)을 찾습니다.");
	}
	
}
