package day0303.t6_GetterSetter;

import java.util.Scanner;

public class Test4Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test4 t4 = new Test4("hkd");
		
		//성명체크
		String name = t4.getName();
//		if(name == null) {
//			System.out.print("이름을 등록하세요...");
//			t3.setName(sc.next());
//			name = t3.getName();
//		}
		System.out.println("name : " + name);
		
		
		//나이체크(나이등록은 아이디가 'hkd'만 등록가능)
		System.out.print("아이디를 입력하세요.");
		String mid = sc.next();
		if(mid.equals(t4.getMid())) {
			System.out.print("나이를 입력하세요.");
			t4.setAge(sc.nextInt());
		}
		else {
			System.out.println("본인만 나이를 등록할 수 있습니다.");
		}
		
		int age = 0; 
		if(mid.equals("hkd") || mid.equals("admin")) {
		age = t4.getAge();
		System.out.println("age : " + age);
		}
		else {
			System.out.println("나이는 본인만 조회할 수 있습니다.");
		}
		sc.close();
	}
}
