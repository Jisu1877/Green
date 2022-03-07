package day0302.t3_method;

public class SumRun2 {
	public static void main(String[] args) {
		Sum sum = new Sum();
//		int[] su = new int[] {1,2,3,4,5};
		int[] su = {1,2,3,4,5};
		int res;
		
		
//		res = sum.add(new int[] {1,2,3,4,5});
		res = sum.add(su);
		System.out.println("res = " + res);
	}
}
