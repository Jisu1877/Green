package day0222.t6_while;
// while(조건식) {
// }
// while문은 조건식의 내용이 참이면 무조건 블록안을 수행한다. 즉, 조건의 내용이 거짓이면 수행하지 않는다.
public class Test2 {
	public static void main(String[] args) {
		int i = 0;
		while(i<5) {
			System.out.println("안녕");
			i++;
		}
	}
}
