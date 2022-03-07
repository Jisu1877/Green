package day0302.t2_Constructor;

public class TestARun {
	public static void main(String[] args) {
		Test2 test2 = new Test2(60);
		
		System.out.println("jumsu : " + test2.jumsu);
//		new Test2(); 		//이렇게 하면 에러가 난다. Test2 클래스에는 기본생성자가 없기 때문에.
	}
}
