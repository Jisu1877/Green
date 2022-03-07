package day0304.t1_Inheritance;

// 부모클래스
public class A {
	public int x;
	public int y;
	
	//사격형의 면적
//	private void areaRec(int x, int y) {		//private 붙이면 상속 불가능.
	public void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형의 면적A("+x+","+y+") = " + area);
	}
}
