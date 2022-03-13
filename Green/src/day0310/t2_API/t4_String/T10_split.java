package day0310.t2_API.t4_String;

public class T10_split {
	public static void main(String[] args) {
		//split() : 문자열(배열)을 특정 문자열로 분리하여 잘라낸다. 이때 각각의 분리된 자료는 배열요소로 저장한다.(배열로 반환한다.)
		//join() : 특정문자로 문자(열)을 결합한다.
		//            0         1
		//            0123456789012
		String tel = "010-3423-2704";
//		String tel = "(010)3423-2704";		//이 경우엔 substring()과 indexOf()를 사용해서 분리한다.
		
//		tel.split("-");	//-을 기준으로 잘라주세요.
		
		String[] telArrs = tel.split("-");
		System.out.println("지역번호 : " + telArrs[0]);
		System.out.println("국번호 : " + telArrs[1]);
		System.out.println("전화번호 : " + telArrs[2]);
		
		for(String telArr : telArrs) {
			System.out.print(telArr + " / ");
		}
		System.out.println();
		
		//join() 
		String telJoin = String.join("/", telArrs);		//(넣고싶은 특수문자, 배열객체)
		System.out.println("telJon : " + telJoin);
	}
}
