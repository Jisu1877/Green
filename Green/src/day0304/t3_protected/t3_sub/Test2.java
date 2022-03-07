package day0304.t3_protected.t3_sub;

import day0304.t3_protected.Test0;

public class Test2 extends Test0{
//public class Test2{
	Test0 t0 = new Test0();
	public int su0;
	public int su4;
	
	
	public int au1 = t0.tu1;
	int au2 = t0.tu1;
	private int au3 = t0.tu1;
	protected int au4 = t0.tu1;
	
	/*-----------------------------*/
	//상속의 효과로 부모 필드,메소드 사용할 수 있다.
	
	public int bu1 = tu1;
	int bu2 = tu1;
	private int bu3 = tu1;
	protected int bu4 = tu1;
	
	int cu1 = tu4;
//	int cu2 = tu2;			//default로 선언되어있어서 다른 패키지라 안된다.
//	int cu3 = tu3;	//private으로 선언되어있어서 안된다.
	int cu4 = tu4; //protected로 선언되어있으면 된다.상속관계.
	
}
