package day0304.homework;

import java.util.Scanner;

public class CalculatorRun {
	public static void main(String[] args) {
		ChileCalculator cal = new ChileCalculator();
		Scanner scanner = new Scanner(System.in);
		String[] title = {"덧셈", "뺄셈", "곱셈", "나눗셈", "반올림", "제곱근", "지수", "종료"};
		
		System.out.println("계산기 프로그램 실행");
		
		while(true) {
			System.out.println("진행하고자 하는 계산은?(종료는 '종료'입력.)");
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.반올림 | 6.제곱근 | 7.지수 | 8.종료");
			System.out.println("----------------------------------------------------------------");
			System.out.print("원하는 계산 한글만 입력>> ");
			String choice = scanner.next();
			
			if(title[0].equals(choice)) {
				System.out.println("덧셈을 원하는 수 2개를 입력하세요.");
				System.out.print("첫번째 수 입력 >> ");
				double su1 = scanner.nextDouble();
				System.out.print("두번째 수 입력 >> ");
				double su2 = scanner.nextDouble();
				cal.add(su1,su2);
				
			}else if(title[1].equals(choice)) {
				System.out.println("뺄셈을 원하는 수 2개를 입력하세요.");
				System.out.print("첫번째 수 입력 >> ");
				double su1 = scanner.nextDouble();
				System.out.print("두번째 수 입력 >> ");
				double su2 = scanner.nextDouble();
				cal.sub(su1,su2);
			}else if(title[2].equals(choice)) {
				System.out.println("곱셈을 원하는 수 2개를 입력하세요.");
				System.out.print("첫번째 수 입력 >> ");
				double su1 = scanner.nextDouble();
				System.out.print("두번째 수 입력 >> ");
				double su2 = scanner.nextDouble();
				cal.mul(su1,su2);
			}else if(title[3].equals(choice)) {
				System.out.println("나눗셈을 원하는 수 2개를 입력하세요.");
				System.out.print("첫번째 수 입력 >> ");
				double su3 = scanner.nextDouble();
				System.out.print("두번째 수 입력 >> ");
				double su4 = scanner.nextDouble();
				cal.div(su3,su4);
			}else if(title[4].equals(choice)) {
				System.out.println("반올림을 원하는 수를 입력하세요.");
				System.out.print("수 입력 >> ");
				double su3 = scanner.nextDouble();
				cal.roundingOff(su3);
			}else if(title[5].equals(choice)) {
				System.out.println("제곱근을 원하는 수를 입력하세요.");
				System.out.print("수 입력 >> ");
				double su3 = scanner.nextDouble();
				cal.root(su3);
			}else if(title[6].equals(choice)) {
				System.out.println("지수 계산을 위해 수 2개를 입력하세요.");
				System.out.print("수 입력 >> ");
				double su3 = scanner.nextDouble();
				System.out.print("지수 입력 >> ");
				double su4 = scanner.nextDouble();
				cal.exponent(su3,su4);
			}else if(title[7].equals(choice)) {
				System.out.println("종료합니다. 감사합니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
				System.out.println();
			}
		}
		scanner.close();
	}
}
