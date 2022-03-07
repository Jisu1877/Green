package day0303.t6_GetterSetter;

public class Test3 {
	private String name;
	private int age;
	private boolean gender;
	private String address;
	
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
