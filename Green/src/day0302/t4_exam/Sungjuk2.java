package day0302.t4_exam;

public class Sungjuk2 {
	String name;
	int kor, eng, mat;
	
	public Sungjuk2(String name, int kor, int eng, int mat) {		//생성자 생성과 함께 입력받겠다.
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	int sum() {
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
