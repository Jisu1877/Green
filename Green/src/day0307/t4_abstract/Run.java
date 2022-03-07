package day0307.t4_abstract;

public class Run {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.aName = "멍멍이";
		dog.sound();
		
		Cat cat = new Cat();
		cat.animalaName = "야옹이";
		cat.talk();
	}
}
