package app.DTO;

public class BookDTO {
	private int BookId;
	private String BookName;
	private int BookPrice;
	private String BookAuthor;
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(int bookPrice) {
		BookPrice = bookPrice;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	

}
