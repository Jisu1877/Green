package day0310.t2_API.t1_Object;

public class Test3Run {
	public static void main(String[] args) {
		Test3_DTO test3 = new Test3_DTO("홍길동", 25, true, "서울");
		
		System.out.println("성명 : " + test3.getName());
		System.out.println("나이 : " + test3.getAge());
		System.out.println("성별 : " + test3.isGender());
		System.out.println("주소 : " + test3.getAddress());
		System.out.println();
		
		test3.setName("김말숙");
		test3.setAge(29);
		test3.setGender(false);
		test3.setAddress("부산");
		
		System.out.println("성명 : " + test3.getName());
		System.out.println("나이 : " + test3.getAge());
		System.out.println("성별 : " + test3.isGender());
		System.out.println("주소 : " + test3.getAddress());
	}
}
