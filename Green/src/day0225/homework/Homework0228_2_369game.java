package day0225.homework;
//1~99 중에서 3,6,9에서 박수를 치는 경우 출력
public class Homework0228_2_369game {
	public static void main(String[] args) {
		
		
		for(int i=1; i<100; i++) {
			if(i % 10 == 3 && i / 10 == 3 || i % 10 == 6 && i / 10 == 6 || i % 10 == 9 && i / 10 == 9) {
				System.out.print("짝짝!\t");
			}else if(i / 10 == 3 && i % 10 == 6 || i / 10 == 3 && i % 10 == 9) {
				System.out.print("짝짝!\t");
			}else if(i / 10 == 6 && i % 10 ==3 ||  i / 10 == 6 && i % 10 == 9) {
				System.out.print("짝짝!\t");
			}else if(i / 10 == 9 && i % 10 == 3 || i / 10 == 9 && i % 10 == 6) {
				System.out.print("짝짝!\t");
			}else if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.print("짝!\t");
			}else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				System.out.print("짝!\t");
			}else {
				System.out.print(i + "\t");
			}
			if(i % 9 == 0) {
				System.out.println();
			}
		}
	}
}
