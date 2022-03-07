package day0224.t2;

public class Test5 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			int j=1;								// 밖에 선언하면 안되는 이유?
			while(j<=5) {
				System.out.print("("+i+","+j+")\t");
				j++;
			}
			System.out.println();
		}
	}
}
