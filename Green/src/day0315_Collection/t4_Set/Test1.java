package day0315_Collection.t4_Set;

import java.util.HashSet;

// Set 자료형 : 집합자료형이다.
// 순서자료구조가 아님, 즉 위치를 지정할 수 없다. 중복이 배제된다.(나중 자료가 덮어쓴다.)
public class Test1 {
	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		
		System.out.println("hash의 크기 : " + hash.size());
		System.out.println();
		
		//자료추가
		hash.add("Java");
		hash.add("Database");
		hash.add("HTML5");
		hash.add("CSS3");
		hash.add("Javascript");
		hash.add("jQuery");
		System.out.println("hash의 크기 : " + hash.size());
//		System.out.println("hash : " + hash.toString()); --> toSring() 은 생략가능하다.
		System.out.println("hash : " + hash.toString());
		System.out.println();
		
		//중보자료 추가?
		hash.add("Java");
		hash.add("Java 8.0");
		System.out.println("hash의 크기 : " + hash.size());
		System.out.println("hash : " + hash);
		System.out.println();

		//지정위치에 자료 추가 or 삭제?? index가 없어서 수행불가.
//		hash.set(3, "홍길동");
//		hash.remove(3);
		hash.remove("Java");	//데이터로는 삭제 가능.
		System.out.println("hash의 크기 : " + hash.size());
		System.out.println("hash : " + hash);
		System.out.println();
		
		//전체 자료 삭제
		hash.clear();
		System.out.println("hash의 크기 : " + hash.size());
		System.out.println("hash : " + hash);
		
	}
}
