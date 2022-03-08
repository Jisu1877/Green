package day0307.t11_abstractEx4;

public abstract class LunchMenu {
	String[] menuTitle = {"쌀밥", "불고기", "두부조림", "미역국", "요플레", "바나나", "우유", "아몬드"};
	int[] menuPrice = {500,2000,1000,1000,800,500,500,700};
	int[] order = new int[menuTitle.length];	//선택한 순서대로 배열에 저장
	int price, menuCnt;
	String childName;
	
	public abstract void calculation();
	public abstract void calcPrint();
	
	public void menuPrint() {
		System.out.println("* 어린이집 식대 계산 *");
		System.out.println("점심 기본제공 메뉴 : 쌀밥(500원), 불고기(2000원)");
		System.out.println("선택 간식메뉴 : 1.두부조림(1000원), 2.미역국(1000원), 3.요플레(800원) 4.바나나(500원) 5.우유(500원) 6.아몬드(700원), 0.종료");
		System.out.println("=====================================================================================================");
	}
	
	public void lunchRun() { 	//실행클래스를 간결하게 만들기위해 만듦.
		calculation();
		calcPrint();
	}
}
