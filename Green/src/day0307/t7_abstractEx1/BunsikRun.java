package day0307.t7_abstractEx1;

public class BunsikRun {
	public static void main(String[] args) {
		WangjaBunsik wangjaBunsik = new WangjaBunsik();
		System.out.println("왕자분식 메뉴현황");
		wangjaBunsik.kimchi();
		wangjaBunsik.budae();
		wangjaBunsik.bibim();
		wangjaBunsik.sundae();
		wangjaBunsik.konggi();
		System.out.println("============================");
		
		WoojuBunsik woojuBunsik = new WoojuBunsik();
		System.out.println("우주분식 메뉴현황");
		woojuBunsik.kimchi();
		woojuBunsik.budae();
		woojuBunsik.bibim();
		woojuBunsik.sundae();
		woojuBunsik.konggi();
		System.out.println("============================");
				
				
		SeoulBunsik seoulBunsik = new SeoulBunsik();
		System.out.println("서울분식 메뉴현황");
		seoulBunsik.kimchi();
		seoulBunsik.budae();
		seoulBunsik.bibim();
		seoulBunsik.sundae();
		seoulBunsik.konggi();
		System.out.println("============================");
	}
}
