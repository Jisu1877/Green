package day0225.t2_array;

public class Test7 {
	public static void main(String[] args) {
		String[] name = {"홍길동", "김말숙", "이기자", "강감찬", "김연아"};
		
//		for(int i=0; i<5; i++) {
		for(int i=0; i<name.length; i++) {				
			System.out.println("성명["+i+"]" + name[i]);
		}		
	}
}
