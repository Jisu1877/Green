package day0310.t2_API.t1_Object;

public class Test4Run {
	public static void main(String[] args) {
		Test4_VO test4 = new Test4_VO("홍길동", 25, true, "서울");
		
		test4.prn();
		System.out.println("================");
		System.out.println(test4.toString());
		System.out.println();
		
		test4.setName("김말숙");
		test4.setAge(29);
		test4.setGender(false);
		test4.setAddress("부산");
		test4.prn();		
		System.out.println(test4.toString());
	}
}
