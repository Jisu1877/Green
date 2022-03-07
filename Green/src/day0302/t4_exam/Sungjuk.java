package day0302.t4_exam;

public class Sungjuk {
	
//	int calc(int kor, int eng, int mat) {			//오버로딩으로 구현한 예시.
//		return kor + eng + mat;
//	}
//	
//	double calc(int tot) {
//		return (double) tot  / 3;
//	}
	
	
	int sum(int kor, int eng, int mat) {
		return kor + eng + mat;
	}
	
	double avg(int tot) {
		return (double) tot  / 3;
	}
	
	char grade(double avg) {
		char grade;
		
		if(avg >= 90) grade = 'A';
		else if(avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else if(avg >= 60) grade = 'D';
		else grade = 'F';
			
		return grade;
	}
}
