package day0225.t6_exam;
// 2분검색법 알고리즘
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] m = {1,2,3,4,5,6,7,8,9,10};				//이미 데이터가 정렬되엇다고 가정.
		int sp = 0;
		int ep = m.length-1;
		int mp = (sp+ep) / 2;
		int su, cnt=0;
		
		System.out.println("찾고자 하는 수를 입력하세요?");
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
		}
		System.out.println(cnt+1 +"번째 만에 자료를 찾았습니다.");
		sc.close();
	}
}
