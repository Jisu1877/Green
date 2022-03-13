package day0310.t2_API.t4_String;

public class T5_replace {
	public static void main(String[] args) {
		//replace(a,b) : 지정된 a문자를 찾아서 b문자로 모두 치환시켜준다.
		//문자치환시는 완전히 동일한 문자만 찾아서 치환시켜준다.
			 //		   0		 1  	   2
			//		   012345678901234567890
		String msg1 = "Welcome to Korea!!!";	//전체 길이는 19자이다.
		String msg2 = "한국에 오신것을 환영합니다."; 	//15자
			//		   012 34567 8901234567890
		
		//replace(a,b)
		System.out.println("o문자를 e문자로 치환? " + msg1.replace('o','e'));
		System.out.println("Korea를 USA로 치환? " + msg1.replace("Korea","USA"));
		System.out.println("한국을 미국으로 치환? " + msg2.replace("한국","미국"));
		//회원가입시에 아이디 입력시 공백을 입력하는 경우에 사용하기에 좋다...
		System.out.println("msg1안의 공백문자를 모두 제거 시키시오? " + msg1.replace(" ",""));
		System.out.println("msg2안의 공백문자를 모두 제거 시키시오? " + msg2.replace(" ",""));
		
		
	}
}
