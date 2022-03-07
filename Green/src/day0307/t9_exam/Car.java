package day0307.t9_exam;

public class Car {
	//필드 //자동차는 4개의 타이어를 갖기 때문에 Tire타입으로(자기타입)타이어객체 4개를 생성한다.
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	//생성자 - 선언 안함.
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) { stop(); return 1;}  //Tire객체의 roll()메소드 불러오기. false가 리턴되면 stop()메소드 호출.
		if(frontRightTire.roll()==false) { stop(); return 2;}	//펑크난 타이어의 위치를 숫자로 리턴하고 있다. 나중에 switch에서 사용.
		if(backLeftTire.roll()==false) { stop(); return 3;}		//roll()메소드로 인해 모든 타이어가 1회 돌아간다.
		if(backRightTire.roll()==false) { stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
