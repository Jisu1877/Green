package day0224.t2;

public class Test3 {
	public static void main(String[] args) {
		
		int no=0;
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				no++;
				System.out.print(no +".안녕~\t");
			}
			no = 0;
			System.out.println();
		}
	}
}
