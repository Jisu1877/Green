package day0222.t6_while;

public class Test6 {
	public static void main(String[] args) {
		int i = 0;
		int odd = 0;
		int even = 0;
		
		while(i < 100) {
			i = i + 1;			//i++
			odd = odd + i;		//odd += i
			i = i + 1;			
			even = even + i; 	//even += i
		}
		System.out.println("홀수합?" + odd);
		System.out.println("짝수합?" + even);
	}
}
