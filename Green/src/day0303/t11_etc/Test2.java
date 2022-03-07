package day0303.t11_etc;

public class Test2 {
	public static void main(String[] args) {
		char ch1 = 's';
		char ch2 = 'e';
		char ch3 = 'o';
		char ch4 = 'u';
		char ch5 = 'l';
		
		System.out.println("ch1 = " + ch1);
		System.out.println("ch2 = " + ch2);
		System.out.println("ch3 = " + ch3);
		System.out.println("ch4 = " + ch4);
		System.out.println("ch5 = " + ch5);
		System.out.println();
		
		char[] charArr = new char[5];
		charArr[0] = 's';
		charArr[1] = 'e';
		charArr[2] = 'o';
		charArr[3] = 'u';
		charArr[4] = 'l';
		System.out.println("charArr : " + charArr);	 //배열을 직접 찍으려고하면 메모리 주소를 알려줌.
		System.out.println("charArr : " + charArr[0]);
		System.out.println("charArr : " + charArr[1]);
		System.out.println("charArr : " + charArr[2]);
		System.out.println("charArr : " + charArr[3]);
		System.out.println("charArr : " + charArr[4]);
		System.out.println();
		
		char[] charArr2 = new char[] {'s', 'e', 'o', 'u', 'l'};
		for(int i=0; i<charArr2.length; i++) {
			System.out.println("charArr2["+i+"]" + charArr2[i]);
		}
		System.out.println();
		
		char[] charArr3 = {'s', 'e', 'o', 'u', 'l'};
		for(int i=0; i<charArr2.length; i++) {
			System.out.println("charArr3["+i+"]" + charArr3[i]);
		}
		System.out.println();
		
		//toString() :  문자열로 변환하는 메소드
		System.out.println("charArr3.toString() : " + charArr3.toString());
		
		//char[] -> String 으로 형변환	//???? c언어에선 char타입을 이렇게 String으로 바꿔서 쓴다.
		String str = new String(charArr3);
		System.out.println("new String(charArr3) : " + str);
		
	}
}
