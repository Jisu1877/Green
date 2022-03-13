package day0310.t2_API.t4_String;

public class T2_charAt {
	public static void main(String[] args) {
		//특정위치의 문자값을 1개를 가져오는 메소드?  charAt()
		//				0		  1  		2
		//				012345678901234567890
		String jumin = "120525-4121219";
		
		char gender = jumin.charAt(7);
		
		if(gender == '2' || gender == '4') {
			System.out.println("성별이 여자입니다.");
		}
		else {
			System.out.println("성별이 남자입니다.");
		}
	}
}
