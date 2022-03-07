package day0225.t6_exam;
// 1번 방법
public class Ranking {
	public static void main(String[] args) {
		int[] m = {70, 90, 60, 100, 80};
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
