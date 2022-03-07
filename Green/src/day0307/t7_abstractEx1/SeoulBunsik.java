package day0307.t7_abstractEx1;

public class SeoulBunsik extends Bonsa {

	public SeoulBunsik() {
		super(5000, 5000, 5000, 4000, 0);
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
