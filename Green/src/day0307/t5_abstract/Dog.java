package day0307.t5_abstract;

public class Dog extends Animal {
	String aName = "강아지";
	String sound = "멍멍멍!!!";
	
	@Override
	void sound() {		//추상클래스의 추상메소드를 오버라이딩함.
		System.out.println(aName + " 울음소리는? " + sound);
	}
}
