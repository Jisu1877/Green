package day0222.t5_for;

public class Test3 {
	public static void main(String[] args) {
		int tot = 0;

		for (int i = 1; i <= 100; i++) {	// 시작값이 0이면 =을 빼주고 시작값이 1이면 =을 넣어주면 지정한 숫자만큼 돈다.
			tot = tot + i; // tot += i
		}

		System.out.println("1~100까지의 합은" + tot);
	}
}
