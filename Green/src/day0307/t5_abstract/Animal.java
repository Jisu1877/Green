package day0307.t5_abstract;

// 추상클래스
// 만드는 방법 : 클래스명 앞에 abstract를 붙인다.
// 특징 : 팀원들이 사용할 공통적인 필드나 메소드만 정의해서 사용하는 것이 좋다.
// 		단, 예외적으로 일반 필드나 일반 메소드를 사용할 수 있다.
public abstract class Animal {
//	abstract String animalaName;
	String animalName;
	
	abstract void sound();	//추상메소드는 실행블록이 없다.
	
	void moving(String name) {		//추상클래스엔 일반메소드도 사용 가능.
		System.out.println(name + "가(이) 어스렁 움직입니다.");
	}

}
