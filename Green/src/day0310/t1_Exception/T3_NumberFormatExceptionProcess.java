package day0310.t1_Exception;

public class T3_NumberFormatExceptionProcess {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "seoul100";
		
		System.out.println("data1 + 200 = " + data1 + 200);
		
		int intData1 = Integer.parseInt(data1);
		System.out.println("intData1 = " + intData1);
		
		try {
			int intData2 = Integer.parseInt(data2) + 200;
			System.out.println("intData2 = " + intData2);
			
//		} catch (Exception e) {				//Exception대신에 좀더 구체적인 예외내용을 적는다.
		} catch (NumberFormatException e) {
			System.out.println("숫자형식만 연산처리 할 수 있습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("작업끝....");
		}
		System.out.println("이곳도 모두 수행됩니다.");
		
		
	}
}
