package day0222.t2_format;

public class Test3 {
	 public static void main(String[] args) {
		String str1 = "java" + "8.0";
		System.out.println("str1 : " + str1);
		
		String str2 = "java" + 8.0 + 10 ;	 // 문자뒤에 나오는건 무조건 문자로 읽는다.
		System.out.println("str2 : " + str2);
		
		String str3 = 8.0 + 10 + "java";	 // 문자앞에 나오는건 연산이 된다.
		System.out.println("str3 : " + str3);
	 }
}
