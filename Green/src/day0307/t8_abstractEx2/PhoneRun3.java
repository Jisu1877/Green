package day0307.t8_abstractEx2;

import java.util.Scanner;

public class PhoneRun3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int no;
		
		while(true) {
			System.out.print("핸드폰 제조사를 선택하세요.(1.LG 2.삼성 3.현대)");
			no = scanner.nextInt();
			if(no < 1 || no > 3) {
				System.out.println("제조사 번호를 확인하세요.");
			}else {
				break;1
			}
		}
		System.out.print("사용자 이름을 입력하세요>> ");
		String name = scanner.next();
		
		Phone[] phonefunction = {new Lg(name), new Samsung(name), new Hyeondae(name)};
		String[] title = {"Lg", "Samsung", "Hyeondae"};

		System.out.println(" * "+title[no-1]+"폰의 기능");
		phonefunction[no-1].powerOn();
		phonefunction[no-1].sound();
		phonefunction[no-1].function();
		phonefunction[no-1].functionLg();
		phonefunction[no-1].functionSamsung();
		phonefunction[no-1].functionHyeondae();
		phonefunction[no-1].powerOff();
		System.out.println("===========================");
		scanner.close();
	}
}
