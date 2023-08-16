package documentmanagement;

import java.util.ArrayList;
import java.util.List;

public class Management {
	List<Base> base;

	public Management() {
		this.base = new ArrayList<>();
	}

	public void addDoc(Base base) {
		this.base.add(base);
	}

	public boolean deleteDoc(String docID) {
		Base doc = this.base.stream().filter(base -> base.getDocID().equals(docID)).findFirst().orElse(null);
		if (doc == null) {
			return false;
		}
		this.base.remove(doc);
		return true;
	}

	public void showInfor() {
		this.base.forEach(base -> System.out.println(base.toString()));
	}

	public void searchByBook() {
		this.base.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
	}

	public void searchByNewPaper() {
		this.base.stream().filter(doc -> doc instanceof NewPaper).forEach(doc -> System.out.println(doc.toString()));
	}

	public void searchByMegazine() {
		this.base.stream().filter(doc -> doc instanceof Megazine).forEach(doc -> System.out.println(doc.toString()));
	}
}
