package day0222.homework;

import java.util.Scanner;

/*
 문제6) 그린주식회사의 2월달 급여를 계산하시오?
조건 ) 2월달 평균 출근일수는 20일이다.(20일 근무시 300000원을 기본으로 지급받는다)
'성명'과 '부서명'과 '실제 근무일수'를 입력받아서, 만약 평균출근일수보다 초과했다면, 1일당 100000원을 추가로 지금하고, 평균일수보다 부족하면 50000원을 삭감하기로 한다.
부서명은 첫글자가 'i 또는 I'는 '인사과', 'c 또는 C'는 총무과, 'j 또는 J'는 자재과, 'y 또는 Y'는 영업과, 나머지는 '홍보과'로 처리한다.
또한 2022년의 2월달은 28일 밖에 없기에, 실제근무일수가 28일을 초과해서 입력했다면 메세지를 출력하고 다시 입력받도록 처리하시오.
한건의 자료 처리후 '작업을 계속하시겠습니까?(Y/N)'를 물어보고, 'Y'를 입력하면 다시 작업할 수 있도록, 'N'를 입력하면 작업을 마치도록 처리하시오.(입력자료및 출력결과는 아래 출력결과를 참조하세요)~~
*/
/*성명을 입력하세요? 홍길동
부서명을 입력하세요? i
실제 근무일수를 입력하세요? 30

2월달은 28일까지만 근무하실수 있습니다.
실제 근무일수를 입력하세요? 25

인사과에 근무하시는 홍길동님은 5일 초과 근무하셔서 급여는 3500000원입니다.
작업을 계속하시겠습니까?(Y/N) y

성명을 입력하세요? 김말숙
부서명을 입력하세요? c
실제 근무일수를 입력하세요? 16

총무과에 근무하시는 김말숙님은 4일 근무 미달이셔서 급여는 2800000원입니다.
작업을 계속하시겠습니까?(Y/N) N
수고 하셨습니다.
 */
public class Homework0223_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String department;
		int time;
		int overtime, money;
		boolean choice = true;
		char answer;
		boolean over;
		
		while(choice) {
			System.out.println("성명을 입력하세요?");
			name = sc.next();
			System.out.println("부서명을 입력하세요?");
			department = sc.next();
			while(true) {
				System.out.println("실제 근무일수를 입력하세요?");
				time = sc.nextInt();
				if(time > 28) {
					System.out.println("2월달은 28일까지만 근무하실수 있습니다.");
				}else {
					break;
				}
			}
			overtime = 28 - time;
			if(overtime >= 1 && overtime <=8) {
				money = 300000 +(overtime * 100000);
				over = true;
			}
			else {
				money = 300000 -(overtime*50000);
				over = false;
			}
			switch(department) {
				case "i":
				case "I":
					if(over == true) {
					System.out.println("인사과에 근무하시는 "+name+"님은 "+overtime+"일 초과 근무하셔서 급여는 원입니다.");
					}
					
			}
			while(true) {
				System.out.print("작업을 계속하시겠습니까?(Y/N)");
				answer = sc.next().charAt(0);
				if(answer == 'Y' || answer == 'y') {
					choice = true;
				}else if(answer == 'N' || answer == 'n') {
					choice = false;
					System.out.println("종료합니다. 감사합니다.");
				}else {
					System.out.println("잘못입력하셨습니다.");
					continue;
				}
			}
			
		}
		sc.close();
	}
}
