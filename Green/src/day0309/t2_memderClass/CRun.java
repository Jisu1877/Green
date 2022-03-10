package day0309.t2_memderClass;

import day0309.t2_memderClass.C.D;

public class CRun {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.suC);
		c.methodC();
		
		
		//D 객체를 생성하여 일반멤버를 제어할 경우 - D객체를 생성할때 C객체를 생성할 필요가 없다.
		C.D d = new C.D();			//static으로 선언된 클래스는 이렇게 부른다.
		System.out.println("d.suD = " + d.suD);
		d.methodD();
		
		//D 객체를 생성하여 정적(static)멤버를 제어할 경우
		System.out.println("D.su2D : " + D.su2D );
		D.methodD2();
	}
}
