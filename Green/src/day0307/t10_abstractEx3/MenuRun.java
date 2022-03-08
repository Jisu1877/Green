package day0307.t10_abstractEx3;

public class MenuRun {
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.menuPrint();
		child1.lunchRun();
		System.out.println("----------------------------------");
		System.out.println();
		
		Child2 child2 = new Child2();
		child2.menuPrint();
		child2.lunchRun();
	}
}
