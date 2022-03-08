package day0308.t1_interface;

public interface Test1 {
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;			//static final 쓰지 않아도 상수로 컴파일한다.
	public int RADIUS = 0;
	
	public abstract void switchOn();
	void switchOff();
	public void sw(String name);
}
