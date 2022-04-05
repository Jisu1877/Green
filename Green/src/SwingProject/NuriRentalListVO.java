package SwingProject;

public class NuriRentalListVO {
	private int rLidx;
	private int rIdx;
	private int cIdx;
	private String isbn;
	private String state;
	private String returnDate;
	private String createDate;
	public int getrLidx() {
		return rLidx;
	}
	public void setrLidx(int rLidx) {
		this.rLidx = rLidx;
	}
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "NuriRentalListVO [rLidx=" + rLidx + ", rIdx=" + rIdx + ", cIdx=" + cIdx + ", isbn=" + isbn + ", state="
				+ state + ", returnDate=" + returnDate + ", createDate=" + createDate + "]";
	}
	
	
	
	
}
