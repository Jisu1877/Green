package day0224.t4_random;

// 두개의 주사위를 던져서 주사위 눈의 합이 5가 되면 종료하시오.
// 몇번만에 주사위의 합이 5가 나왔는지도 함께 출력하시오.
public class Test3 {
	public static void main(String[] args) {
		int su1, su2, res;
		int i = 0;
		
		System.out.println("두개 주사위 합이 5가 되면 종료합니다.");
		
		while(true) {
			su1 = (int)(Math.random()*6)+1;
			su2 = (int)(Math.random()*6)+1;
			res = su1 + su2;
			
			System.out.println("("+su1+","+su2+")=" + res);
			i++;									// i=0; 하려면 break 전에 넣어줘야함.
			if(res == 5) break;
//			i++;									// i=1; 하려면 break 이후에 넣어줘야함.
			
		}
		System.out.println(i +"번만에 두개의 주사위 합이 5가 되었습니다.\n수고하셨습니다.");
	}
}
