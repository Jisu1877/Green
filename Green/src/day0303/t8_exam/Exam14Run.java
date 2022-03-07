package day0303.t8_exam;

public class Exam14Run {
	public static void main(String[] args) {
		Exam14 exam14 = new Exam14("홍길동", "hong");
		Exam14 exam14_2 = new Exam14("강자바", "java");
		
		System.out.println("성명 : " + exam14.name + ", 아이디 : " + exam14.id);
		System.out.println("성명 : " + exam14_2.name + ", 아이디 : " + exam14_2.id);
		
	}
}
