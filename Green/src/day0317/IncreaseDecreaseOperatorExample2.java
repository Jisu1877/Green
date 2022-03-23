package day0317;

public class IncreaseDecreaseOperatorExample2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("=============================");
		x++; // 11이 됨.
		++x; // 12가 됨.
		System.out.println("x = " + x); // x = 12
		
		System.out.println("=============================");
		y--; // 9가 됨.
		--y; // 8이 됨.
		System.out.println("y = " + y); // y = 8

		System.out.println("=============================");
		z = x++; // z 에는 12가 대입.
		System.out.println("z = " + z); //z = 12
		System.out.println("x = " + x); //x = 13
		
		System.out.println("=============================");
		z = ++x; //z에 ++이 된 14가 대입
		System.out.println("z = " + z); //z = 14
		System.out.println("x = " + x); //x = 14
		
		System.out.println("=============================");
		z = ++x + y++; // z = 15 + 8 
		System.out.println("z = " + z); //z = 23
		System.out.println("x = " + x); //x = 15
		System.out.println("y = " + y); //y = 9
		
	}
}
