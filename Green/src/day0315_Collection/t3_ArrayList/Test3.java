package day0315_Collection.t3_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
   정수를 입력받아서 ArrayList객체에 담은후
   '정렬알고리즘(셀렉션sort)에 의해서 오름차순/내림차순 정렬값을 원본과 함께 출력하시오.
   입력종료는 999, 원본입력후 '1.원본출력, 2.오름차순 정렬출력, 3.내림차순정렬출력'
   ArrayList객체이름을 vos로, 'add()/get()/set()'메소드 사용.
   ArrayList객체의 세부타입(Generic)은 정수형(Integer)로 처리한다.  
*/
public class Test3 {
	public static void main(String[] args) {
		// 선언부
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> vos = new ArrayList<Integer>();
		int cnt = 1;
		
		// 입력처리
		while(true) {
			System.out.print(cnt + ". 수를 입력하세요?(종료:999) ");
			int su = scanner.nextInt();
			if(su == 999) break;
			vos.add(su);
			cnt++;
		}
		
		// 원본출력
		System.out.println("* 원본 자료 *");
		System.out.println("총 개수 : " + vos.size() + "건");
		for(int su : vos) {
			System.out.print(su + " / ");
		}
		System.out.println("\n");
		
		// 오름차순 정렬(셀렉션Sort)
		int temp = 0;
		for(int i=0; i<cnt-1-1; i++) {
			for(int j=i+1; j<cnt-1; j++) {
				if(vos.get(i) > vos.get(j)) {
					temp = vos.get(i);
					vos.set(i, vos.get(j));
					vos.set(j, temp);
				}
			}
		}
				
		// 오름차순 출력
		System.out.println("* 오름차순 정렬 자료 *");
		System.out.println("총 개수 : " + vos.size() + "건");
		for(int su : vos) {
			System.out.print(su + " / ");
		}
		System.out.println("\n");
		
		
		// 내림차순 정렬(셀렉션Sort)
		for(int i=0; i<cnt-1-1; i++) {
			for(int j=i+1; j<cnt-1; j++) {
				if(vos.get(i) < vos.get(j)) {
					temp = vos.get(i); vos.set(i, vos.get(j)); vos.set(j, temp);
				}
			}
		}
		
		// 내림차순 출력
		System.out.println("* 내림차순 정렬 자료 *");
		System.out.println("총 개수 : " + vos.size() + "건");
		for(int su : vos) {
			System.out.print(su + " / ");
		}
		System.out.println("\n");
		
		scanner.close();
	}
}
