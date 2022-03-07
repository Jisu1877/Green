package day0225.homework;

import java.util.Scanner;

/*(문제3) 점심식사를 위해 가고자 하는 업소를 미리 배열에 저장시켜두고 아래와 업종을 선택하면 업소를 랜덤하게 출력시켜주는 프로그램을 만드시오.
(배열에 미리 저장시켜둘 항목들은 아래와 같다.
페스트푸드점 : 롯데리아/맥도날드/KFC/버거킹/맘스터치
분식점 : 신전떡볶이/엽기떡볶이/맛이삼삼/김밥천국/분식나라
디저트점 : 메가커피/공차/빽다방/쥬씨/디져트카페)

* 방문할 업종을 선택하세요? 1.페스트푸드점   2.분식점   3.디저트점   4.종료 => 1
선택하신 페스트푸드점은 맘스터치 입니다.

* 방문할 업종을 선택하세요? 1.페스트푸드점   2.분식점   3.디저트점   4.종료 => 2
선택하신 분식점은 맛이삼삼 입니다.

* 방문할 업종을 선택하세요? 1.페스트푸드점   2.분식점   3.디저트점   4.종료 => 3
선택하신 디저트점은 디져트카페 입니다.

* 방문할 업종을 선택하세요? 1.페스트푸드점   2.분식점   3.디저트점   4.종료 => 4

오늘 하루도 즐거운 시간되세요.. 감사합니다.
*/
public class Homework0225_3_random {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] fastfood = {"롯데리아", "맥도날드", "KFC", "버거킹", "맘스터치"};
		String[] bunsic = {"신전떡볶이", "엽기떡볶이", "맛이삼삼", "김밥천국", "분식나라"};
		String[] dessert = {"메가커피", "공차", "빽다방", "쥬씨", "디저트카페"};
		int random = (int)(Math.random()*4)+1;
		int num;
		
		while(true) {
			System.out.print("* 방문할 업종을 선택하세요? 1.페스트푸드점   2.분식점   3.디저트점   4.종료\n=> ");
			num = sc.nextInt();
			if(num == 4) {
				System.out.println("종료됩니다. 오늘 하루도 즐거운 시간되세요.. 감사합니다.");
				break;
			}
			else if (0 > num || num > 3) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
			else {
				switch(num) {
					case 1:
						System.out.println("선택하신 패스트푸드점은 "+fastfood[random]+" 입니다.");
						break;
					case 2:
						System.out.println("선택하신 분식점은 "+bunsic[random]+" 입니다.");
						break;
					case 3:
						System.out.println("선택하신 디저트점은 "+dessert[random]+" 입니다.");
						break;
				}
			}
		}
		sc.close();
	}
}
