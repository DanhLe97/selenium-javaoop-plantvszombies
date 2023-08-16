package documentmanagement;

public class Base {
	protected String docID;
	protected String manuName;
	protected String copyNumber;

	public Base(String docID, String manuName, String copyNumber) {
		this.docID = docID;
		this.manuName = manuName;
		this.copyNumber = copyNumber;
	}

	public String getDocID() {
		return docID;
	}

	public void setDocID(String docID) {
		this.docID = docID;
	}

	public String getManuName() {
		return manuName;
	}

	public void setManuName(String manuName) {
		this.manuName = manuName;
	}

	public String getCopyNumber() {
		return copyNumber;
	}

	public void setCopyNumber(String copyNumber) {
		this.copyNumber = copyNumber;
	}
}
