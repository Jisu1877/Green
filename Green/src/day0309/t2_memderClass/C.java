package day0309.t2_memderClass;

public class C {
	int suC = 100;
	
	public C() {
		System.out.println("이곳은 C객체");
	}
	
	public void methodC() {
		System.out.println("이곳은 C객체의 methodC 입니다.");
	}
	
	public static class D {		
		int suD = 400;
		
		public D() {
			System.out.println("이곳은 C$D객체 입니다.");
		}
		
		public void methodD() {
			System.out.println("이곳은 C$D의 객체의 methodD 입니다.");
		}
//		------------------------------------------------------------ //
		static int su2D = 500;
		
		public static void methodD2() {
			System.out.println("이곳은 C$D의 객체의 methodD2 입니다.");
		}
	}
	
}
