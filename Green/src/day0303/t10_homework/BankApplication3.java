package day0303.t10_homework;

import java.util.Scanner;
//계좌삭제 추가
public class BankApplication3 {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int nullPoint = 0;

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌삭제 | 6.종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {			//계좌생성
				createAccount();
				System.out.println();
			}else if(selectNo == 2) {	//계좌목록
				accountList();
				System.out.println();
			}else if(selectNo == 3) {	//예금
				deposit();
				System.out.println();
			}else if(selectNo == 4) {	//출금
				withdraw();
				System.out.println();
			}else if(selectNo == 5) {	//종료
				delete();
			}else if(selectNo == 6) {	//종료
				run = false;
			}
		}
		System.out.println("프로그램 종료!!");
	} 
	
	//계좌생성메소드
	private static void createAccount() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		//입력한 정보로 계좌를 생성시켜준다.
		Account account = new Account(ano, owner, balance);
		
		//생성한 Account 객체를 배열에 저장시켜준다.
		//이때 배열에 저장되는 Account 객체는 배열의 null값이 저장된 방에 저장시켜준다.
		//여기서는 배열을 처음부터 검색하여 null값이 있는 방을 만나면 그곳에 저장시켜주기로 한다.
		accountArray[nullPoint] = account;
		System.out.println("결과 : 계좌가 생성되었습니다.");
		nullPoint++;
//		for(int i=0; i<accountArray.length; i++) {				//계좌삭제 추가로 필요없어진 for문
//			if(accountArray[i] == null) {
//				accountArray[i] = account;
//				System.out.println("결과 : 계좌가 생성되었습니다.");
//				break;
//			}
//		}
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("----------------------");
		System.out.println("계좌목록\t계좌주\t현재잔고");
		System.out.println("----------------------");
		
		//계좌가 있는동안 반복하여 계좌정보를 출력시켜준다.
		int cnt = 0;
		while(true) {
			Account imsiAccount  = accountArray[cnt];
			if(imsiAccount != null) {
				System.out.print(imsiAccount.getAno() + "\t");
				System.out.print(imsiAccount.getOwner() + "\t");
				System.out.print(imsiAccount.getBalance() + "\t");
				System.out.println();
				cnt++;
			}
			else {
				break;
			}
		}
	}
	//예금하기 메소드
	private static void deposit() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		
		//계좌번호와 예금액을 입력한다.
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		int money = 0;
		while(true) {
			System.out.print("예금액: ");
			money = scanner.nextInt();
			if(money < 0) {
				System.out.println("마이너스 금액은 입력할 수 없습니다.");
			}else break;
		}
		//계좌검색 메소드 호출
		Account account = findAccount(ano);			//ano계좌번호를 넘기면 찾은 객체를 반환받는다.
		
		//찾고자 하는 계좌정보가 없으면 null이 반환된다.
		if(account == null) {
			System.out.println("결과 : 찾는 계좌가 없습니다.");
		}
		else {
			account.setBalance(account.getBalance() + money);
			System.out.println("결과 : 예금이 성공적으로 입금되었습니다.");
		}
	}
	
	//계좌검색 메소드
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
			else {
				break;
			}
		}
		return account;
	}
	
	//출금하기 메소드
	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		
		//계좌번호와 예금액을 입력한다.
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		int money = 0;
		//계좌검색 메소드 호출
		Account account = findAccount(ano);			//ano계좌번호를 넘기면 찾은 객체를 반환받는다.
		while(true) {
			System.out.print("출금액: ");
			money = scanner.nextInt();
			if(money < 0) {
				System.out.println("마이너스 금액은 입력할 수 없습니다.");
			}else if(account.getBalance() < money) {
				System.out.println("출금가능 금액은 "+account.getBalance()+" 입니다.");
			}else {
				break;
			}
		}
		
		//찾고자 하는 계좌정보가 없으면 null이 반환된다.
		if(account == null) {
			System.out.println("결과 : 찾는 계좌가 없습니다.");
		}
		else {
			account.setBalance(account.getBalance() - money);
			System.out.println("결과 : 출금이 성공적으로 입금되었습니다.");
		}
	}
	//계좌 삭제 메소드
	private static void delete() {
		System.out.println("-----------");
		System.out.println("계좌삭제");
		System.out.println("-----------");
		
		//계좌번호를 입력받는다.
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		//계좌삭제
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
					accountArray[i] = null;
				}
			}
		}
		System.out.println("결과 : 계좌삭제가 성공적으로 완료되었습니다.");
		
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null && accountArray[i+1] != null) {
				account = accountArray[i+1];
				accountArray[i+1] = accountArray[i];
				accountArray[i] = account;
				nullPoint = i+1;
			}else if(accountArray[i] == null && accountArray[i+1] == null) {
				break;
			}
		}
	}
}
