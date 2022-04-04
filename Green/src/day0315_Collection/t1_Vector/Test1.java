package day0315_Collection.t1_Vector;

import java.util.Vector;

// 리스트 자료형은 순서와 관계있다.
public class Test1 {
	public static void main(String[] args) {
		Vector<String> vos = new Vector<String>();
		
		System.out.println("vos의 용량 : " + vos.capacity()); 	//처음에 만들어지는 초기용량
		System.out.println("vos의 크기 : " + vos.size()); 	//데이터가 들어오는 만큼 사이즈가 늘어남.
		System.out.println("vos : " + vos);
		System.out.println();
		
		vos.add("홍길동");
		vos.add("김말숙");
		vos.add("이기자");
		vos.add("오하늘");
		vos.add("강감찬");
		
		System.out.println("vos의 용량 : " + vos.capacity()); 	
		System.out.println("vos의 크기 : " + vos.size()); 	
		System.out.println("vos : " + vos);
		System.out.println();
		
		vos.add("홍길동2");
		vos.add("김말숙2");
		vos.add("이기자2");
		vos.add("오하늘2");
		vos.add("강감찬2");
		vos.add("강감찬3");
		
		System.out.println("vos의 용량 : " + vos.capacity()); 	//10을 넘어서면 20으로 용량이 늘어난다.
		System.out.println("vos의 크기 : " + vos.size()); 	
		System.out.println("vos : " + vos);
		System.out.println();
		
		vos.set(2, "고인돌");		//2번 인덱스 위치에 자료를 '고인돌'로 변경
		System.out.println("vos의 용량 : " + vos.capacity());
		System.out.println("vos의 크기 : " + vos.size()); 	
		System.out.println("vos : " + vos);
		System.out.println();
		
		String name = vos.get(2);
		System.out.println("vos의 용량 : " + vos.capacity());
		System.out.println("vos의 크기 : " + vos.size()); 	
		System.out.println("vos : " + vos);
		System.out.println("name : " + name);
		System.out.println();
		
		vos.remove(2);
		System.out.println("vos의 용량 : " + vos.capacity());
		System.out.println("vos의 크기 : " + vos.size()); 	
		System.out.println("vos : " + vos);
		System.out.println();
		
		vos.clear();		//가비지 컬렉터가 아직 청소를 안해서 용량이 20으로 남아있다.
		System.out.println("vos의 용량 : " + vos.capacity());
		System.out.println("vos의 크기 : " + vos.size()); 	
		System.out.println("vos : " + vos);
		System.out.println();
	}
}
