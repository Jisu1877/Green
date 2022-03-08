package day0308.t5_interfaceEx;

import java.util.Scanner;

public class ActorRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] title = {"경찰관", "소방관", "요리사"};
		
		Actor actor = new Actor();
		int no;
		while(true) {
			System.out.println("어떤 역할을 하고 싶으신가요? ");
			System.out.print("1.경찰관 | 2.소방관 | 3.요리사 | 0.종료 ==> ");
			no = scanner.nextInt();
			if(no < 1 || no > 3) break;
			
			System.out.println(title[no-1] + "의 역할?");
			switch(no) {
				case 1:
					actor.catching();
					actor.search();
					break;
				case 2:
					actor.fire();;
					actor.rescue();
					break;
				case 3:
					actor.cooking();
					actor.spagetti();
					break;
			}
			System.out.println("-----------------------------\n");
		}
		System.out.println("=============작업끝================");
		
		scanner.close();
	}
}
