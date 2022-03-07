package day0307.t7_abstractEx1;
//추상클래스
public abstract class Bonsa {
	int kimchi;
	int budae;
	int bibim;
	int sundae;
	int konggi;
	
	public Bonsa(int kimchi, int budae, int bibim, int sundae, int konggi) {
		this.kimchi = kimchi;
		this.budae = budae;
		this.bibim = bibim;
		this.sundae = sundae;
		this.konggi = konggi;
	}
	
	public abstract void kimchi();
	public abstract void budae();
	public abstract void bibim();
	public abstract void sundae();
	public abstract void konggi();
}
