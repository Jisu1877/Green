package day0310.homework;

import java.util.Scanner;

/*
 * (문제3) 전화번호 4자리를 서로 중복하지 않고 다양하게 만들기.
① 사용자는 '지역명'와 '국번호'를 입력한다.(이때 지역번호를 배열에 저장시켜두고, 입력된 '지역명'과 같은 '지역번호'를 배열에서 찾아서 '지역번호'를 완성한다.)
 예: 지역명을 입력하세요? 서울
      국번호를 입력하세요? 656
② random() 메소드를 사용하여 전화번호 4자리를 완성한다. 이때 4자리의 전화번호는 서로 중복되지 않아야 한다.
③ 2번에서 만들어진 전화번호 5개를 화면에 출력시켜주고, 그중에서 사용자가 1개를 선택하게 한다.
 예: 1번: 2357,  2번: 5421,  3번 6548,  4번: 8930,  5번: 9231
     앞에 출력된 5개의 번호중 마음에 드는 번호 1개를 선택하세요? 3
④ 사용자의 선택이 끝나면, 최종적으로 선택된 '지역번호-국번호-전화번호'를 출력시켜준다.
   선택하신 전화번호는 02-656-6548 입니다.
   다시 전화번호를 만들어 드릴까요?(Y/N) N
   당신의 전화번호는? 02-656-6548 입니다.
 */
public class Homework3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] area = {"서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종", "경기", "강원", "충북", "충남", " 전북", "전남", "경북", "경남", "제주"}; 
		String[] areaNum = {"02", "051", "053", "032", "062", "042", "052", "044", "031", "033", "043", "041", "063", "061", "054", "055", "064"};
		int[] choiceNum = new int[5];
		int cnt = 1;
		String firstNum = null;
		int middleNum;
		int lastNum;
		String end;
		
		while(true) {
			System.out.println("**전화번호를 만들어드립니다**");
			System.out.print("\n지역명을 입력하세요.(두글자로 입력) >> ");
			String areaSc = scanner.next();
			System.out.print("국번호를 입력하세요. >> ");
			middleNum = scanner.nextInt();
			
			for(int i=0; i<area.length; i++) {
				if(area[i].equals(areaSc)) {
					firstNum = areaNum[i];
				}
			}
			if(firstNum == null) {
				System.out.println("입력하신 지역과 일치하는 지역번호가 없습니다. 다시 입력해주세요.");
				continue;
			}
			
			for(int i=0; i<choiceNum.length; i++) {
				choiceNum[i] = (int)(Math.random()*8999)+1000;
			}
			for(int i=0; i<choiceNum.length; i++) {
				System.out.print(cnt + "번: " + choiceNum[i] + "  ");
				cnt++;
			}
			System.out.print("\n앞에 출력된 5개의 번호 중 마음에 드는 번호 1개를 선택하세요 >> ");
			int choice = scanner.nextInt();
			lastNum = choiceNum[choice-1];
			
			System.out.println("선택하신 전화번호는 " + firstNum + "-" + middleNum + "-" + lastNum  + "입니다.");
			System.out.println();
			
			
			System.out.print("다시 전화번호를 만들어 드릴까요?(y/n) >>");
			end = scanner.next();
			if(end.equalsIgnoreCase("y")) {
				cnt = 1;
				continue;
			}else if(end.equalsIgnoreCase("n")) {
				System.out.println("당신의 전화번호는" + firstNum + "-" + middleNum + "-" + lastNum  + "입니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다. 종료합니다.");
				break;
			}
		}
		scanner.close();
	}
}
