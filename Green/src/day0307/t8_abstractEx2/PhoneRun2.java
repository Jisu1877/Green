package day0307.t8_abstractEx2;

import java.util.Scanner;

public class PhoneRun2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] title = {"Lg", "Samsung", "Hyeondae"};
		String choice2;
		int i;
		
		while(true) {
			System.out.print("회사 이름을 입력하세요>> ");
			String choice = scanner.next();
			if(title[0].equals(choice)) {
				i = 0;
				break;
			}else if(title[1].equals(choice)) {
				i = 1;
				break;
			}else if(title[2].equals(choice)) {
				i = 2;
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
		}
		System.out.print("사용자 이름을 입력하세요>> ");
		choice2 = scanner.next();
		
		Phone phoneLg = new Lg(choice2);
		Phone phoneSam = new Samsung(choice2);
		Phone phoneHyeon = new Hyeondae(choice2);
		
		Phone[] phonefunction = {phoneLg, phoneSam, phoneHyeon};
		
		System.out.println(" * "+title[i]+"폰의 기능");
		phonefunction[i].powerOn();
		phonefunction[i].sound();
		phonefunction[i].function();
		phonefunction[i].functionLg();
		phonefunction[i].functionSamsung();
		phonefunction[i].functionHyeondae();
		phonefunction[i].powerOff();
		System.out.println("===========================");
		
		scanner.close();
	}
}
