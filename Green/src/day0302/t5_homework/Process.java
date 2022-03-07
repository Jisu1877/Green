package day0302.t5_homework;

//입력된 정수값 출력 메소드
public class Process {
	int[] num;
	int cnt, tot;
	int max, min;
	int temp;

	public Process(int[] num, int cnt) {
		this.num = num;
		this.cnt = cnt;
	}
	void print() {
		for (int i = 0; i < cnt; i++) {
			System.out.print(num[i] + "/");
			tot += num[i];
		}
	}
	void setMaxMin() {
		max = num[0];
		min = num[0];

		for (int i = 0; i < cnt; i++) {
			if (max < num[i]) {
				max = num[i];
			}
			if (min > num[i]) {
				min = num[i];
			}
		}
	}
	double setAvg() {
		double avg = (double)(tot / cnt);
		
		return avg;
	}
	void sort1() {
		for(int i=0; i<cnt-1; i++) {		
			for(int j=i+1; j<cnt; j++) {		
				if(num[i] > num[j]) {									
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
	}
	void sort2() {
		for(int i=0; i<cnt-1; i++) {		
			for(int j=i+1; j<cnt; j++) {		
				if(num[i] < num[j]) {									
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
	}
}
