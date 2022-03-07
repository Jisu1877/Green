package day0222.t6_while;

// 1~100까지의 합을 구하시오.(while문 사용)
public class Test4 {
	public static void main(String[] args) {
		int i = 0;
		int tot = 0;
		
		while(i < 100) {
			i = i + 2;	// i+=2
			tot = tot + i;	//tot += i 라고 적도 됨.
					
		}
		System.out.println("i값은? " + i);	// 100이 되자마자 빠져나오는 while 문이라서 i값이 100이다.
		System.out.println("1~100까지의 짝수합은?" + tot);
	}
}
