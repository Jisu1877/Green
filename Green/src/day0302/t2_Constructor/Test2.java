package day0302.t2_Constructor;

public class Test2 {
	int jumsu;
	
//	Test2(){}					
	
	Test2(int jumsu){			//클래스이름과 같기 때문에 이건 생성자이다.중요!!!!!
		this.jumsu = (int)(jumsu * 0.1);		//앞에 jumsu는 4번 jumsu를 말하는게 아니라 자바는 블록우선이라서 6번의 매개변수인 jumsu를 말한다. 즉 6번 매개변수 = 6번 매개변수;의 의미.
								//this를 쓰면 매개변수가 아니라 필드의 jumsu라는 것을 의미한다.
	}
}
