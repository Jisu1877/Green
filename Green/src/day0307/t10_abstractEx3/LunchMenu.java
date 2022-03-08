package day0307.t10_abstractEx3;

public abstract class LunchMenu {
	int rice = 500;
	int bulgogi = 2000;
	int dubu = 1000;
	int miyuk = 1000;
	int yogurt = 800;
	int banana = 500;
	int milk = 500;
	int almond = 700;
	int price;
	
	public abstract void calculation();
	public abstract void calcPrint();
	
	public void menuPrint() {
		System.out.println("* 어린이집 식대 계산 *");
		System.out.println("점심 기본제공 메뉴 : 쌀밥(500원), 불고기(2000원)");
		System.out.println("선택 간식메뉴 : 1.두부조림(1000원), 2.미역국(1000원), 3.요플레(800원) 4.바나나(500원) 5.우유(500원) 6.아몬드(700원)");
		System.out.println("=================================================================================================");
	}
	
	public void lunchRun() { 	//실행클래스를 간결하게 만들기위해 만듦.
		calculation();
		calcPrint();
	}
}
