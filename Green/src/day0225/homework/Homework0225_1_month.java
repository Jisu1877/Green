package day0225.homework;

import java.util.Scanner;

// (문제1) 배열에 2022년 1월에서 12월의 마지막날을 기억시켜두고, 
//사용자로부터 '월'을 입력받아 '해당 월'의 1일부터 마지막일까지 출력하는 프로그램을 작성하시오. 
//단, 출력형식은 각 행에 7개씩 끊어서 출력하시오.
public class Homework0225_1_month {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
																			//이 프로그램은 2022년만 계산 됨.(blank값을 직접 지정했기 때문에)
		int[] day = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	//각 월의 마지막날을 기억.
		String[] dayOfWeek = { "", "일", "월", "화", "수", "목", "금", "토"};	//요일을 출력하기 위해 배열로 기억.
		int[] blank = { 0, 6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};				//각 모든 월의 시작 요일 들여쓰기를 위해 빈칸 배열 생성. ex. 1월은 6칸 들여쓰기 후 토요일에 1일 시작.
		int month;
		
		System.out.print("해당 월의 숫자를 입력해주세요.");
		month = sc.nextInt();

		for (int i = 1; i < dayOfWeek.length; i++) {						//요일 출력.
			System.out.print(dayOfWeek[i] + "\t");
		}
		System.out.println();

		for (int i = 1; i <= blank[month]; i++) {							//blank[] 배열에 기억해둔 빈칸 값만큼 들여쓰기 출력.
			System.out.print(" \t");
		}
		
		for (int i = 1; i <= day[month]; i++) {								//날짜 출력. day[] 배열에 기억해둔 마지막 날까지 출력하기.
			System.out.print(i + "\t");
			if ((i + blank[month]) % 7 == 0) {								//들여쓰기 된 값 만큼 출력되는 모든 날짜가 뒤로 밀려야 하고, 7개씩 끊어서 출력해야 하므로
				System.out.println();										//찍히는 날짜 갯수 + 빈칸 갯수 / 7 을 한 나머지가 0이 되었을때(7의 배수) 줄바꿈을 한다는 뜻.
			}
		}
		sc.close();
	}
}
