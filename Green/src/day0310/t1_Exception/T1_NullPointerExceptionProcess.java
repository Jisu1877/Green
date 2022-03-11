package day0310.t1_Exception;

public class T1_NullPointerExceptionProcess {
	public static void main(String[] args) {
		String data = "atom";
		System.out.println("data = " + data);

		String data2 = "100";
		System.out.println("1.data2 = " + data2);
		System.out.println("2.data2 = " + (String) data2);
		System.out.println("3.data2 = " + data2.toString());
		System.out.println("4.data2 = " + (data2 + 100));		
		System.out.println("5.data2 = " + (String) data2 + 100);	//String으로 형변환..
		System.out.println("6.data2 = " + data2.toString() + 100);	//toString은 문자로 바꾸라는 메소드
		
		int data3 = Integer.parseInt(data2); 	//숫자로 parsing 한다.. Integer는 감싸는(레퍼) 클래스다.  
		System.out.println("data3 = " + data3);
		System.out.println("data3 = " + (data3 + 100));
		
		String data4 = null;
//		String data4 = "123";
		System.out.println("1.data4 = " + data4);
		
		try {
			System.out.println("2.data4 = " + data4.toString());	//try에는 코드 짰던 내용을 그대로 넣는다.
//		} catch (Exception e) {										//Exception은 예외처리에서 우두머리 클래스다.
		} catch (NullPointerException e) {										//Exception은 예외처리에서 우두머리 클래스다.
			System.out.println("입력자료는 Null값이 올 수 없습니다. 확인하세요.");		//오류를 짐작해서 예외처리.
//			e.printStackTrace();									//무슨 오류인지 찾는 메소드
		} finally {													//정상이던 오류이던 처리된다..
			System.out.println("정상처리가 되신분은 다음버튼을 누르시고, 오류가 발생하신 분은 이전버튼을 누르세요.");
		}
		
	}
}
