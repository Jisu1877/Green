package day0315_Generic.t1_ObjectType;

public class Test2 {
	public static void main(String[] args) {
		/*
		String[] strVar = {"kbs", "mbc", "sbs", "cjb"};
		int cnt = 0;
		for(String str : strVar) {
			System.out.println("strVar["+cnt+"] = " +str);
			cnt++;
		}
		System.out.println();
		
		int[] intVar = {10,20,30,40};
		for(int i = 0; i<intVar.length; i++) {
			System.out.println("strVar["+i+"] = " + intVar[i]);
		}
		System.out.println();
		
		double[] dblVar = {10.1,20.2,30.3,40.4};
		for(int i = 0; i<dblVar.length; i++) {
			System.out.println("dblVar["+i+"] = " + dblVar[i]);
		}
		System.out.println();
		
		Atom[] atom = {new A11(), new A22(), new A33()};
		for(int i = 0; i<atom.length; i++) {
			atom[i].aa();
		}
		*/
		
		Object[][] objVar = {					//타입을 Object타입으로 업캐스팅해서, 다른 타입의 자료들도 하나의 배열에 담을 수 있게 되었다.
				{"kbs", "mbc", "sbs", "cjb"},
				{10,20,30,40},
				{10.1,20.2,30.3,40.4},
				{new A11(), new A22(), new A33()}
		};
		
		for(int i = 0; i<objVar.length; i++) {
			for(int j = 0; j<objVar[i].length; j++) {
				System.out.println("objVar["+i+"]["+j+"] = " + objVar[i][j]);
			}
		}
		System.out.println();
		
		Atom[] atom = {new A11(), new A22(), new A33()};
		for(int i = 0; i<atom.length; i++) {
			atom[i].aa();
		}
	}
}

class A11 extends Atom{
	@Override
	void aa() {
		System.out.println("A11클래스의 aa메소드 입니다.");
	}
}
class A22 extends Atom{
	@Override
	void aa() {
		System.out.println("A22클래스의 aa메소드 입니다.");
	}
}
class A33 extends Atom{
	@Override
	void aa() {
		System.out.println("A33클래스의 aa메소드 입니다.");
	}
}
