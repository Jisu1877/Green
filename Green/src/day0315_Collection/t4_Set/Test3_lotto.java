package day0315_Collection.t4_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

//로또 번호 제조기
public class Test3_lotto {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		
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
		System.out.println("정렬된 로또번호는?" + vos);
		
	}
}
