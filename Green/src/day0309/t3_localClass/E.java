package day0309.t3_localClass;

public class E {
	int suE = 300;
	
	public E() {
		System.out.println("이곳은 E객체");
	}
	
	public void methodE1() {
		System.out.println("이곳은 E객체의 methodE 메소드 입니다.");
		
		//로컬클래스는 내부에서 사용할 목적으로 만들어준다. 클래스 하나에 모든 내용을 다 넣고싶으나, 객체는 따로 만들고 싶을때..
		//만들어준 메소드 영역안에서 사용 후 메소드를 벗어나면 소멸된다.
		class F {			//메소드 안에 클래스를 선언할땐 public을 붙일 수 없다.
			int suF = 700;
			public F() {
				System.out.println("이곳은 E객체의 methodE1메소드안의 F객체입니다.");
			}
			public void methodF1() {
				System.out.println("이곳은 E객체의 methodE1메소드안의 methodF1메소드입니다.");
			}
		}
		
		F f = new F();
		System.out.println("f.suF : " + f.suF);
		f.methodF1();
	}
}
