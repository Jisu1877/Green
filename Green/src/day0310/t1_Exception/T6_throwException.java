package day0310.t1_Exception;

public class T6_throwException {
	public static void main(String[] args) {
		
		try {
			findClass();
			System.out.println("String2클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("String2클래스가 존재하지 않습니다.");
//			e.printStackTrace();
			System.out.println("String2클래스가 존재하지 않습니다." + e.getMessage());
		} finally {
			System.out.println("작업끝....");
		}
		
		
		
	}

	private static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
		
	}
}
