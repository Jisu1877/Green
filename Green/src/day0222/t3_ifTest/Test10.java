package day0222.t3_ifTest;

//문자열 비교()
public class Test10 {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길순";
		
		if(str1 == str2) {
			System.out.println(str1 + "과 "+ str2 +"는 같습니다.");
		}
		else {
			System.out.println(str1 + "과 "+ str2 +"는 틀립니다.");
			
		}
	}
}
