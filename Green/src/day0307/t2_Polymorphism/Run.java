package day0307.t2_Polymorphism;

public class Run {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a1);
		System.out.println(b.b1);
		b.methodA();
		b.methodB();
		
		A a1 = new B();
		System.out.println(a1.a1);  //B클래스에 있는 필드는 보이지 않는다.
		a1.methodA();
		
		//이게 상속!
		D d = new D();
		System.out.println(d.a1);
		System.out.println(d.b1);
		System.out.println(d.d1);
		d.methodA();
		d.methodB();
		d.methodD();
		
		//타입변환하면??
		B b1 = new D(); //B행세를 하는 D , 이제 D에 있는건 못쓴다.(내 자신은 은닉) B의 것, 그리고 B의 부모인 A의 것을 사용가능하다.
		System.out.println(b1.a1);
		System.out.println(b1.b1);
		b1.methodA();
		b1.methodB();
		
		A a2 = new D();	//이제는 A의 것만 사용 가능하다.
		System.out.println(a2.a1);
		a2.methodA();
	}
}
