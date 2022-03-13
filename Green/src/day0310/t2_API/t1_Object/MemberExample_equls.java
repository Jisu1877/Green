package day0310.t2_API.t1_Object;

public class MemberExample_equls {
	public static void main(String[] args) {
		Member_equls obj1 = new Member_equls("blue");
		Member_equls obj2 = new Member_equls("blue");
		Member_equls obj3 = new Member_equls("red");
		
		if(obj1.equals(obj2)) {		//Member클래스에서 equals()를 오버라이딩 한 상태.
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
	}
}
