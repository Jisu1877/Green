package day0222.homework;

/*문제3) 1~100까지의 합을 구하되, 각 10항까지의 결과를 중간중간 출력해 주시오.(출력결과 참조)
1~10 : 55
11~20 : 155
21~30 : 255
31~40 : 355
41~50 : 455
51~60 : 555
61~70 : 655
71~80 : 755
81~90 : 855
91~100 : 955
작업끝...*/
public class Homework0223_3 {
	public static void main(String[] args) {
		int tot = 0;
		
		for(int i=1; i<=100; i++) {						// 시작값이 0이면 =을 빼주고 시작값이 1이면 =을 넣어주면 지정한 숫자만큼 돈다.
			tot = tot + i;
			if(i % 10 == 0) {
				System.out.println(i-9 + "~" +i+ " : " +tot);
				tot=0;
			}
		}
		System.out.println("작업끝...");
	}
}
