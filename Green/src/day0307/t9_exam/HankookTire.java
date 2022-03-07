package day0307.t9_exam;
//Tire의 자식클래스
public class HankookTire extends Tire {
	//필드 - 없음
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation; //누적 회전수 1증가(전위연산)
		if(accumulatedRotation < maxRotation) {				//정상회전(누적<최대)일 경우 실행
			System.out.println(location + "HankookTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {												//펑크(누적=최대)일 경우 실행
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
