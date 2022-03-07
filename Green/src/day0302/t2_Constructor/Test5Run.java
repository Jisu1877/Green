package day0302.t2_Constructor;

public class Test5Run {
	public static void main(String[] args) {
		Test5 t5A = new Test5("그랜져");
		System.out.println("A사 : " + t5A.model + "," + t5A.color + "," +  t5A.maxSpeed);
	
		Test5 t5B = new Test5("소나타", "빨강색");
		System.out.println("B사 : " + t5B.model + "," + t5B.color + "," +  t5B.maxSpeed);
		
		Test5 t5C = new Test5("모닝", "초록색", 120);
		System.out.println("C사 : " + t5C.model + "," + t5C.color + "," +  t5C.maxSpeed);
	}
}
