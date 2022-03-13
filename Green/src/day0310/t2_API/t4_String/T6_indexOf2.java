package day0310.t2_API.t4_String;

public class T6_indexOf2 {
	public static void main(String[] args) {
		//indexOf() : 검색 후 지정된 문자(열)의 시작 위치값을 추출... 만약 없으면 -1을 반환.
		//substring() : 지정된 위치(위치부터)의 문자열을 반환한다.
			 //		   0		 1  	   2
			//		   012345678901234567890
		String msg3 = "Welcome to 코리아~ !!!";
		
		//앞의 msg3에 저장된 2번째 공백의 위치를 찾아서 출력하시오ㄴ?
		
		
		int blank1 = msg3.indexOf(" ")+1;
		String str1 = msg3.substring(msg3.indexOf(" ")+1);
		System.out.println(blank1);
		System.out.println(str1);
		
		int blank2 = str1.indexOf(" ");
		System.out.println(blank2);
		System.out.print("두번째 공백의 위치는 ? ");
		System.out.println((msg3.indexOf(" ")+1) + str1.indexOf(" ") + "번째");
		
	}
}
