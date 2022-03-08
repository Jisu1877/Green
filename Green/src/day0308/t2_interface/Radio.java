package day0308.t2_interface;

public class Radio implements RemoteControl {
	private String name;
	private int volume;
	
	@Override
	public void switchOn(String name) {
		this.name = name;
		System.out.println(name + " 전원을 켭니다.");
	}

	@Override
	public void switchOff() {
		System.out.println(name + " 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUMN + 5) {
			this.volume = MAX_VOLUMN + 5;
		}
		else if(volume < MIN_VOLUMN) {
			this.volume = MIN_VOLUMN;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 "+name+"의 볼륨은? " + this.volume);
	}

}
