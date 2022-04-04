package day0310.t2_API.t7_Wrapper;

// 래퍼클래스를 사용하면 박싱처리(포장)되어서 객체로 가공된다.
// 래퍼클래스로 박싱하려고 한다면, 객체 생성(new)시 기본타입명령어의 첫글자를 대문자로 변경처리하면된다.
// 박싱처리해도 수치자료는 연산 가능하다.
// 다시 원상태(기본타입)으로 되돌리려면 박싱을 해제한다. 이것은 '언박싱' 이라고 한다.
public class Test1 {
	public static void main(String[] args) {
		int intSu1 = 100;
		String strIntSu1 = "200";
		
		//정수형 Boxing처리(정수:integer)
		Integer intObj1 = new Integer(intSu1);
		Integer strIntObj2 = new Integer(strIntSu1);
		
		System.out.println("intObj1 = " + intObj1);
		System.out.println("intObj1 + 500 = " + (intObj1 + 500)); //수치자료는 연산 가능하다.
		System.out.println("strIntObj2 = " + strIntObj2);
		System.out.println("strIntObj2 + 500 = " + (strIntObj2 + 500)); //수치자료는 연산 가능하다. 단, strIntSu1 값이 "200a"라면 에러난다.
		System.out.println();
		
		//정수형 UnBoxing처리 : 객체를 다시 기본타입으로 변경처리하기위함
		//UnBoxing형식 :" 타입명 + 'Value()' " 	예 : 정수는 intValue()
		int vInt1 = intObj1.intValue();
		int vInt2 = strIntObj2.intValue();
		
		System.out.println("vInt1 + 500 = " + (vInt1 + 500));
		System.out.println("vInt2 + 500 = " + (vInt2 + 500));
	}
}
