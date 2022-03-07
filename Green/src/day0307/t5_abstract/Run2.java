package day0307.t5_abstract;

public class Run2 {
	public static void main(String[] args) {
		Animal animalDog = new Dog();
		animalDog.sound(); 	//부모의 sound();메소드를 불러오는데 내용은 자식객체에서 가져온다.
		//추상클래스의 추상메소드는 강제타입변환하지 않아도 된다.
		animalDog.moving("강아지");
		System.out.println();
		
		Animal animalCat = new Cat();
		animalCat.sound();
		animalCat.moving("고양이");
	}
}
