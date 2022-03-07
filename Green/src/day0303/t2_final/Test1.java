package day0303.t2_final;

public class Test1 {
	static final String NATION = "Korea";
	final String jumin;				//객체 생성할 때 딱 한번 초기화의 기회가 있고 그 이후에 메소드에서 변경을 할 수 없다.
	String name;
	
	Test1(String jumin) {
		this.jumin = jumin;
	}
	
	Test1(String nation, String jumin, String name) {
//		this.NATION = nation;		//static final로 선언한 경우 값을 바꿀 수 없다.
		this.jumin = jumin;
		this.name = name;
	}

	public void change(String nation, String jumin, String name) {
//		this.NATION = nation;
//		this.jumin = jumin;  	//이미 초기화 딱 한번의 기회를 사용했기 때문에. 
		this.name = name;
	}
}
