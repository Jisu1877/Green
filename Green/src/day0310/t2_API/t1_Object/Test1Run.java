package day0310.t2_API.t1_Object;

public class Test1Run {
	public static void main(String[] args) {
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		String str3 = new String("홍길순");
		
		if(str1 == str2) {
			System.out.println("1. str1과 str2는 동등하다.");
		}else { 
			System.out.println("1. str1과 str2는 동등하지 않다.");
		}
		
		if(str1 == str3) {
			System.out.println("2. str1과 str3는 동등하다.");
		}else { 
			System.out.println("2. str1과 str3는 동등하지 않다.");
		}
		System.out.println();
		
		if(str1.equals(str2)) {
			System.out.println("3. str1과 str2는 동등하다.");
		}else { 
			System.out.println("3. str1과 str2는 동등하지 않다.");
		}
		
		if(str1.equals(str3)) {
			System.out.println("4. str1과 str3는 동등하다.");
		}else { 
			System.out.println("4. str1과 str3는 동등하지 않다.");
		}
		System.out.println("========================================");
		
		//Test1객체에서의 비교....
		Test1 test11 = new Test1("냉장고");
		Test1 test12 = new Test1("냉장고");
		Test1 test13 = new Test1("오디오");
		
		if(test11 == test12) {
			System.out.println("5. test11과 test12는 동등합니다.");
		}else {
			System.out.println("5. test11과 test12는 동등하지 않습니다.");
		}
		if(test11.equals(test12)) {								//
			System.out.println("6. test11과 test12는 동등합니다.");
		}else {
			System.out.println("6. test11과 test12는 동등하지 않습니다.");
		}
		if(test11.equals(test13)) {								//
			System.out.println("7. test11과 test13는 동등합니다.");
		}else {
			System.out.println("7. test11과 test13는 동등하지 않습니다.");
		}
		
		//객체안의 필드(값)의 비교시는???? .연산자 사용
		
		if(test11.name.equals(test12.name)) {
			System.out.println("8. test11과 test12는 동등합니다.");
		}else {
			System.out.println("8. test11과 test12는 동등하지 않습니다.");
		}
	}
}
