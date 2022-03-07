package day0307.t8_abstractEx2;

import java.util.Scanner;

public class PhoneRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("회사 이름을 입력하세요>> ");
		String choice = scanner.next();
		System.out.print("사용자 이름을 입력하세요>> ");
		String choice2 = scanner.next();
		
		
		Phone phoneLg = new Lg(choice2);
		Phone phoneSam = new Samsung(choice2);
		Phone phoneHyeon = new Hyeondae(choice2);
		
		Phone[] phonefunction = {phoneLg, phoneSam, phoneHyeon};
		String[] title = {"Lg", "Samsung", "Hyeondae"};
		
		for(int i=0; i<phonefunction.length; i++) {
			if(title[i].equals(choice)) {
				System.out.println(" * "+title[i]+"폰의 기능");
				phonefunction[i].powerOn();
				phonefunction[i].sound();
				phonefunction[i].function();
				phonefunction[i].functionLg();
				phonefunction[i].functionSamsung();
				phonefunction[i].functionHyeondae();
				phonefunction[i].powerOff();
				System.out.println("===========================");
			}
		}
		scanner.close();
	}
}
