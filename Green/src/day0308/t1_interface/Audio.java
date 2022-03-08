package day0308.t1_interface;

public class Audio implements Test1 {

	@Override
	public void switchOn() {
		System.out.println("스위치를 켭니다.");
	}

	@Override
	public void switchOff() {
		System.out.println("스위치를 끕니다.");
	}

	@Override
	public void sw(String name) {
		System.out.println(name + "가 전원을 켭니다.");
	}

}
