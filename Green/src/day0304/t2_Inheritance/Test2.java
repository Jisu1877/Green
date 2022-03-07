package day0304.t2_Inheritance;

public class Test2 extends Test1{
	int su1;
	
	public Test2() {	//부모한테 기본생성자가 없으면 자식도 기본생성자를 만들 수 없다.						
//		super(); //이게 생략된 것.  그래서 부모가 먼저 만들어지고 내가 만들어짐..
		//(super();는 부모의 기본생성자를 호출하는 것.) 부모가 기본생성자를 갖고 있지 않으면 super();라고 하면 에러난다. 매개값을 줘야한다.
		System.out.println("이곳은 Test2입니다.");
	}
	
	public Test2(int su) {
		super();
		System.out.println("Test2-1");
	}
	
	public Test2(int su1, int su2) {
//		super();	이 생략되어있어서 안보이는거지, 부모 클래스에서 기본생성자를 먼저 찾아서 실행한다.
//		super(su1, su2); 	부모 클래스에서 기본생성자가 아니라 매개변수가 있는 사용자정의 생성자를 부르고 싶으면 super(su1); 이런식으로 매개변수를 적어줘야한다.
							//super()안에 들어가는 변수의 타입은 부모의 생성자 매개변수 타입이랑 같아야한다.
		this.su1 = su1;
		System.out.println("Test2-2");
	}
	@Override
	void method1() {
		System.out.println("이곳은 Test2의 method1입니다.");
	}
	
	void method2() {
//		method1();				//메소드는 부모와 자식의 메소드가 동일할때 자식메소드를 우선 불러온다..
		super.method1();		//super.을 붙이면 부모의 메소드를 불러온다.
		System.out.println("이곳은 Test2의 method2입니다.");
	}
}
