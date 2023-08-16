package documentmanagement;

public class NewPaper extends Base {
	private String releaseDate;

public NewPaper(String docID, String manuName, String copyNumber, String releaseDate) {
		super(docID, manuName, copyNumber);
		// TODO Auto-generated constructor stub
		this.releaseDate=releaseDate;
	}
public String getReleaseDate() {
	return releaseDate;
}
public void setReleaseDate (String releaseDate) {
	this.releaseDate=releaseDate;
}
@Override
public String toString() {
	return "Book {ID " + docID + " manufacturer name: " + manuName + " number of copies: " + copyNumber
			+ " release date: " + releaseDate + "}";
}


}
