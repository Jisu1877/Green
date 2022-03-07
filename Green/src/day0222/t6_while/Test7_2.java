package day0222.t6_while;

// 1+1+2+1+2+3+1+2+3+4..........+99+100의 합은?

public class Test7_2 {
	public static void main(String[] args) {
		int i=0, tot=0, Hap=0;
		
		while(i<100) {
			i = i + 1;
			tot = tot + i;
			Hap = Hap + tot;
		}
		System.out.println("합은?" + Hap);
	}
}
