package day0225.t6_exam;
// 2번 방법으로 동순위 처리 연습
public class Ranking4 {
	public static void main(String[] args) {
		int[] m = {70, 90, 60, 100, 80, 90};
		int[] rank = new int[m.length];
		
		for(int i=0; i<m.length; i++) {
			rank[i] = 1;
		}
		for(int i=0; i<m.length; i++) {
			for(int j=i+1; j<m.length; j++) {				//하나씩 진격해서 비교하기 위해 j=i+1로 한다..(다시 한번 생각해보자..)
				if(m[i] < m[j]) {
					rank[i]++;
				}
				else {
					rank[j]++;
				}
			}
		}
		for(int i=0; i<m.length; i++) {
			System.out.print("m["+i+"] = " + m[i] + " ,\t");
			System.out.println("rank["+i+"] = " + rank[i]);
		}
	}
}
