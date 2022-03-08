package day0308.t2_interface;

public class RemoteRun {
	public static void main(String[] args) {
		Audio audio = new Audio();
		audio.switchOn("오디오");
		audio.setVolume(25);
		audio.setVolume(-5);
		audio.setVolume(7);
		audio.switchOff();
		System.out.println("=====================================");
		
		Tv tv = new Tv();
		tv.switchOn("Tv");
		tv.setVolume(25);
		tv.setVolume(-5);
		tv.setVolume(7);
		tv.switchOff();
		System.out.println("=====================================");
		
		Radio radio = new Radio();
		radio.switchOn("Radio");
		radio.setVolume(25);
		radio.setVolume(-5);
		radio.setVolume(7);
		radio.switchOff();
		System.out.println("=====================================");
	}
}
