package day0303.t11_etc;

public class Test3 {
	public static void main(String[] args) {
		//char[] charArr3 = {'s', 'e', 'o', 'u', 'l'};
		String str = "seoul";
		System.out.println("str : " + str);

		//문자열을 배열로 처리하여 1문자씩 꺼내주는 메소드 : charAt()
		System.out.println("charAt(0) : " + str.charAt(0));
		for(int i=0; i<str.length(); i++) {		// String 은 배열이 아니다. 참조타입이ㄴ다. String을 배열로 처리. length(); 메소드 를 불러와서 처리..
			System.out.println("str["+i+"] = " + str.charAt(i));
		}
		System.out.println();
		
		// String -> char[] : toCharArray()
		str.toCharArray();  			// String을 char타입의 배열로 바꾼다..
		char[] charArr = str.toCharArray(); //문자열을 문자배열로 바꾸는 메소드.
		for(int i=0; i<charArr.length; i++) {
			System.out.println("charArr["+i+"] : " + charArr[i]);
		}
		System.out.println();
		
		//문자열 비교 : .equals()
		if(str.equals("seoul")) {
			System.out.println("str변수의 값은 seoul과 같다.");
		}
		else {
			System.out.println("str변수의 값은 seoul과 다르다.");
		}
		System.out.println();
		
		//문자(char)비교 : ==, !=
		if(charArr[0] == 's') {
			System.out.println("charArr[0]은 s과 같다.");
		}
		else {
			System.out.println("charArr[0]의 값은 과 다르다.");
		}
		System.out.println();
		
		//str변수의 내용에는 'seoul'이 들어있다. 이때 'o'란 문자가 있는지 검색해보자.
		// 1. char형식으로의 비교하기 : String -> char[]변환해서 각각의 위치값을 비교한다.
		char[] charSeoul = str.toCharArray();
		int sw = 0;
		for(int i=0; i<charSeoul.length; i++) {
			if(charSeoul[i] == 'o') {
				System.out.println("o의 위치는? " + i);
				sw = 1;
				break;
			}
		}
		if(sw == 0) {
			System.out.println("못찾았습니다.");
		}
		
		// 2. String을 charAt()메소드를 이용해서 위치 검색
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'o') {
				System.out.println("o의 위치는? " + i);
			}
		}
		
		for(int i=0; i<charSeoul.length; i++) {
			if(Character.compare(charSeoul[i], 'o') == 0) {
				System.out.println("o의 위치는? " + i);
			}
		}
	}
}
