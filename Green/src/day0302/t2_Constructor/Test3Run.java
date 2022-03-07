package day0302.t2_Constructor;

public class Test3Run {
	public static void main(String[] args) {
		Test3 t3A = new Test3();
		System.out.println("t3A.jumsu : " + t3A.jumsu);
		
		Test3 t3B = new Test3(100);
		System.out.println("t3B.jumsu : " + t3B.jumsu);
		
		Test3 t3C = new Test3(100, "홍길동");
		System.out.println("t3C.jumsu : " + t3C.jumsu);
		
		Test3 t3D = new Test3("홍길동", 100);
		System.out.println("t3D.jumsu : " + t3D.jumsu);
		
	}
}
