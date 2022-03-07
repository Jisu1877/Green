package day0307.t7_abstractEx1;

public class WangjaBunsik extends Bonsa {

//	public WangjaBunsik(int kimchi, int budae, int bibim, int sundae, int konggi) {
	public WangjaBunsik() {
		super(4500, 5000, 6000, 0, 1000);
	}

	@Override
	public void kimchi() {
		System.out.println("김치찌개 : " + kimchi);
	}

	@Override
	public void budae() {
		System.out.println("부대찌개 : " + budae);		
	}

	@Override
	public void bibim() {
		System.out.println("비빔밥 : " + bibim);		
	}

	@Override
	public void sundae() {
		System.out.println("순대국 : " + sundae);		
	}

	@Override
	public void konggi() {
		System.out.println("공기밥 : " + konggi);
	}

}
