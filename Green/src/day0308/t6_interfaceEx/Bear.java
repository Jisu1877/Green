package day0308.t6_interfaceEx;

public class Bear implements Toy {
	
	private int minAge = 0;
	
	@Override
	public void moving() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}

	@Override
	public void light() {}

	@Override
	public void missile() {}

	@Override
	public int getminAge() {
		return this.minAge;
	}
}
