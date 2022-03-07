package day0303.t8_exam;

public class MemberService {
	
	boolean result;
	
	boolean login(String id, String password) {
		
		if(id.equals("hong") && password.equals("12345")) {
			result = true;
		}else {
			result = false;
		}
		return result; 
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
}