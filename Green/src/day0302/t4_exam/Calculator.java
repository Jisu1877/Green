package day0302.t4_exam;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);		//plus메소드 호출.
		double result = sum / 2;		
		return result;				//계산된 값인 result를 리턴.
	}
	
	void execute() {
		double result = avg(7, 10);	//avg메소드 호출.
		println("실행결과: " + result);	//println 메소드 호출.
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
