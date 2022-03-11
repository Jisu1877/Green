package day0308.t6_interfaceEx;

import java.util.Scanner;

/*
 장난감 가게에서 연령별로 각각에 대한 기능을 알아보는 프로그램을 만드시오?(인터페이스사용)
 (연령대를 입력하면 각 연령에 해당하는 장난감명과 기능을 모두 출력시켜주시오.)
 ----------------------------------------------------
 장난감  팔다리움직임		불빛발사기능	미사일발사기능	연령대
 ----------------------------------------------------
 곰돌이     o				x			x		 전체연령
 로보트     o				x			o		 5세이상만 가능
 비행기     x				o			o		 7세이상만 가능
 탱크      x				x			o		 10세이상만 가능
 ----------------------------------------------------
 */
public class ToyRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Toy[] toys = {new Bear(), new Robot(), new Airplane(), new Tank()};
		String[] title = {"곰돌이", "로보트", "비행기", "탱크"};
		int age;
		
		
		while(true) {
			System.out.println("\n장난감을 사용할 사람의 연령대를 입력하세요.(종료는 999)");
			System.out.print("입력 > ");
			age = scanner.nextInt();
			if(age == 999) {
				System.out.println("종료합니다. 감사합니다.");
				break;
			}
			for(int i = 0; i < toys.length; i++) {
				if(age >= toys[i].getminAge()) {
					System.out.println("\n사용가능한 장난감 : " + title[i]);
					System.out.println("*" + title[i] + "의 기능 : ");
					toys[i].moving();
					toys[i].light();
					toys[i].missile();
				}
				else if(age < 0){
					System.out.println("음수값은 연령으로 입력할 수 없습니다. 다시입력해주세요.");
					continue;
				}
			}
			
			System.out.println("---------------------------------");
			
		}
		scanner.close();
	}
	
	
}
