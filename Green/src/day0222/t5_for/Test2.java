package day0222.t5_for;

// '안녕' 인사말을 5번 출력하시오.
public class Test2 {
	public static void main(String[] args) {

		for(int i=0; i<5; i++)	{			// 튕겨져 나오는건 도는것에 포함되지 않는다. 총 6번 돈다.
			System.out.println((i+1)+".안녕");
		
		}
		System.out.println("작업끝");
	}
}
