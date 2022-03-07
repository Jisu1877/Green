package day0222.t6_while;

// 1-2+3-4+5-6+7-8+9-10 = ?

public class Test7_3 {
	public static void main(String[] args) {
		int i=0, tot=0, s=-1;
		
		while(i<10) {
			i = i + 1;
			s = s*(-1);
			tot = tot + (i*s);
		}
		System.out.println("합은?" + tot);
	}
}
