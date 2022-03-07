package day0222.t2_format;

public class Test1 {
	public static void main(String[] args) {
		int su1=10, su2=20;
//		double su3;
		int res1;
		double res2;
		
		res1 = su1 / su2;	
		System.out.println("res1 = " + res1);
		res2 = su1 / su2;		// 정수 정수 연산이라서 값이 정수값인 0으로 나온다. 그래서 0.0으로 출력됨. 원래 10나누기 20은 0.5인데
		res2 = (double)su1 / su2;	// 둘중 하나에만 강제변환시켜주면 실수값인 0.5 가 나옴
		System.out.println("res2 = " + res2);
		
		res1 = su1 / 3;
		res2 = su1 / 3.0;	// res2 는 double 타입이라서 에러가 안남
		System.out.println("res3 = " + res1);
		
		res1 = su1 % 3;
		System.out.println("res1 = " + res1);
		
		// 10을 3으로 나누었을 때 몫과 나머지를 구하시오?
		System.out.println("10 / 3의 몫? " + (su1 / 3));
		System.out.println("10 / 3의 나머지? " + (su1 % 3));
		
		
	}
}
