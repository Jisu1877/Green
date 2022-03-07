package day0225.t1_memory;

public class Test1 {
	public static void main(String[] args) {
		int su1 = 100;
		int su2 = 100;
		int su3 = 200;
		
		if(su1 == su2) {
			System.out.println("su1과 su2는 같습니다.");
		}
		else {
			System.out.println("su1과 su2는 다릅니다.");
		}
		if(su1 == su3) {
			System.out.println("su1과 su3는 같습니다.");
		}
		else {
			System.out.println("su1과 su3는 다릅니다.");
		}
		System.out.println();
		
		String str1 = "홍길동";
		String str2 = new String("홍길동");
		String str3 = new String("홍길동");
		String str4 = "홍길동";
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 같습니다.");
		}
		else {
			System.out.println("str1과 str2는 다릅니다.");
		}
		if(str2 == str3) {
			System.out.println("str2과 str3는 같습니다.");
		}
		else {
			System.out.println("str2과 str3는 다릅니다.");
		}
		if(str1 == str4) {
			System.out.println("str1과 str4는 같습니다.");
		}
		else {
			System.out.println("str1과 str4는 다릅니다.");
		}
		if(str2.equals(str3)) {
			System.out.println("str2과 str3는 같습니다.");
		}
		else {
			System.out.println("str2과 str3는 다릅니다.");
		}
			
	}
}
