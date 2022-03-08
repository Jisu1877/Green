package day0308.t2_interface;

public class RemoteRun2 {
	public static void main(String[] args) {
//		Audio audio = new Audio();
//		Tv tv = new Tv();
//		Radio radio = new Radio();
//		RemoteControl audio = new Audio();
//		RemoteControl tv = new Tv();
//		RemoteControl radio = new Radio();

		RemoteControl[] rc = {new Audio(), new Tv(), new Radio()};	//상위 타입으로 자동타입변환.
		String[] title = {"오디오", "TV", "라디오"};
		
		for(int i = 0; i<rc.length; i++) {
			int volume = (int)(Math.random()*50);
			System.out.println("기기명칭 : " + title[i]);
			rc[i].switchOn(title[i]);
			rc[i].setVolume(volume);
			rc[i].switchOff();
			System.out.println("=================================\n");
		}
//		audio.switchOn("오디오");
//		audio.setVolume(25);
//		audio.setVolume(-5);
//		audio.setVolume(7);
//		audio.switchOff();
//		System.out.println("=====================================");
		
//		tv.switchOn("Tv");
//		tv.setVolume(25);
//		tv.setVolume(-5);
//		tv.setVolume(7);
//		tv.switchOff();
//		System.out.println("=====================================");
//		
//		radio.switchOn("Radio");
//		radio.setVolume(25);
//		radio.setVolume(-5);
//		radio.setVolume(7);
//		radio.switchOff();
//		System.out.println("=====================================");
	}
}
