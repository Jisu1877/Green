package day0315_Collection.t3_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

// Iterater : 반복지시자(컨테이너에 담겨있는 값들을 하나씩 차례로 꺼내준다. 향상된 for문과 비슷)
// 주요메소드 : hasNext() - 다음자료가 있으면 true, 없으면 false를 반환.
// 			: next() - 다음자료를 처리(읽어온다.)
public class Test5_Iterater {
	public static void main(String[] args) {
		ArrayList<Integer> vos = new ArrayList<Integer>();
		vos.add(10);
		vos.add(50);
		vos.add(30);
		vos.add(20);
		vos.add(60);
		vos.add(20); // 중복데이터
		vos.add(40);
		vos.add(90);
		vos.add(70); 
		
		
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		int cnt = 0;
		Iterator<Integer> iVos = vos.iterator();
//		System.out.println("iVos :" + iVos); --> iVos 의 주소값이 찍힌다.
		
		while(iVos.hasNext()) {
			int item = iVos.next();
			System.out.println(cnt + "번째 요소 : " + item);
			cnt++;
		}
	}
}
