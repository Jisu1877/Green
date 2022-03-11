package day0310.t1_Exception;

public class T1_NullPointerException {
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
		System.out.println("1.data4 = " + data4);
		System.out.println("2.data4 = " + data4.toString());	//실행오류발생 //어떤 처리를 하고자 하는데 값이 null일때 NullPointException이 뜬다.
	}
}
