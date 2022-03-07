package day0222.t5_for;

// '안녕' 인사말을 5번 출력하시오.
public class Test1 {
	public static void main(String[] args) {
//		System.out.println("1.안녕");
//		System.out.println("2.안녕");
//		System.out.println("3.안녕");
//		System.out.println("4.안녕");
//		System.out.println("5.안녕"); 	// 이렇게 할수도 있지만 반복문을 사용한다.
		// 반복문(횟수를 알때는 for문을 사용하면 편리하다.)
		// for(변수설정 및 초기값할당; 변수조건식 및 최종값; 변수 증가/감소)
		
//		int i;
		for(int i=1; i<=5; i++)	{			// ++i 도 되고 i+=1, i=+1 도 된다.	// i=5 라고 쓰면 안된다. 조건연산자가 들어와야한다.	//i가 6이되면서 실행이 끝난다.
			System.out.println(i+".안녕");	//		for(i=1; i<=5; i++)	System.out.println("안녕"); 	// 한줄 일때 이렇게 {} 를 생략해도 된다.
		
		}
		System.out.println("작업끝");
	}
}
