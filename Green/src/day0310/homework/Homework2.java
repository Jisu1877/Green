package day0310.homework;

import java.util.Scanner;

/*
 * (문제2) 아래 message변수에 저장된 문자열중에서, 사용자가 영문 'a~z 또는 A~Z'까지의 임의의 문자를 입력하면, (
 * 해당 문자가 전체 몇개 있는지와, 그 문자가 위치한 위치값을 출력하시오.
 * (대소문자는 구별하지않고 같은것으로 보고 처리하도록 합니다. (예: a랑 A는 같은문자로 간주됨))
 * message = "Welcome to Korea! Nice to meet you! Have a good time!"
예)

    알파벳 문자 1개를 입력하세요?  a

    입력한 a 는 메세지내용중 2개가 있으며, 위치는 15, 37, 41번째 있습니다.

    계속 하시겠습니까?(y/n) n

    수고하셨습니다.
 */

//indexOf , charAt, equalsIgnoreCase, 
public class Homework2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String message = "Welcome to Korea! Nice to meet you! Have a good time!";
		int[] memory = new int[message.length()];
		char aToZ;
		int cnt = 0;
		int cnt2 = 1;
		
		while(true) {
			System.out.println(message + "\n위 문장에서 특정 알파벳을 찾아봅시다.");
			System.out.print("알파벳 문자 1개를 입력하세요? >> ");
			aToZ = scanner.next().charAt(0);
			
			for(int i = 0; i<message.length(); i++) {
				char mes = message.charAt(i);
				String str = String.valueOf(aToZ);
				String str2 = String.valueOf(mes);
				if(str.equalsIgnoreCase(str2) == true) {
					memory[i] = i;
					cnt++;
				}
				else {
				}
			}
			System.out.print("입력한 "+aToZ+"는 메세지 내용 중 "+cnt+"개가 있으며, 위치는 ");
			
			for(int i = 0; i<message.length(); i++) {
				if(memory[i] != 0) {
					System.out.print(memory[i]);
					if(cnt != cnt2) {
						System.out.print(",");
						cnt2++;
					}
				}
			}
			
			System.out.println("번째 있습니다.");
			System.out.print("계속 하시겠습니까?(y/n) >> ");
			String choice = scanner.next();
			System.out.println();
			if(choice.equalsIgnoreCase("y")) {
				cnt = 0;
				cnt2 = 1;
				for(int i = 0; i<message.length(); i++) {
					if(memory[i] != 0) {
						memory[i] = 0;
					}
				}
				continue;
			}else if(choice.equalsIgnoreCase("n")) {
				System.out.println("종료합니다. 감사합니다.");
				break;
			}
		}
		scanner.close();
	}
}
