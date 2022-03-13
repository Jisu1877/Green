package day0310.t2_API.t4_String;

public class T6_indexOf {
	public static void main(String[] args) {
		//indexOf() : 검색 후 지정된 문자(열)의 시작 위치값을 추출... 만약 없으면 -1을 반환.  /.indexOf( "찾을 특정 문자" , "시작할 위치" )
		//lastindexOf() : 뒤에서부터 지정된 문자(열)의 위치를 찾는다.
		//contains() : 문자열의 포함유무를 확인할때 사용(있으면 true, 없으면 false)	//게시판에서 사용..
			 //		   0		 1  	   2
			//		   012345678901234567890
		String msg1 = "Welcome to Korea!!!";	//전체 길이는 19자이다.
		String msg2 = "한국에 오신것을 환영합니다."; 	//15자
		String msg3 = "Welcome to 코리아~ !!!"; 	
		
		System.out.println("'Korea'의 시작 위치는?" +msg1.indexOf("Korea"));
		System.out.println("'환영'의 시작 위치는?" +msg2.indexOf("환영"));
		System.out.println("'코리아'의 시작 위치는?" +msg3.indexOf("코리아"));
		System.out.println("'일본'의 시작 위치는?" +msg3.indexOf("일본"));
		System.out.println("처음 나오는 공백의 시작 위치는?" +msg3.indexOf(" "));
		System.out.println("마지막에 나오는 공백의 시작 위치는?" +msg3.lastIndexOf(" "));		//인덱스번지는 앞에서부터 센다. 검색만 마지막부터!
		System.out.println();
		
		System.out.println("'코리아'의 포함유무?" + msg3.contains("코리아"));
		System.out.println("'일본'의 포함유무?" + msg3.contains("일본"));
	}
}
