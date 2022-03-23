package day0315_Generic.t1_ObjectType;

public class Test1 {
	public static void main(String[] args) {
//		String[] strVar = new String[4];
//		strVar[0] = "kbs";
//		strVar[1] = "mbc";
//		strVar[2] = "sbs";
//		strVar[3] = "cjb";
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
		
		
//		A1 a1 = new A1();
//		A2 a2 = new A2();
//		A3 a3 = new A3();
//		Atom a1 = new A1();
//		Atom a2 = new A2();
//		Atom a3 = new A3();
		
		Atom[] atom = {new A1(), new A2(), new A3()};
		for(int i = 0; i<atom.length; i++) {
			atom[i].aa();
		}
		
	}
}

class A1 extends Atom{
	@Override
	void aa() {
		System.out.println("A1클래스의 aa메소드 입니다.");
	}
}
class A2 extends Atom{
	@Override
	void aa() {
		System.out.println("A2클래스의 aa메소드 입니다.");
	}
}
class A3 extends Atom{
	@Override
	void aa() {
		System.out.println("A3클래스의 aa메소드 입니다.");
	}
}
