package day0310.homework;

public class Homework1 {
	public static void main(String[] args) {
		String blank = " ";
		int cnt = 0;
					// 0123456789012345678901234567
		String message = "Welcome to 코리아~ !~~ !~~~ !";
		int[] blankFind = new int[message.length()];

		blankFind[0] = message.indexOf(blank);
		for (int i = 1; i < message.length(); i++) {
			String str = message.substring(blankFind[i-1] + 1);
			int bl = str.indexOf(blank);
			cnt++;
			if(bl < 0) {
				break;
			}
			blankFind[i] = blankFind[i-1] + bl + 1;
		}
		
		System.out.println("공백의 갯수는 "+cnt+"개 입니다.");
		System.out.print("공백의 위치: ");
		for(int i = 0; i<message.length(); i++) {
			if(blankFind[i] == 0) {
				break;
			}
			System.out.print(blankFind[i] + "/");
		}
		
		/*
		for (int i = 0 ; i < msg3.length(); i++) {
			if (msg3.charAt(i) == ' ') {
				System.out.print(i + ",");
			}
		}
		System.out.println();
		
		int count = 0;
		blankFind[count++] = msg3.indexOf(blank);
		while (true) {
			int index = msg3.substring(blankFind[count-1] + 1).indexOf(blank);
			if (index == -1) {
				break;
			}
			blankFind[count] = blankFind[count-1] + index + 1;
			count++;
		}
		
		for (int i = 0 ; i < count; i++) {
			System.out.print(blankFind[i] + ",");
		}
		*/
		
	}
}
