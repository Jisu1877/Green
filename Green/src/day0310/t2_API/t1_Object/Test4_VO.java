package day0310.t2_API.t1_Object;

//VO == DTO
/*
 * 1. Private 으로 필드 선언
 * 2. getter setter 만들기
 * 3. 생성자를 통해서 값을 받아도 됨(선택)
 * 4. Object클래스 안에 있는 toString() 메소드 오버라이드..(Source -> Generate toString() 클릭)
 */
public class Test4_VO {
	private String name;
	private int age;
	private boolean gender;
	private String address;
	
	public Test4_VO(String name, int age, boolean gender, String address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// 사용자가 직접 출력용으로 만들어서 사용하는 메소드
	public void prn() {
		System.out.println("Test4[성명 = "+name+", 나이 = "+age+", 성별 = "+gender+", 주소 = "+address+"]");
	}

	//이클립스가 만들어주는 프린트 메소드...  
	@Override
	public String toString() {			//Object클래스에서 오버라이드 한것.. (Source -> Generate toString() 클릭)
	return "Test4 [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}
	
}
