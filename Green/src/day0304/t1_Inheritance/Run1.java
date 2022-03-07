package day0304.t1_Inheritance;

public class Run1 {
	public static void main(String[] args) {
		System.out.println("--------A-----------");
		A a = new A();
		a.areaRec(10, 15);
		
		System.out.println("--------B-----------");
		B b = new B();
		b.areaCircle(10);
		b.areaRec(10, 15);		//자식이 항상 우선! 같은 메소드를 같고 있어도 자식 스스로 갖고 있는 메소드를 실행한다.
		System.out.println();
		
		System.out.println("--------C-----------");
		C c = new C();
		c.sadari(10, 15, 5);
		c.areaCircle(10);
		c.areaRec(10, 20);
		c.won(10);
	}
}
