package day0307.t13_abstractEx5;

public abstract class Menu {
	String[] dessert = {"쌀밥", "불고기", "두부조림", "미역국", "요플레", "바나나", "우유", "아몬드"};
	int[] dessertPrice = {500,2000,1000,1000,800,500,500,700};
	int order[] = new int[dessert.length];
	int price = dessertPrice[0] + dessertPrice[1];
	String childName;
	
	public abstract void childInput(); //아이의 이름을 입력
	public abstract void dessertChoice(); //간식 선택 및 식대계산하기
	public abstract void desserPrint(); //식대 출력하기
}
