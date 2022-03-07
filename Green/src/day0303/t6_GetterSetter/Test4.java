package day0303.t6_GetterSetter;

public class Test4 {
	private String name;
	private int age;
	private boolean gender;
	private String address;
	
	private String mid;
	
	public String getMid() {
		return mid;
	}

	public Test4(String mid) {
		this.mid = mid;
	}
	
	public String getName() {
		if(name == null) {
			System.out.println("이름을 등록하세요...");
			name = "이름이 없음";
		}
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 20 || age >= 60) {
			System.out.println("20~59세까지 가입할 수 있습니다.");
			return;
		}
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
	
}
