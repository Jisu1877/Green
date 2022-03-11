package day0308.t6_interfaceEx;

public class Tank implements Toy {
	
	private int minAge = 10;
	
	@Override
	public void moving() {}

	@Override
	public void light() {}

	@Override
	public void missile() {
		System.out.println("미사일 발사를 할 수 있습니다.");
	}
	
	@Override
	public int getminAge() {
		return this.minAge;
	}

}
