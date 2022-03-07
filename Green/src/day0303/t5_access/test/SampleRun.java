package day0303.t5_access.test;

import day0303.t5_access.exam.Exam1;

public class SampleRun {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println("t1.t1 : " + t1.t1);		//public
		System.out.println("t1.t2 : " + t1.t2);		//default
//		System.out.println("t1.t3 : " + t1.t3); 	//private//t3는 불러올 수 없다.
		t1.meth1();
		t1.meth2();
//		t1.meth3();
		
		Exam1 e1 = new Exam1();
		System.out.println("e1.e1 : " + e1.e1);		//public
//		System.out.println("e1.e2 : " + e1.e2);		//default//디폴트라 다른 패키지라서 안보인다.
//		System.out.println("e1.e3 : " + e1.e3);		//private//프라이빗이라 불러올 수 없다.
		e1.methE1();		//public
//		e1.methE2();		//default
//		e1.methE3();		//private
	}
}
