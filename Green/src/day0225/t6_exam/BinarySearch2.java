package day0225.t6_exam;
// 2분검색법 알고리즘
import java.util.Scanner;

public class BinarySearch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] m = {1,3,5,7,9,11,13,15,17,19};				//이미 데이터가 정렬되엇다고 가정.
		int sp = 0;
		int ep = m.length-1;
		int mp = (sp+ep) / 2;
		int su, cnt=0, sw=1;
		
		System.out.print("찾고자 하는 수를 입력하세요?");
		su = sc.nextInt();
		
		while(true) {
			if(su < m[mp]) {							//중간위치의 값보다 찾고자 하는 값이 더 적을 때
				ep = mp - 1;
				mp = (sp+ep) / 2;
			}
			else if(su > m[mp]) {					//중간위치의 값보다 찾고자 하는 값이 더 클 때
				sp = mp + 1;
				mp = (sp+ep) / 2;
			}else {												//자료를 찾았을때...
				break;
			}
			cnt++;
			if(sp > ep) {
				sw =0;
				break;
			}
		}
		if(sw == 1) {
		System.out.println(cnt+1 +"번째 만에 자료를 찾았습니다.");
		}
		else {
			System.out.println("찾고자 하는 수 "+su+"는 없습니다.");
		}
		sc.close();
	}
}
