package day0308.t1_interface;

public class Run {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
//		Audio audio = new Audio();
		Test1 audio = new Audio();			//인터페이스로도 타입변환이 가능하다.
		
		System.out.println("최대볼륨? " + audio.MAX_VOLUME);
		System.out.println("최소볼륨? " + audio.MIN_VOLUME);

		
		audio.sw("오디오");
		audio.switchOn();
		audio.switchOff();
	}
}
