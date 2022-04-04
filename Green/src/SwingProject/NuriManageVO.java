package SwingProject;

public class NuriManageVO {
	private int mIdx;
	private String mName;
	private String mMid;
	private String mPwd;
	private String mNumber;
	private String mHint;
	private String mHintAns;
	
	
	public int getmIdx() {
		return mIdx;
	}
	public void setmIdx(int mIdx) {
		this.mIdx = mIdx;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmMid() {
		return mMid;
	}
	public void setmMid(String mMid) {
		this.mMid = mMid;
	}
	public String getmPwd() {
		return mPwd;
	}
	public void setmPwd(String mPwd) {
		this.mPwd = mPwd;
	}
	public String getmNumber() {
		return mNumber;
	}
	public void setmNumber(String mNumber) {
		this.mNumber = mNumber;
	}
	public String getmHint() {
		return mHint;
	}
	public void setmHint(String mHint) {
		this.mHint = mHint;
	}
	public String getmHintAns() {
		return mHintAns;
	}
	public void setmHintAns(String mHintAns) {
		this.mHintAns = mHintAns;
	}
	
	@Override
	public String toString() {
		return "NuriManageVO [mIdx=" + mIdx + ", mName=" + mName + ", mMid=" + mMid + ", mPwd=" + mPwd + ", mNumber="
				+ mNumber + ", mHint=" + mHint + ", mHintAns=" + mHintAns + "]";
	}
	
	
}
