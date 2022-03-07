package day0304.t1_Inheritance;

//자식클래스
public class C extends B{
	int a, b, h;
	
	//사다리꼴 넓이
	public void sadari(int a, int b, int h) {
		double areaSadari = (a + b) * h / 2.0;
		System.out.println("사다리꼴 넓이? " + areaSadari);
	}
	
	//원둘레
//	public static void won(int r) {			//static을 붙이면 부모클래스에서 가져오는 필드도 static으로 선언되어있어야 에러가 안난다.
	public void won(int r) {			
		double wondul = 2 * r * pi;
		System.out.println("원둘레 : " + wondul);
	}
	
	public void areaCircle2(int r) {			
		int a = 10;
		System.out.println("a = " + a);
	}
	
	//원넓이
	public void areaCircle(int r) {					// 부모와의 선언부가 똑같아야 오버라이딩이다. 그래서 오버라이딩은 리턴타입을 수정하면 안된다.
//		double areaCircle = r * r * pi;
		double areaCircle = r * r * Math.PI;			//부모의 메소드를 자식클래스에서 재정의해서 사용하는 것. -> 오버라이딩.
		System.out.println("원 넓이C? " + areaCircle);
	}

	
	 @Override
	public void areaRec(int x, int y) { 	//메소드 변수명 치고 ctrl+스페이스바 치면 바로 나온다.
		super.areaRec(x, y);
	}
	 
//	@Override
//	public void areaRec(int x, int y) {
		
//		super.areaRec(x, y);			//super는 B를 가리킴. B의 부모인 A의 areaRec 메소드 내용을 그대로 복붙해온것과 마찬가지.
//	}
	
	
}
