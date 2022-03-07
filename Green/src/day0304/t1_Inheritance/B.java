package day0304.t1_Inheritance;

//자식/ 부모클래스
public class B extends A{
	int r;
	public double pi = 3.141592;
//	private double pi = 3.141592;		//private 붙이면 C클래스의 원둘레 구하는 메소드에서 에러가 난다.
	
	//원 넓이
	public void areaCircle(int r) {
		double areaCircle = r * r * pi;
		System.out.println("원 넓이B? " + areaCircle);
	}
	
	public void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형의 면적B("+x+","+y+") = " + area);
	}
}
