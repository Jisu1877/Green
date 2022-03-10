package day0310.t1_Exception;

public class T4_ClassNotFoundException {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2"); //Class라는 이름의 class의 메소드, class이름을 찾는다.	//내장형클래스는 예외처리에 바로 넣는다.
			System.out.println("String2클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("String2클래스가 존재하지 않습니다.");
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} finally {
			System.out.println("작업끝...");
		}
	}
}
