package day0304.t2_Inheritance;

public class Test1 {
	
	public Test1() {
		System.out.println("Test1-0");
	}
	
	public Test1(int su1) {
		System.out.println("이곳은 Test1-1입니다." + su1);
	}
	
	public Test1(int su1, int su2) {
		System.out.println("이곳은 Test1-2입니다." + su1 + su2);
	}
	
	void method1() {
		System.out.println("이곳은 Test1의 method1입니다.");
	}
}
