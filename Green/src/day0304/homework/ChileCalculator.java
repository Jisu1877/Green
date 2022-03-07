package day0304.homework;

public class ChileCalculator extends ParentCalculator {
	double res2;
	
	public void roundingOff(double su3) {
		res2 = Math.round(su3);
		System.out.println(su3 + "의 반올림 값은 " + res2 + "입니다.\n");
	}
	public void root(double su3)  {
		res2 = Math.sqrt(su3);
		System.out.println(su3 + "의 제곱근 값은 " + res2 + "입니다.\n");
	}
	public void exponent(double su3, double su4) {
		res2 = Math.pow(su3, su4);
		System.out.printf("%.1f의 %.1f승은 %.1f입니다.\n\n", su3, su4, res2 );
	}
	public double add(double su1, double su2) {
		super.add(su1, su2);
		System.out.println(su1 + "에서 " + su2 + "만큼 증가하여 " + getRes() + "가 되었습니다.\n");
		return getRes();
	}
	public double sub(double su1, double su2) {
		super.sub(su1,su2);
		System.out.println(su1 + "에서 " +su2 + "만큼 감소하여 " + getRes() + "가 되었습니다.\n");
		return getRes();
	}
	public double mul(double su1, double su2) {
		super.mul(su1, su2);
		System.out.println(su1 + " * " + su2 + " = " + getRes() + "\n");
		return getRes();
	}
	public double div(double su3, double su4) {
		super.div(su3, su4);
		System.out.printf(su3 + " / " + su4 + " = %.2f\n\n", getRes());
		return getRes();
	}
}
