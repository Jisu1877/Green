package day0307.t7_abstractEx1;

public class BunsikRun2 {
	public static void main(String[] args) {
//		WangjaBunsik wangjaBunsik = new WangjaBunsik();
//		WoojuBunsik woojuBunsik = new WoojuBunsik();
//		SeoulBunsik seoulBunsik = new SeoulBunsik();
		Bonsa wangjaBunsik = new WangjaBunsik();
		Bonsa woojuBunsik = new WoojuBunsik();
		Bonsa seoulBunsik = new SeoulBunsik();			//타입을 통일하면 배열로 바꿀 수 있다.
		
		Bonsa[] bunsik = {wangjaBunsik, woojuBunsik, seoulBunsik};	//객체들의 동일한 타입 : Bonsa 으로 배열 생성..
//		Bonsa[] bunsik = { new WangjaBunsik(),  new WoojuBunsik(), new SeoulBunsik()};	//이렇게 만들어도 된다.
		String[] title = {"왕자", "우주", "서울"};
		
		for(int i=0; i<bunsik.length; i++) {
			System.out.println("* "+title[i]+" 분식 메뉴현황 *");
			bunsik[i].kimchi();
			bunsik[i].budae();
			bunsik[i].bibim();
			bunsik[i].sundae();
			bunsik[i].konggi();
			System.out.println("==============================");
		}
		
//		System.out.println("왕자분식 메뉴현황");
//		System.out.println("우주분식 메뉴현황");
//		System.out.println("서울분식 메뉴현황");
		
//		wangjaBunsik.kimchi();
//		wangjaBunsik.budae();
//		wangjaBunsik.bibim();
//		wangjaBunsik.sundae();
//		wangjaBunsik.konggi();
//		
//		woojuBunsik.kimchi();
//		woojuBunsik.budae();
//		woojuBunsik.bibim();
//		woojuBunsik.sundae();
//		woojuBunsik.konggi();
//				
//				
//		seoulBunsik.kimchi();
//		seoulBunsik.budae();
//		seoulBunsik.bibim();
//		seoulBunsik.sundae();
//		seoulBunsik.konggi();
		
//		System.out.println("============================");
//		System.out.println("============================");
//		System.out.println("============================");
	}
}
