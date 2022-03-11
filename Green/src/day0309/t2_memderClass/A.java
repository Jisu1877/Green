package day0309.t2_memderClass;

public class A {
	int suA = 100;
	
	public A() {
		System.out.println("이곳은 A객체");
	}
	
	public void methodA() {
		System.out.println("이곳은 A객체의 methodA 입니다.");
	}
	
	public class B {		//중첩클래스 호출하려면 A$B(); 로 불러야한다.
		int suB = 200;
		
		public B() {
			System.out.println("이곳은 A$B객체 입니다.");
		}
		
		public void methodB() {
			System.out.println("이곳은 B의 객체의 methodB 입니다.");
		}
	}
	
}
