package day0303.t4_package;

import day0303.t3_package.Test1;
import day0303.t3_package.Test2;

//import day0303.t3_package.*;
//import day0303.t3_package.*;			//클래스 이름 자리에 *을 쓰면 한 패키지 않에 있는 모든 클래스를 다 가져올 수 있따.
//import day0303.t3_package.Test1;
//import day0303.t3_package.Test2;

public class Test1Run {
	public static void main(String[] args) {
		//import를 걸어야 다른 패키지 안에 들어있는 클래스 객체를 생성할 수 있다.
		
		//혹은 '패키지 경로.클래스이름'으로 정을 수 있다. (아래 예)
		//day0303.t3_package.Test1 t1 = new day0303.t3_package.Test1();		
		
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		
				
	}
}
