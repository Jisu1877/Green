package day0310.t2_API.t4_String;

public class T7_compare {
	public static void main(String[] args) {
		//compareTo() : 문자열을 사전순으로 비교한다.(가나다라 순)
		//compareToIgnoreCase() : 대소문자 구분없이 비교해서 int타입 반환..?
		//startsWith(), endsWith() : 접두사와 접미사를 비교한다. (앞에서부터 비교? 뒤에서부터 비교?)
		//concat() : 문자열의 결합(포함)
		//trim() : 앞뒤의 공백을 무시한다.
		
		String str1 = "Hello!";
		String str2 = "Hello!";
		String str3 = "Yahoo! Hello!";
		String str4 = "ahoo! Hello!";	//소문자 a는 97번
		String str5 = "Ahoo! Hello!";	//대문자 A는 65번
		String str6 = "hello!";
		String str7 = "  h e l l o !";
		String str8 = "h e l l o !  ";
		
		//compareTo() : 비교값이 '0'이면 같다. 음수가 나오면 뒤의 문자가 크다. 양수면 앞의 문자가 크다. 첫번째글자부터 비교..
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareTo(str5));
		System.out.println(str1.compareTo(str6));
		
		//compareToIgnreCase()
		System.out.println(str1.compareToIgnoreCase(str6));
		System.out.println("Y와 y의 비교? " + "Y".compareTo("y"));
		System.out.println("Y와 y의 비교? " + "Y".compareToIgnoreCase("y"));
		
		//startsWith(), endsWith()		//쓰는 순서가 어떻게 다른거지???
		System.out.println(str2.startsWith(str1));
		System.out.println(str3.startsWith(str1));
		System.out.println(str2.endsWith(str1));
		System.out.println(str3.endsWith(str1));
		
		//concat()
		System.out.println(str1.concat(str3));
		System.out.println(str1 + str3);		//데이터베이스에선 문자열을 +으로 연결을 못한다.
		
		//trim() : 앞뒤의 공백을 무시한다.				//사용자가 내용을 쓰기전에 스페이스바를 많이 눌러 필요없는 공백을 많이 발생시켰을시..사용..
		System.out.println("1. " + str1 + str7 + str1);
		System.out.println("2. " + str1 + str7.trim() + str1);
		System.out.println("3. " + str1 + str8 + str1);
		System.out.println("4. " + str1 + str8.trim() + str1);
		
		//replace()를 이용하여 모든 공백을 무시해서 출력해보자.
		System.out.println("5. " + str1 + str7.replace(" ", "") + str1);
		System.out.println("6. " + str1 + str8.replace(" ", "") + str1);
		
	}
}
