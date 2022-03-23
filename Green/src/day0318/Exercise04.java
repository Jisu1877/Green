package day0318;

public class Exercise04 {
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			int random1 = (int)(Math.random()*6)+1;
			int random2 = (int)(Math.random()*6)+1;
			System.out.println("("+random1+","+random2+")");
			int sum = random1 + random2;
			if(sum == 5) {
				System.out.println("주사위의 합이 5가 되어 종료합니다.");
				run = false;
			}
		}
	}
}
