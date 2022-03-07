package day0303.t3_package;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		
		int comp = t1.comp(10);
//		System.out.println("comp : " + comp);
		t2.prn(comp);
	}
}
