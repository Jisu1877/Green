package day0315_Generic.t2_noneGeneric;

public class TestRun {
	public static void main(String[] args) {
		TestVO testVO = new TestVO();
		
		testVO.setObject(100);			//정수가 Object 로 업캐스팅 되었음.
//		int intsu = testVO.getObject(); //그래서 int 타입에 담으려고하면 에러남.
		int intsu = (Integer)testVO.getObject(); //다운 캐스팅(래퍼 클래스로..)
		System.out.println("intsu : " + intsu);
		
		testVO.setObject(3.14);
		double dblsu = (Double) testVO.getObject();
		System.out.println("dblsu : " + dblsu);
		
		testVO.setObject("한국");
		String str = (String) testVO.getObject();
		System.out.println("str : " + str);
		
		testVO.setObject(new Atom());
		Atom atom = (Atom) testVO.getObject();
		System.out.println("Atom의 aa메소드 : " + atom.name);
		
		
	}
}
