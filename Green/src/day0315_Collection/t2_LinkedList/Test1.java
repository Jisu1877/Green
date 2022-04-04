package day0315_Collection.t2_LinkedList;

import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
//		List<String> vos = new LinkedList<String>();
		LinkedList<String> vos = new LinkedList<String>();
		
		System.out.println("vos의 크기 : " + vos.size()); 	//컬렉션프레임워크에서는 배열의 크기는 .size()로 알 수 있다.
		System.out.println("vos : " + vos);
		System.out.println();
		
		vos.add("홍길동");
		vos.add("김말숙");
		vos.add("이기자");
		vos.add("오하늘");
		vos.add("강감찬");
		
		System.out.println("vos의 크기 : " + vos.size()); 	//컬렉션프레임워크에서는 배열의 크기는 .size()로 알 수 있다.
		System.out.println("vos : " + vos);
		System.out.println();
		
		vos.set(2, "고인돌");		//2번 인덱스 위치에 자료를 '고인돌'로 변경
		System.out.println("vos의 크기 : " + vos.size()); 	
		System.out.println("vos : " + vos);
		System.out.println();
		
		String name = vos.get(2);
		System.out.println("vos의 크기 : " + vos.size()); 	
		System.out.println("vos : " + vos);
		System.out.println("name : " + name);
		System.out.println();
		
		vos.remove(2);
		System.out.println("vos의 크기 : " + vos.size()); 	
		System.out.println("vos : " + vos);
		System.out.println("name : " + name);
		System.out.println();
	}
}
