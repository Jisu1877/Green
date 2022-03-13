package day0310.t2_API.t1_Object;

public class SmartPhone_toString {
	private String company;
	private String os;
	
	public SmartPhone_toString(String company, String os) {
		this.company = company;
		this.os = os;
		
	}
	
	@Override
	public String toString() {		//Object의 toString()을 재정의(오버라이딩)
		return company + "," + os;
	}
}
