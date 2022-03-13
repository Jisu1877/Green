package day0310.t2_API.t4_String;

public class T8_getChars {
	public static void main(String[] args) {
		//getChars() : 문자열을 각각의 문자(char)인 문자배열로 만들어준다. 출력시는 배열복사명령을 사용한다.
		//reverse() : 문자열을 반전시켜준다. 이때 사용할 객체는 StringBuffer클래스를 사용한다.
		
		//getChars()
		String str1 = "Hello!";
//		String str2 = new String("Hello!"); 로 써도 된다.
		char[] charArrs = new char[str1.length()];
		System.out.println("str1 : " + str1);
		System.out.println("charArr : " + charArrs);
		System.out.println();
		
		//원본문자열.getChars(원본문자열의 시작위치, 복사할 개수, 복사받을배명, 복사받을 배열의 시작위치); 
		str1.getChars(0, str1.length(), charArrs, 0);
		for(char charArr : charArrs) {
			System.out.print(charArr + " ");
		}
		System.out.println();
		
		//reverse() : 문자열을 반전시켜준다. 이때 사용할 객체는 StringBuffer클래스를 사용한다.
		StringBuffer sb = new StringBuffer(str1);
		System.out.println("Hello! 문자의 반전문자? " + sb.reverse());
		
	}
}
