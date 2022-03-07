package day0222.t6_while;
// while(조건식) {
// }
// while문은 조건식의 내용이 참이면 무조건 블록안을 수행한다. 즉, 조건의 내용이 거짓이면 수행하지 않는다.
public class Test1 {
	public static void main(String[] args) {
		int i = 0;
//		while(true) 	// 조건의 내용이 참이기에 무조건 수행한다.
		while(i<5) {
			System.out.println("안녕");
//			i++;	//  조건변수의 값을 변경하는 내용이 없으면 앞의 프로그램은 무한loop에 빠진다. 해커들이 이걸로 프로그램 다운시켜버린다.
		}
	}
}
