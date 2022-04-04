package day0315_Collection.t3_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
정수를 입력받아서 ArrayList 객체에 담은 후 '정렬알고리즘(셀렉션sort)에 의해서 오름차순/내림차순 정렬값을 원본과 함께 출력하시오.
입력종료는 999, 원본입력후 '1.원본출력, 2.오름차순정렬출력, 3.내림차순정렬출력'
ArrayList객체이름을 vos로, 'add()/get()/set()'메소드 사용.
ArrayList객체의 세부타입(Generic)은 정수형(Integer)로 처리한다.
*/
public class Test3_js {
	public static void main(String[] args) {
		//선언부
		ArrayList<Integer> vos = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		boolean run = true;
		
		//입력처리
		while(run) {
			System.out.print("정수를 입력하세요(입력종료는 999)");
			vos.add(scanner.nextInt());
			if(vos.get(cnt) == 999) {
				run = false;
			}else {
				cnt++;
				continue;
			}
		}
		
		//원본출력
		vos.remove(vos.size() -1 );
		System.out.println("총 개수 : "  + vos.size());
		System.out.println("입력한 정수(원본) : " + vos);

		//오름차순정렬
		
		int temp;
		for(int i=0; i<cnt-1; i++) {
			for(int j=i+1; j<cnt; j++) {
				if(vos.get(i) > vos.get(j)) {
					temp = vos.get(i);
					vos.set(i, vos.get(j));
					vos.set(j, temp);
				}
			}
		}
		//오름차순출력
		System.out.println("입력한 정수(오름차순) : " + vos);
		
		//내림차순정렬
		for(int i=0; i<cnt-1; i++) {
			for(int j=i+1; j<cnt; j++) {
				if(vos.get(i) < vos.get(j)) {
					temp = vos.get(i);
					vos.set(i, vos.get(j));
					vos.set(j, temp);
				}
			}
		}
		
		//내림차순출력
		System.out.println("입력한 정수(내림차순) : " + vos);
		
		scanner.close();
	}
}
