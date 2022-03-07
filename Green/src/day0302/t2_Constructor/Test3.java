package day0302.t2_Constructor;

public class Test3 {
	int jumsu;
	
//	Test3(){}
	Test3() {
		jumsu = 90;
		System.out.println("이곳은 사용자 정의 생성자1입니다.");
	}
	
	Test3(int jumsu){			
		this.jumsu = (int)(jumsu * 0.1);		
		System.out.println("이곳은 사용자 정의 생성자2입니다.");
	}
	

	Test3(int jumsu, String name){					//매개변수 개수가 다르면 구별된다.
		this.jumsu = (int)(jumsu * 0.1);
		System.out.println("이곳은 사용자 정의 생성자3입니다.");
	}
	
	Test3(double jumsu){							//매개변수의 타입이 다르면 구별된다.
		this.jumsu = (int)(jumsu * 0.1);		
		System.out.println("이곳은 사용자 정의 생성자4입니다.");
	}
	
	Test3(String name, int jumsu){					//매개변수의 순서가 다르면 구별된다.
		this.jumsu = (int)(jumsu * 0.1);
	}
	
//	Test3(String name2, int jumsu2){				//타입이 같으면 변수명이 달라도 구별되지 않는다. 그래서 생성자의 역할을 할 수 없다.
//		this.jumsu = (int)(jumsu * 0.1);
//	}
}
