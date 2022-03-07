package day0303.t6_GetterSetter;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		String name = t1.getName();
		System.out.println("name : " + name);
		int age = t1.getAge();
		System.out.println("age : " + age);
		System.out.println();
		
		t1.setName("김말숙");
		name = t1.getName();
		System.out.println("name : " + name);
		
		t1.setAge(32);
		age = t1.getAge();
		System.out.println("age : " + age);
	}
}
