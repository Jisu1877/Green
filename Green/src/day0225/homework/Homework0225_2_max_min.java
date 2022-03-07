package day0225.homework;

//(문제2) 10개의 난수(범위는 1~100)를 발생시켜서 최대값과 최소값을 구하시오.
//- 출력형식은 먼저 '최대값'과 '최소값'을 구해서 출력하고, 그 후 최대값,최소값을 위해 발생시켰던 난수 10개를 차례대로 출력시켜 주시오.
public class Homework0225_2_max_min {
	public static void main(String[] args) {
		int[] random = new int[10];
		int max, min;

		for (int i = 0; i < random.length; i++) {			// random 배열 크기 만큼 for문 돌리기. 주의할점! i <=random.length; 으로 하면 에러난다. 크기 10의 배열을 선언하면 인덱스 0번부터 9번까지 주어지기 때문.
			int num = (int) (Math.random() * 100) + 1;
			random[i] = num;								// 난수를 배열에 저장하기.
//			System.out.print(num + " ");
		}
		max = random[0];									// 최대값과 최소값을 구하기 위해 초기값 설정을 똑같은 수로 해야한다. 그래서 인덱스 0번의 난수를 입력한 것.
		min = random[0];
		for (int i = 1; i < random.length; i++) {
			if (max < random[i]) {
				max = random[i];
			}
			if (min > random[i]) {
				min = random[i];
			}
		}
		System.out.println("최대값은?" + max);
		System.out.println("최소값은?" + min);

		for (int res : random) {							// 향상된 for문을 사용하여 난수 순서대로 꺼내 입력하기.
			System.out.print(res + " ");
		}
	}
}
