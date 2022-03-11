package day0309.t3_localClass;

public class ERun {
	public static void main(String[] args) {
		E e = new E();
		System.out.println("e.suE : " + e.suE);
		e.methodE1();			//e.methodE1(); 를 호출하면서 내부안에 있는 F클래스 내용도 모두 실행된다.
		
//		e$1F.new F(); //로컬클래스는 외부에서 생성 후 호출할 수 없다. 
	}
}
