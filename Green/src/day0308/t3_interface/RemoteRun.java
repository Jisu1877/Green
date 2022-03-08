package day0308.t3_interface;

import java.util.Scanner;

public class RemoteRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Audio audio = new Audio();
		audio.switchOn("오디오");
//		audio.setVolume(25);
//		audio.setVolume(-5);
//		audio.setVolume(7);
		String vo;
		System.out.println("현재 오디오의 볼륨은? " + audio.getVolume());
		while(true) {
			System.out.print("볼륨을 입력하세요? (숫자/+/-/999종료)");
			vo = scanner.next();
			if(vo.equals("999")) break;
			if(vo.equals("+")) audio.setVolume(audio.getVolume() + 1);
			else if(vo.equals("-")) audio.setVolume(audio.getVolume() - 1);
			else audio.setVolume(Integer.parseInt(vo));			//현재오디오 볼륨 내용도 함께 출력. set과 동시에..
		}
		
		audio.switchOff();
		System.out.println("=================작업끝==================");
		
		scanner.close();
	}
}
