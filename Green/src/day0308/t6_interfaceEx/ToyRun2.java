package day0308.t6_interfaceEx;

import java.util.Scanner;

/*
 장난감 가게에서 연령별로 각각에 대한 기능을 알아보는 프로그램을 만드시오?(인터페이스사용)
 (연령대를 입력하면 각 연령에 해당하는 장난감명과 기능을 모두 출력시켜주시오.)
 ----------------------------------------------------
 장난감  팔다리움직임		불빛발사기능	미사일발사기능	연령대
 ----------------------------------------------------
 곰돌이     o				x			x		 전체연령 ~
 로보트     o				x			o		 5세이상만 가능 0~5
 비행기     x				o			o		 7세이상만 가능 6~
 탱크      x				x			o		 10세이상만 가능
 ----------------------------------------------------
 
 연령대를 입력받아서 사용가능한 장난감의 기능만 조회되게 해야한다.
 */
public class ToyRun2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Toy[] toys = {new Bear(), new Robot(), new Airplane(), new Tank()};
		String[] title = {"곰돌이", "로보트", "비행기", "탱크"};
		int age;
		
		Bear bear = new Bear();
		bear.moving();
		
		while(true) {
			System.out.println("장난감을 사용할 사람의 연령대를 입력하세요.(종료는 999)");
			System.out.print("입력 > ");
			age = scanner.nextInt();
			if(age == 999) {
				System.out.println("종료합니다. 감사합니다.");
				break;
			}
			if(age < 5 && age > 0) {
				System.out.println("사용가능한 장난감은? : " + title[0]);
				System.out.print("**" + title[0] + "의 기능 : ");
				toys[0].moving();
				System.out.println();
			}
			else if(age > 5 && age < 7) {
				System.out.println("**" + "사용가능한 장난감은? : " + title[0] + "/" + title[1]);
				System.out.println("*" + title[0] + "의 기능 : ");
				toys[0].moving();
				System.out.println("*" + title[1] + "의 기능 : ");
				toys[1].moving();
				toys[1].missile();
				System.out.println();
			}
			else if(age > 6 && age < 10) {
				System.out.println("**" + "사용가능한 장난감은? : " + title[0] + "/" + title[1] + "/" + title[2]);
				System.out.println("*" + title[0] + "의 기능 : ");
				toys[0].moving();
				System.out.println("*" + title[1] + "의 기능 : ");
				toys[1].moving();
				toys[1].missile();
				System.out.println("*" + title[2] + "의 기능 : ");
				toys[2].light();
				toys[2].missile();
				System.out.println();
			}
			else if(age > 9) {
				System.out.println("**" + "사용가능한 장난감은? : " + title[0] + "/" + title[1] + "/" + title[2] + "/" + title[3]);
				System.out.println("*" + title[0] + "의 기능 : ");
				toys[0].moving();
				System.out.println("*" + title[1] + "의 기능 : ");
				toys[1].moving();
				toys[1].missile();
				System.out.println("*" + title[2] + "의 기능 : ");
				toys[2].light();
				toys[2].missile();
				System.out.println("*" + title[3] + "의 기능 : ");
				toys[3].missile();
				System.out.println();
			}
			else if(age < 0){
				System.out.println("음수값은 연령으로 입력할 수 없습니다. 다시입력해주세요.");
				continue;
			}
			System.out.println("---------------------------------");
			
		}
		scanner.close();
	}
}
