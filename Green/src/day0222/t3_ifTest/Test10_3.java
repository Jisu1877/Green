package day0222.t3_ifTest;

//문자열 비교()
public class Test10_3 {
	public static void main(String[] args) {
		String str1 = new String("홍길동");	// new는 객체를 생성한다.따라서 값이 틀린다고 나온다.
		String str2 = new String("홍길동");	// 참조타입에서는 == 이라는 연산자를 주의해서 사용해야한다.
		
		if(str1 == str2) {
			System.out.println(str1 + "과 "+ str2 +"는 같습니다.");
		}
		else {
			System.out.println(str1 + "과 "+ str2 +"는 틀립니다.");
			
		}
	}
}
