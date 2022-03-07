package day0222.t2_format;

public class Test4__printf {
	public static void main(String[] args) {
		// 출력 Format ==> printf()사용
		// 정수 : %d, 실수 : %f, 문자열 : %s
		// %'전체길이'양식코드 예) %5d : 전체 자리수가 5자리를 확보후 우측부터 숫자출력
		// 					%5.2f : 전체 자리수가 5자리를 확보후 소수이하 2자리 출력, 우측부터 숫자출력
		
		int su1 = 1200;
		System.out.printf("상품가격은 %d입니다.\n", su1);		// 받을 값을 뒤에 , su1 이런식으로 붙여줘야함.
		System.out.printf("상품가격은 %6d입니다.\n", su1);
		System.out.printf("상품가격은 %-6d입니다.\n", su1);	// 공백이 뒤로 붙음. 앞에 먼저 1200을 출력하고 공백이 뒤로 붙음.
		
		double su2 = 3.141592;
		System.out.printf("원주율은 %f입니다.\n", su2);
		System.out.printf("원주율은 %6.2f입니다.\n", su2);
		
		String str = "Java";
		System.out.printf("지금 과정은 %s과정 입니다.\n", str);
		System.out.printf("지금 과정은 %10s과정 입니다.\n", str);  // 10자리 확보후 뒤에서 부터 출력했다.
	}
}
