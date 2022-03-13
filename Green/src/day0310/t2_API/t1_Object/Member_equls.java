package day0310.t2_API.t1_Object;

public class Member_equls {
	public String id;
	public Member_equls(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {		//매개값을 Object타입으로 자동타입변환
		if(obj instanceof Member_equls) {			//obj 매개 변수가 참조하는 객체가 Member타입인지 조사.
			Member_equls member = (Member_equls) obj;	//Member타입으로 강제 타입변환하고
			if(id.equals(member.id)) {		//id 필드값이 동일한지 검사.(String객체의 equals() 사용)
				return true;
			}
		}
		return false;
	}
}
