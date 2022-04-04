package SwingProject;

public class NuriBooksVO {
	private int bIdx;
	private int isbn;
	private String bookName;
	private String author;
	private String publish;
	private String category;
	private String bookPosition;
	private String rentalCheck;
	
	public int getbIdx() {
		return bIdx;
	}
	public void setbIdx(int bIdx) {
		this.bIdx = bIdx;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBookPosition() {
		return bookPosition;
	}
	public void setBookPosition(String bookPosition) {
		this.bookPosition = bookPosition;
	}
	public String getRentalCheck() {
		return rentalCheck;
	}
	public void setRentalCheck(String rentalCheck) {
		this.rentalCheck = rentalCheck;
	}
	@Override
	public String toString() {
		return "NuriBooksVO [bIdx=" + bIdx + ", isbn=" + isbn + ", bookName=" + bookName + ", author=" + author
				+ ", publish=" + publish + ", category=" + category + ", bookPosition=" + bookPosition
				+ ", rentalCheck=" + rentalCheck + "]";
	}
	
	
	
	
	
}
