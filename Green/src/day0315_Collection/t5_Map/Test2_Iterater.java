package day0315_Collection.t5_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Iterater : 반복지시자(컨테이너에 담겨있는 값들을 하나씩 차례로 꺼내준다. 향상된 for문과 비슷)
// 주요메소드 : hasNext() - 다음자료가 있으면 true, 없으면 false를 반환.
// 			: next() - 다음자료를 처리(읽어온다.)
public class Test2_Iterater {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "가");
		map.put(50, "나");
		map.put(30, "다");
		map.put(20, "라");
		map.put(60, "마");
		map.put(20, "가"); // 중복데이터
		map.put(40, "사");
		map.put(90, "아");
		map.put(70, "자"); 
		
		
		System.out.println("vos크기 : " + map.size());
		System.out.println("vos : " + map);
		System.out.println();
		
		int cnt = 0;
		Iterator<Integer> iVos = map.keySet().iterator();
//		System.out.println("iVos :" + iVos); --> iVos 의 주소값이 찍힌다.
		
		while(iVos.hasNext()) {
			String item = map.get(iVos.next());
			System.out.println(cnt + "번째 요소 : " + item);
			cnt++;
		}
		System.out.println();
		
		System.out.println("키 : " + map.keySet());
		System.out.println("값 : " + map.values());
		
	}
}
