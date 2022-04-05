package SwingProject;

public class NuriCustomerVO {
	private int cIdx;
	private String cName;
	private String cMid;
	private String cPwd;
	private String cNumber;
	private String cAddress;
	private String rentalOkDate;
	private int bookcnt;
	private String regularCustomer;
	private String withDraw;
	private String createDate;
	
	
	public int getcIdx() {
		return cIdx;
	}
	public void setcIdx(int cIdx) {
		this.cIdx = cIdx;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcMid() {
		return cMid;
	}
	public void setcMid(String cMid) {
		this.cMid = cMid;
	}
	public String getcPwd() {
		return cPwd;
	}
	public void setcPwd(String cPwd) {
		this.cPwd = cPwd;
	}
	public String getcNumber() {
		return cNumber;
	}
	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getRentalOkDate() {
		return rentalOkDate;
	}
	public void setRentalOkDate(String rentalOkDate) {
		this.rentalOkDate = rentalOkDate;
	}
	public int getBookcnt() {
		return bookcnt;
	}
	public void setBookcnt(int bookcnt) {
		this.bookcnt = bookcnt;
	}
	public String getRegularCustomer() {
		return regularCustomer;
	}
	public void setRegularCustomer(String regularCustomer) {
		this.regularCustomer = regularCustomer;
	}
	public String getWithDraw() {
		return withDraw;
	}
	public void setWithDraw(String withDraw) {
		this.withDraw = withDraw;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "NuriCustomerVO [cIdx=" + cIdx + ", cName=" + cName + ", cMid=" + cMid + ", cPwd=" + cPwd + ", cNumber="
				+ cNumber + ", cAddress=" + cAddress + ", rentalOkDate=" + rentalOkDate + ", bookcnt=" + bookcnt
				+ ", regularCustomer=" + regularCustomer + ", withDraw=" + withDraw + ", createDate=" + createDate
				+ "]";
	}
	
	
	
}
