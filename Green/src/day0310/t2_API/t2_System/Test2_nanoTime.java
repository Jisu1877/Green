package day0310.t2_API.t2_System;

public class Test2_nanoTime {
	public static void main(String[] args) {
		int i; 
		long tot=0;
		long stratTime = System.nanoTime(); 	//시스템 시간을 알려준다. 1초를(10의 9승분의 1) 로 쪼갠다. 
		
		for(i=1; i<=10000000; i++) {
			tot += i;
		}
		long endTime = System.nanoTime();
		
		System.out.println("1~"+(i-1)+"까지의 합? " + tot);
		System.out.println("계산에 소모된 시간? " + (endTime - stratTime));	//cpu 성능평가.
	}
}
