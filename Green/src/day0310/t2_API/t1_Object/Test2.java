package day0310.t2_API.t1_Object;

import java.util.Date;

public class Test2 {
	public static void main(String[] args) {
//		Date today = new Date();
		Object today = new Date();		//타입을 모르겠을 때 최상위 타입인 Object를 쓰면 된다.ㄴ
		System.out.println("today : " + today);
		System.out.println("today : " + today.toString()); //문자형식..
	
		Object obj1 = new Test1("이기자");
//		Test1 test1 = new Test1("이기자");
		System.out.println("obj1 : " + obj1);
		System.out.println("obj1 : " + obj1.toString());
		
//		String name = obj1.name; //오류. UpCasting되어 부모행세를 하고 있다.
		Test1 test1 = (Test1)obj1;	//따라서 DownCasting하여야 본인(Test1)객체의 내용들을 사용할 수 있다.
		System.out.println("Test1객체의 name = " + test1.name);
	}
}
