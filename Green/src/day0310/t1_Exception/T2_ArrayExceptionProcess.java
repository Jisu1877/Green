package day0310.t1_Exception;

public class T2_ArrayExceptionProcess {
	public static void main(String[] args) {			
		try {
			String data1 = args[0];
			String data2 = args[1];
			String data3 = args[2];
			
			System.out.println("data1 = " + data1);
			System.out.println("data2 = " + data2);
			System.out.println("data3 = " + data3);
			
//		} catch (Exception e) {
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("입력되는 자료의 갯수를 확인해보세요.");
//			e.printStackTrace();	//콘솔에 출력되는 명령어.. 에러를 찾아준다..
		}
		finally {
			System.out.println("작업끝!!");
		}
		
	}
}
