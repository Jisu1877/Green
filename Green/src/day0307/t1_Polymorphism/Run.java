package day0307.t1_Polymorphism;

public class Run {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		
		A a1 = b;
		A a11 = new B();
		
		A a2 = c;
		A a22 = new C();
		
		D d = new D();
		B b11 = new D();
		A A22 = new D();
		
//		C c33 = new D(); 사촌관계는 전혀 관계 없다.
	}
}
