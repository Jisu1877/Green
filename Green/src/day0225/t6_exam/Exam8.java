package day0225.t6_exam;

public class Exam8 {
	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0, cnt = 0;
		double avg = 0.0;

		// 처리
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		avg = (double) sum / cnt;

//		int cnt = array[0].length + array[1].length + array[2].length;
//		avg = (double)sum /cnt;

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
