package day0303.t2_final;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1("123-456");
		System.out.println("국적 : " + Test1.NATION);
		System.out.println("주민번호 : " + t1.jumin);
		System.out.println("성명 : " + t1.name);
		System.out.println();
		
		Test1 t11 = new Test1("China","456-789","칭따오");
		System.out.println("국적 : " + Test1.NATION);
		System.out.println("주민번호 : " + t11.jumin);
		System.out.println("성명 : " + t11.name);
		System.out.println();
		
		t11.change("Japan","111-222","김김김");
		System.out.println("국적 : " + Test1.NATION);
		System.out.println("주민번호 : " + t11.jumin);
		System.out.println("성명 : " + t11.name);
	}
	
}
