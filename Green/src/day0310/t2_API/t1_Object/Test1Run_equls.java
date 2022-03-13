package day0310.t2_API.t1_Object;

public class Test1Run_equls {
	public static void main(String[] args) {
		String str1 = new String("홍길동");	//String객체를 힙영역에 새로 생성1
		String str2 = new String("홍길동");	//String객체를 힙영역에 새로 생성2
		String str3 = new String("홍길순");	//String객체를 힙영역에 새로 생성3
		
		if(str1 == str2) {			//스택 영역에 저장되어있는 str1의 주소값과 str2의 주소값 비교. 각각 다른 객체이기에 주소값이 다르다.
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
		
		if(str1.equals(str2)) {		//String 객체가 저장하고 있는 데이터의 동일함을 비교.
			System.out.println("3. str1과 str2는 동등하다.");
		}else { 
			System.out.println("3. str1과 str2는 동등하지 않다.");
		}
		
		if(str1.equals(str3)) {		//String 객체가 저장하고 있는 데이터의 동일함을 비교.
			System.out.println("4. str1과 str3는 동등하다.");
		}else { 
			System.out.println("4. str1과 str3는 동등하지 않다.");
		}
		System.out.println("========================================");
		
		//Test1객체의 비교. 객체비교는 저장되어있는 데이터가 아닌 객체의 메모리 주소를 비교한다.
		Test1 test11 = new Test1("냉장고");		//생성과 동시에 넘기는 데이터가 있건 없건 상관이 없다.
		Test1 test12 = new Test1("냉장고");
		Test1 test13 = new Test1("오디오");
		
		if(test11 == test12) {		//스택 영역에 저장되어있는 변수 test11의 주소값과 test12의 주소값 비교.
			System.out.println("5. test11과 test12는 동등합니다.");
		}else {
			System.out.println("5. test11과 test12는 동등하지 않습니다.");
		}
		if(test11.equals(test12)) {		//두 객체의 메모리 주소는 다르기때문에 false가 된다.
			System.out.println("6. test11과 test12는 동등합니다.");
		}else {
			System.out.println("6. test11과 test12는 동등하지 않습니다.");
		}
		if(test11.equals(test13)) {								//
			System.out.println("7. test11과 test13는 동등합니다.");
		}else {
			System.out.println("7. test11과 test13는 동등하지 않습니다.");
		}
		
		//객체안의 필드(값)의 비교시는? .연산자를 사용해서 필드를 불러온다.
		
		if(test11.name.equals(test12.name)) {		//name이라는 필드값 비교.
			System.out.println("8. test11과 test12는 동등합니다.");
		}else {
			System.out.println("8. test11과 test12는 동등하지 않습니다.");
		}
	}
}
