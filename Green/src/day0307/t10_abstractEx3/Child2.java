package day0307.t10_abstractEx3;

public class Child2 extends LunchMenu {

	@Override
	public void calculation() {
		price = rice + bulgogi + milk + almond;
	}

	@Override
	public void calcPrint() {
		System.out.println("두번째 아이의 식대는? " + price);
	}
}
