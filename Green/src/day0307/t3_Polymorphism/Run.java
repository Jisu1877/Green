package day0307.t3_Polymorphism;

public class Run {
	public static void main(String[] args) {
		
		//상속
		Child1 child1 = new Child1();
		System.out.println(child1.su1);
		System.out.println(child1.su2);
		child1.methodChild1();
		child1.methodParent();
		
		//다형성
		//부모타입으로 형변환시에는 자식객체는 들여다볼 수 없다.
		Parent parent = new Child1();
		System.out.println(parent.su1);
//		System.out.println(parent.su2);	//Child1의 것은 출력시킬 수 없다.
		parent.methodParent();
//		parent.methodChild1();	//Child1의 메소드도 불러올수없다.
		
		
		//부모타입에서 다시 자신객체의 내용들을 처리하고자 한다면 자신객체로 강제 형변환해야 한다.
		//강제형변환을 하려면 반드시 부모타입으로 변환되어 있어야만 가능하다.
		
		//강제타입변환
		Child1 child1_2 = (Child1) parent;
		System.out.println(child1_2.su1);
		System.out.println(child1_2.su2);
		child1_2.methodChild1();
		child1_2.methodParent();
		
//		Child2 child2_2 = (Child2) parent;	//자동타입변환을 한적이 없어서 안된다.
//		System.out.println(child2_2.su1);  //실행시키면 에러난다.(실행에러)
		if(parent instanceof Child2) {
			Child2 child2_2 = (Child2) parent;
			System.out.println(child2_2.su1);
		}
		else {
			System.out.println("Child2는 parent로 형변환후 Child2로 복귀할 수 있습니다.");
		}
	}
}
