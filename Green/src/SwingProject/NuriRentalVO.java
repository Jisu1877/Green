package SwingProject;

public class NuriRentalVO {
	private int rIdx;
	private int cIdx;
	private int rDate;
	
	public int getrIdx() {
		return rIdx;
	}
	public void setrIdx(int rIdx) {
		this.rIdx = rIdx;
	}
	public int getcIdx() {
		return cIdx;
	}
	public void setcIdx(int cIdx) {
		this.cIdx = cIdx;
	}
	public int getrDate() {
		return rDate;
	}
	public void setrDate(int rDate) {
		this.rDate = rDate;
	}
	@Override
	public String toString() {
		return "RentalVO [rIdx=" + rIdx + ", cIdx=" + cIdx + ", rDate=" + rDate + "]";
	}
	
	
}
