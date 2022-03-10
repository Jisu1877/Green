package day0310.t1_Exception;

public class T5_MultiException {
	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("data1 : " + data1);
			System.out.println("data2 : " + data2);
			
			int res = Integer.parseInt(data1) + Integer.parseInt(data2);
			System.out.println("res : " + res);
			
			Class.forName("T1_NullPointerException");
			
			
//		} catch (Exception e) {						//어떤 오류가 나더라도 처리한다.
		} catch (ArrayIndexOutOfBoundsException e) {//ArrayIndexOutOfBoundsException 오류만 처리한다.
			System.out.println("값은 2개를 입력하세요.");
		} catch (NumberFormatException e) {			//NumberFormatException 오류만 처리한다.
			System.out.println("숫자 자료만 입력하셔야합니다.");
		} catch (Exception e) {
			System.out.println("기타 오류가 발생했습니다.");
//			e.printStackTrace(); 	//이건 사용자한텐 안보인다.
		}
		finally {
			System.out.println("작업끝...");
		}
		
		
	}
}
