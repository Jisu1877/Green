package day0308.t7_homework;

public class Run {
	public static void main(String[] args) {
		
		
		Child child = new Child();
		
		
		Parent parent = child;
		
		parent.method1();
		parent.method2(); // 근데 오버라이딩 된 자식메소드는 사용가능.
		
		child.method3();	//자동타입변환 되지 않은 변수. 자식타입인 변수이기떄문에 자식메소드 호출가능.
//		parent.method3(); //부모타입으로 자동타입변환하면 자식메소드 사용불가.
		
	}
}
