package documentmanagement;

public class Book extends Base {
	private String authorName;
	private double pageAmount;

	public Book(String docID, String manuName, String copyNumber, String authorName, double pageAmount) {
		super(docID, manuName, copyNumber);
		this.authorName = authorName;
		this.pageAmount = pageAmount;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPageAmount() {
		return pageAmount;
	}

	public void setPageAmount(double pageAmount) {
		this.pageAmount = pageAmount;
	}

	@Override
	public String toString() {
		return "Book {ID " + docID + " manufacturer name: " + manuName + " number of copies: " + copyNumber
				+ " amount of pages: " + pageAmount + " author name: " + authorName + "}";

	}
}
