package day0308.t3_interface;

public interface RemoteControl {
	public int MAX_VOLUMN = 10;
	public int MIN_VOLUMN = 0;
	
	public void switchOn(String name);
	public void switchOff();
	public void setVolume(int volume);
}
