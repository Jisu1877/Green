package day0307.t10_abstractEx3;

public class Child1 extends LunchMenu {

	@Override
	public void calculation() {
		price = rice + bulgogi + banana;
	}

	@Override
	public void calcPrint() {
		System.out.println("첫번째 아이의 식대는? " + price);
	}
}
