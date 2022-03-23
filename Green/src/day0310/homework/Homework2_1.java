package day0310.homework;

import java.util.Scanner;

public class Homework2_1 {
	public static void main(String[] args) {
		String message = "Welcome to Korea! Nice to meet you! Have a good time!";
		char a = 'a';
		char Z = 'Z';
		int[] atoz = new int[Z-a+1];
		Scanner scanner = new Scanner(System.in);
		int[] indexList = new int[message.length()];
		
		char input = scanner.next().charAt(0);
		int count = 0;
		for (int i = 0; i < message.length(); i++) {
			int ch = message.charAt(i);
			atoz[ch - a]++;
			if (ch == input) {
				indexList[i]++;
				count++;
			}
		}
		
		
		for (int i = 0; i < message.length(); i++) {
			if (indexList[i] > 0) {
				System.out.print(i + ",");
			}
		}
		
		scanner.close();
	}
}
