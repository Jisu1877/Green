package day0315_Generic.t3_Generic;

public class TestRun {
	public static void main(String[] args) {
//		TestVO<Integer> testVO = new TestVO<Integer>();
		TestVO<Integer> testVO = new TestVO<>();	//하위타입을 int타입으로 무조건 설정.
		testVO.setObject(100);	
//		int intsu = (Integer)testVO.getObject(); //다운캐스팅이 필요없다.
		int intsu = testVO.getObject();
		System.out.println("intsu : " + intsu);
		
		TestVO<Double> testVO2 = new TestVO<>();
		testVO2.setObject(3.14);
//		double dblsu = (Double) testVO2.getObject();
		double dblsu = testVO2.getObject();
		System.out.println("dblsu : " + dblsu);
		
		TestVO<String> testVO3 = new TestVO<>();
		testVO3.setObject("한국");
//		String str = (String) testVO3.getObject();
		String str = testVO3.getObject();
		System.out.println("str : " + str);
		
		TestVO<Atom> testVO4 = new TestVO<>();
		testVO4.setObject(new Atom());
//		Atom atom = (Atom) testVO4.getObject();
		Atom atom = testVO4.getObject();
		atom.aa();
		System.out.println("Atom의 aa메소드 : " + atom.name);
		
		
	}
}
