package day0315_Collection.t5_Map;

import java.util.HashMap;

// Map자료구조(HashMap객체) : 키(Key)와 값(Value)로 구성되는 자료구조
// 순서자료구조가 아니다.
// 중복 허용??? (값은 중복혀용 된다. key는 중복될 수 없다.)
// key는 숫자/문자 관계없이 구성된다.

// JSON 형식.. key와 value로 되어있음. 비동식 방식 지원.
// NodeJS : 데이버베이스를 사용하지않고.. 처리..
// 예전엔 XML 형식을 많이 사용함.. 하지만 이건 비동식 방식을 지원하지 않음.. 동기식.
public class Test1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("map의 크기 : " + map.size());
		System.out.println();
		
		//삽입('키'와 '값'으로 자료를 넣는다. - 키는 중복 불허, 값은 중복 허용)
		map.put(100, "Java");
		map.put(200, "Java");
		map.put(150, "Database");
		map.put(300, "HTML5");
		map.put(350, "CSS3");
		map.put(400, "Javascript");
		map.put(130, "jQuery");
		map.put(450, "aJax");
		map.put(450, "aJax2");	//키가 같으면 나중에 put된 값이 덮어씌워진다.
		System.out.println("map의 크기 : " + map.size());
		System.out.println("map : " + map);
		System.out.println();
		
		//검색(get)
		String name = map.get(100);
		System.out.println("name : " + name);
		System.out.println();
		
		//삭제(remove)
		map.remove(1000);
		System.out.println("map의 크기 : " + map.size());
		System.out.println("map : " + map);
		System.out.println();
		
		map.remove(100);
		System.out.println("map의 크기 : " + map.size());
		System.out.println("map : " + map);
		System.out.println();
		
		//모두삭제(clear)
		map.clear();
		System.out.println("map의 크기 : " + map.size());
		System.out.println("map : " + map);
		System.out.println();
	}
}
