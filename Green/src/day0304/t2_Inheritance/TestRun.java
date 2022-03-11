package day0304.t2_Inheritance;

public class TestRun {
	public static void main(String[] args) {
		Test2 t2 = new Test2(50, 100);						
		System.out.println("이곳은 TestRun입니다.");	
		
		t2.method2(); // 자식
		t2.method1(); // 부모
	}
}
