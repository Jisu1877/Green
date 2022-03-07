package day0225.t6_exam;

public class SelectionSort2 {
	public static void main(String[] args) {
		//자료 입력
		int[] m = {10, 15, 2, 8, 7, 11};
		int temp;
		
		//출력
		System.out.println("원본 값");
		for(int i=0; i<6; i++) {
			System.out.print(m[i] + "/");
		}
		System.out.println();
		
		//처리
		for(int i=0; i<5; i++) {				
			for(int j=i+1; j<6; j++) {		
				if(m[i] > m[j]) {									
					temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}
		//출력
		System.out.println("정렬된 값");
		for(int i=0; i<6; i++) {
			System.out.print(m[i] + "/");
		}
	}
}
