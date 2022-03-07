package day0224.t4_random;

// 두개의 주사위를 던져서 주사위 눈의 합이 5가 되면 종료하시오.
public class Test2 {
	public static void main(String[] args) {
		int su1, su2, res;
		
		System.out.println("두개 주사위 합이 5가 되면 종료합니다.");
		
		while(true) {
			su1 = (int)(Math.random()*6)+1;
			su2 = (int)(Math.random()*6)+1;
			res = su1 + su2;
			System.out.println("("+su1+","+su2+")=" + res);
			if(res == 5) break;
		}
		System.out.println("수고하셨습니다.");
	}
}
