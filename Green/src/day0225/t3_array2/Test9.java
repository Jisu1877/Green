package day0225.t3_array2;

public class Test9 {
	public static void main(String[] args) {
		String[] str = { "홍길동", "김말숙", "이기자", "강감찬", "김연아" };

		for (int i = 0; i < str.length; i++) {
			System.out.println("성명[" + i + "] : " + str[i]);
		}
		System.out.println();

		// 향상된 for문
		for (String s : str) {
			System.out.println("성명 : " + s);
		}
		System.out.println();
		// 향상된 for문
		int cnt = 0;
		for (String s : str) {
			cnt++;
			System.out.println(cnt + ".성명 : " + s);
		}
	}
}
