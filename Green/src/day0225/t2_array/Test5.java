package day0225.t2_array;

public class Test5 {
	public static void main(String[] args) {
		int[] mbc = new int[5];
		
		System.out.println("mbc배열의 크기는?" + mbc.length);
		
		int[] kbs = {10, 20, 30, 40, 50, 60};
		System.out.println("kbs배열의 크기는?" + kbs.length);
		
		int[] sbs = new int[6];
		for(int i=0; i<6; i++) {							// 배열의 값을 초기화?
			sbs[i] = (i+1) * 10;
		}
		System.out.println("sbs배열의 크기는?" + sbs.length);
		
		int[] cjb = new int[5];
		for(int i=0; i<5; i++) {
			System.out.println("cjb["+i+"] : " + cjb[i]);
		}
		
		// 기본타임에 초기값을 부여하지 않으면????? error가 발생한다...
//		int atom;
//		System.out.println(atom);
		// 참조타입은 초기값을 지정하지 않아도 기본값이 들어있다.
		int[] atom1 = new int[5];
		System.out.println("atom1[0] : " + atom1[0]);
	}
}
