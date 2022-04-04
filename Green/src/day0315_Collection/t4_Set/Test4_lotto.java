package day0315_Collection.t4_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

//로또 번호 제조기
public class Test4_lotto {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		System.out.println("이번주 행운의 번호는?");
		delay(10);
		System.out.println();
		
		int su;
		while(true) {
			su = (int)(Math.random()*45) +1;
			lotto.add(su);
			if(lotto.size() == 6) break;
		}
		System.out.println("금주의 로또번호는? " + lotto);
		System.out.println();
		
		ArrayList<Integer> vos = new ArrayList<Integer>(); //List형식의 자료를 담아두기 위한 객체

		Iterator<Integer> iLotto = lotto.iterator();
		while(iLotto.hasNext()) {
			vos.add(iLotto.next());
		}
		Collections.sort(vos);
		delay(3);
		System.out.println();
		System.out.println("정렬된 로또번호는?" + vos);
		
	}

	private static void delay(int delay) {
//		Thread.sleep(1000);  -> 1초동안 딜레이.
		try {
			for(int i=0; i<delay; i++) {
				Thread.sleep(500);			//delay(10)하면 5초.. Thread.sleep(500);	가 0.5초를 의미하기 때문에..
				System.out.print(">");
			}
		} catch (InterruptedException e) {}
	}
}
