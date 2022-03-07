package day0222.t6_while;

// 1~100까지의 홀수합(odd)

public class Test7 {
	public static void main(String[] args) {
		int i=0, sw=0, odd=0, even=0;
		
		while(i<100) {
			i = i + 1;
			if(sw == 0) {
				odd = odd + i;
				sw = 1;
			}
			else {
				even = even + i;
				sw = 0;
			}
		}
		System.out.println("홀수합?" + odd);
		System.out.println("짝수합?" + even);
	}
}
