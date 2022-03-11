package day0309.t2_memderClass;

public class ARun {
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println("a.suA = " + a.suA);
		a.methodA();
		System.out.println();
		
//		B b = new B(); //독립적으로 생성불가.
		//B객체는 A객체가 존재해야 생성할 수 있다. 생성하려면 ? a.new B(); 
		A.B b = a.new B(); 	//A객체를 통해서 생성가능.
		System.out.println("b.suB : " + b.suB);
		b.methodB();
	}
}
