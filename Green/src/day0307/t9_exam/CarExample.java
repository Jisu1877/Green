package day0307.t9_exam;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car(); //Car객체 생성
		
		for(int i=1; i<=5; i++) {		 		//run()메소드 5번 반복 실행 / 왜 5번 반복일까?
			int problemLocation = car.run();  //problemLocation은 Car객체의 run()메소드가 리턴하는 숫자를 받는 변수.
			
			switch(problemLocation) {
				case 1:
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire("앞왼쪽", 15);
					break;
				case 2:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 13);
					break;
				case 3:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.backLeftTire = new HankookTire("뒤왼쪽", 14);
					break;
				case 4:
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.backRightTire = new KumhoTire("뒤오른쪽", 17);
					break;
			}
			System.out.println("--------------------------------------------");
		}
	}
}
