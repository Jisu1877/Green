package day0307.t5_abstract;

public class Cat extends Animal{
	String animalName = "고양이";
	String talk = "야옹!!";
	
	@Override
	void sound() {
		System.out.println(animalName + " 울음소리는? " + talk);
	}
	
	
}
