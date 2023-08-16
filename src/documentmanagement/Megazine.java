package documentmanagement;

public class Megazine extends Base {
	private double releaseID;
	private int releaseMonth;

	public Megazine(String docID, String manuName, String copyNumber, double releaseID, int releaseMonth) {
		super(docID, manuName, copyNumber);
		this.releaseID = releaseID;
		this.releaseMonth = releaseMonth;

		// TODO Auto-generated constructor stub
	}

	public double getReleaseID() {
		return releaseID;
	}

	public void setReleaseID(double releaseID) {
		this.releaseID = releaseID;
	}

	public int getReleaseMonth() {
		return releaseMonth;
	}

	public void setReleaseMonth(int releaseMonth) {
		this.releaseMonth = releaseMonth;
	}

	@Override
	public String toString() {
		return "Book {ID " + docID + " manufacturer name: " + manuName + " number of copies: " + copyNumber
				+ " release ID: " + releaseID + " release month: " + releaseMonth + "}";

	}
}
