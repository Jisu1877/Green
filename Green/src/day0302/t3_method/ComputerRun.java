package day0302.t3_method;

public class ComputerRun {
	public static void main(String[] args) {
		Computer comp = new Computer(10, 20);
		
		comp.add_sub();
		System.out.println();
		
		comp.mul_div();			//외부 메소드 호출.
	}
}
