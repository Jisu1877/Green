package day0225.t6_exam;
// 동순위 처리 - 다 비교하는 1번방법이기 때문에 동순위처리가 된다.
public class Ranking3 {
	public static void main(String[] args) {
		int[] m = {70, 90, 60, 100, 80, 90};
		int[] rank = new int[m.length];
		
		for(int i=0; i<m.length; i++) {
			rank[i] = 1;
		}
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m.length; j++) {
				if(m[i] < m[j]) {
					rank[i]++;
				}
			}
		}
		for(int i=0; i<m.length; i++) {
			System.out.print("m["+i+"] = " + m[i] + " ,\t");
			System.out.println("rank["+i+"] = " + rank[i]);
		}
	}
}
