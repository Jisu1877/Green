package day0222.t3_ifTest;

public class Test1 {
	public static void main(String[] args) {
		int su1 = 100, su2=200;
		
		if(su1 > su2) {
			System.out.println("su1가 su2보다 큽니다.");
			// 참일때 내용 수행
		}
		else {
			System.out.println("su2가 su1보다 큽니다.");
			// 거짓일때 내용 수행
		}
	}
}
