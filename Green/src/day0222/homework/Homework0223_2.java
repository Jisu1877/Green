package day0222.homework;

/*문제2) 1~100까지의 합을 구하되, 각 10항까지의 결과를 중간중간 출력해 주시오.(출력결과 참조)
1~10 : 55
1~20 : 210
1~30 : 465
1~40 : 820
1~50 : 1275
1~60 : 1830
1~70 : 2485
1~80 : 3240
1~90 : 4095
1~100 : 5050
작업끝...*/
public class Homework0223_2 {
	public static void main(String[] args) {
		int tot = 0;
		
		for(int i=1; i<=100; i++) {						// 시작값이 0이면 =을 빼주고 시작값이 1이면 =을 넣어주면 지정한 숫자만큼 돈다.
			tot = tot + i;
			if(i % 10 == 0) {
				System.out.println("1~"+i+" : " +tot);
			}
		}
		System.out.println("작업끝...");
	}
}
