package day0303.t9_MVC;

public class SungjukService {		//서비스 객체는 메소드로 처리
	char grade;
	
	public char getGrade(double avg) {
		if(avg > 90) grade = 'A';	
		else if(avg > 80) grade = 'B';	
		else if(avg > 70) grade = 'C';	
		else if(avg > 60) grade = 'D';	
		else grade = 'F';
		return grade;
	}
}
