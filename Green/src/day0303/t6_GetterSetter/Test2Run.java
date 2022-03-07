package day0303.t6_GetterSetter;

import java.util.Scanner;

public class Test2Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test2 t2 = new Test2();
		
		String name = t2.getName();
		if(name == null) {
			System.out.print("이름을 등록하세요...");
//			name = sc.next();
//			t2.setName(name);
			t2.setName(sc.next());
			name = t2.getName();
		}
		System.out.println("name : " + name);
		
		sc.close();
	}
}
