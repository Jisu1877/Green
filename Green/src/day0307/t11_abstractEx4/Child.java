package day0307.t11_abstractEx4;

public class Child extends LunchMenu {

	@Override
	public void calculation() {
		price = menuPrice[0] + menuPrice[1];	//기본메뉴 제공 가격 계산
		for(int i = 0; i<menuCnt; i++) {
			price += menuPrice[order[i]];
		}
	}

	@Override
	public void calcPrint() {
		System.out.print("\n주문내역 : ");
		for(int i=0; i<menuCnt; i++) {
			System.out.print(menuTitle[order[i]] + "("+menuPrice[order[i]]+") / ");
		}
		System.out.println();
		System.out.println( childName + "의 식대는? " + price);
	}
}
