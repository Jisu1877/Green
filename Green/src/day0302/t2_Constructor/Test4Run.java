package day0302.t2_Constructor;

public class Test4Run {
	public static void main(String[] args) {
		
		Test4 t4A = new Test4("그랜져");
		System.out.println("A사 : " + t4A.model + "," + t4A.color + "," +  t4A.maxSpeed);
	
		Test4 t4B = new Test4("소나타", "빨강색");
		System.out.println("B사 : " + t4B.model + "," + t4B.color + "," +  t4B.maxSpeed);
		
		Test4 t4C = new Test4("모닝", "초록색", 120);
		System.out.println("C사 : " + t4C.model + "," + t4C.color + "," +  t4C.maxSpeed);
		
		System.out.println(); //기본생성자에 대입한것.
		
		
	}
}
