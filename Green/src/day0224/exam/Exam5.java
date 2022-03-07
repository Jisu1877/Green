package day0224.exam;


// 4x + 5y = 60 의 해를 구하시오.
public class Exam5 {
	public static void main(String[] args) {
		int res;
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				res = (4 * x) + (5 * y);
				if(res == 60) {
					System.out.println("4x + 5y = 60 : ("+x+","+y+")");
				}
			}
		}
	}
}
