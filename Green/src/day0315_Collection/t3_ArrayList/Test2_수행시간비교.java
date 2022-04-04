package day0315_Collection.t3_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Test2_수행시간비교 {
	public static void main(String[] args) {
//		List<String> vos1 = new Vector<String>();
//		List<String> vos2 = new ArrayList<String>();
//		List<String> vos3 = new LinkedList<String>();
		Vector<String> vos1 = new Vector<String>();
		ArrayList<String> vos2 = new ArrayList<String>();
		LinkedList<String> vos3 = new LinkedList<String>();
		
		int su = 200000;
		long startTime, endTime;
		
		//Vector 수행시간
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) {
			vos1.add(0,"");
		}
		endTime = System.nanoTime();
		System.out.println("Vector의 수행시간? \t" + (endTime - startTime) + "ns");
		System.out.println();
		
		//ArrayList 수행시간
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) {
			vos2.add(0,"");
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList의 수행시간? \t" + (endTime - startTime) + "ns");
		System.out.println();
		
		//LinkedList 수행시간
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) {
			vos3.add(0,"");
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList의 수행시간? \t" + (endTime - startTime) + "ns");
		System.out.println();
		
		//속도비교 별과 : vector 가 제일 느리고, 그다음 ArrayList , LinkedList가 제일 빠르다.
		//안정적인 것 : vector가 제일 안정적. 보통 사용할땐 ArrayList를 사용하고, 데이터의 양이 많을 땐 LinkedList를 사용한다.
	}
}
