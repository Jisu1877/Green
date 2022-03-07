package day0224.homework;

/*문제4) 2g, 3g, 5g의 추가 각각 5개씩 준비되어 있다.

이 3개의 추를 조합하여, 무게가 30g ~ 35g 의 값이 될때의 각각의 추의 무게를 출력하는 프로그램을 만드시오?(마지막에 몇개가 있는지도 함께 개수를 출력하시오)

예) 2g짜리 5개 + 3g짜리 5개 + 5g짜리 1개 = 30g (답이 될수있다)*/
public class Homework0224_4 {
	public static void main(String[] args) {
		int x, y, z, res, cnt=0;
		System.out.println("2g과 3g과 5g 각 5개로 30g~35g을 만들 수 있는 경우의 수는 다음과 같습니다.");
		for(x=0; x<=5; x++) {
			for(y=0; y<=5; y++) {
				for(z=0; z<=5; z++) {
					res = 2*x + 3*y + 5*z;
					if(30 <= res && res <=35) {
						System.out.printf("2g짜리 %d개, + 3g짜리 %d개, 5g짜리 %d개 = %dg\n", x, y, z, res);
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt + "개의 경우의 수로 30g~35g을 만들 수 있습니다.\n수고하셨습니다.");
	}
}
