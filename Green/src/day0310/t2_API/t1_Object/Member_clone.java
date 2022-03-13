package day0310.t2_API.t1_Object;

public class Member_clone implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	
	public Member_clone(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member_clone getMember() {
		Member_clone cloned = null;
		try {
			cloned = (Member_clone) clone();
		} catch (CloneNotSupportedException e) { }	//Cloneable 인터페이스를 구현하지 않았다면..
		return cloned;
	}
	
}
