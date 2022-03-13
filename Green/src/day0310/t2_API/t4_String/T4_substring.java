package day0310.t2_API.t4_String;

public class T4_substring {
	public static void main(String[] args) {
		//substring() : 지정된 문자(열)을 출력시켜준다.
		//		   (a) : a번째부터 이후의 모든 문자를 반환.
		//		   (a,b) : a번째부터 b번째 이전까지의 문자를 반환.
			 //		   0		 1  	   2
			//		   012345678901234567890
		String msg1 = "Welcome to Korea!!!";	//전체 길이는 19자이다.
		String msg2 = "한국에 오신것을 환영합니다."; 	//15자
			//		   012 34567 8901234567890
		
		//substring()
		System.out.println("4번째부터 모두 출력? " + msg1.substring(4));
		System.out.println("4번째부터 모두 출력? " + msg2.substring(4));
		System.out.println("4번째부터 6개의 문자를 출력? " + msg1.substring(4,10));
		System.out.println("4번째부터 6개의 문자를 출력? " + msg2.substring(4,10));
		
	}
}
