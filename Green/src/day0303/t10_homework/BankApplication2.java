//package day0303.t10_homework;
//
//import java.util.Scanner;
//
//public class BankApplication2 {
//	private static Account[] accountArray = new Account[100];
//	private static Scanner scanner = new Scanner(System.in);
//	static int cnt;
//	
//	public static void main(String[] args) {
//		boolean run = true;
//		while(run) {
//			System.out.println("---------------------------------------------------");
//			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
//			System.out.println("---------------------------------------------------");
//			System.out.print("선택> ");
//			
//			int selectNo = scanner.nextInt();
//			
//			if(selectNo == 1) {
//				createAccount();
//			}else if(selectNo == 2) {
//				accountList();
//			}else if(selectNo == 3) {
//				deposit();
//			}else if(selectNo == 4) {
//				withdraw();
//			}else if(selectNo == 5) {
//				run = false;
//			}
//		}
//		System.out.println("프로그램 종료");
//	} 
//	
//	//계좌생성하기
//
//	private static void createAccount() {
//		accountArray[cnt] = new Account();
//		System.out.println("-----------");
//		System.out.println("계좌생성");
//		System.out.println("-----------");
//			System.out.print("계좌번호: ");
//			accountArray[cnt].setAno(scanner.nextLine());
//			System.out.print("계좌주: ");
//			accountArray[cnt].setOwner(scanner.nextLine());
//			System.out.print("초기입금액: ");
//			accountArray[cnt].setBalance(scanner.nextInt());
//		System.out.println("결과: 계좌가 생성되었습니다.");
//		cnt++;
//	}
//	
//	//계좌목록보기
//	private static void accountList() {
//		System.out.println("-----------");
//		System.out.println("계좌목록");
//		System.out.println("-----------");
//		for (int i = 0; i < cnt; i++) {
//			Account myAccount = accountArray[i];
//			System.out.println(myAccount.getAno() + "\t" + myAccount.getOwner() + "\t" + myAccount.getBalance());			
//		}
//	}
//	
//	//예금하기
//	private static void deposit() {
//		System.out.println("-----------");
//		System.out.println("예금");
//		System.out.println("-----------");
//		System.out.print("계좌번호>>");
//		String ano = scanner.next();
//		System.out.print("예금액>>");
//		int money = scanner.nextInt();
//		
//		if (money < 0) {
//			System.out.println("입출금액은 0보다 커야합니다.");
//			return;
//		}
//		
//		boolean result = false;
//		int count = 0;
//		for (int i = 0; i < cnt; i++) {
//			if (accountArray[i].getAno().equals(ano)) {
//				int balance = accountArray[i].getBalance();
//				result = accountArray[i].setBalance(balance + money);
//				count++;
//			}
//		}
//		System.out.print("결과 : ");
//		if (!result) {
//			System.out.println("마이너스 금액을 입력할 수 없습니다.");
//		} else if (count == 0) {
//			System.out.println("일치하는 계좌가 없습니다.");
//		} else {
//			System.out.println("예금이 성공되었습니다.");
//		}
//	}
//	
//	private static void withdraw() {
//		System.out.println("-----------");
//		System.out.println("출금");
//		System.out.println("-----------");
//		System.out.print("계좌번호>>");
//		String ano = scanner.next();
//		System.out.print("출금액>>");
//		int money = scanner.nextInt();
//		
//		if (money < 0) {
//			System.out.println("입출금액은 0보다 커야합니다.");
//			return;
//		}
//		
//		boolean result = false;
//		boolean isEmpty = false;
//		int count = 0;
//		for (int i = 0; i < cnt; i++) {
//			if (accountArray[i].getAno().equals(ano)) {
//				int balance = accountArray[i].getBalance();
//				
//				if (balance <= 0) {
//					isEmpty = true;
//					break;
//				}
//				
//				result = accountArray[i].setBalance(balance - money);
//				count++;
//			}
//		}
//		System.out.print("결과 : ");
//		if (!result) {
//			System.out.println("잔고가 부족합니다.");
//		} else if (count == 0) {
//			System.out.println("일치하는 계좌가 없습니다.");
//		} else if (isEmpty) {
//			System.out.println("잔고가 없습니다.");
//		} else {
//			System.out.println("출금이 성공되었습니다.");
//		}
//	}
//}
