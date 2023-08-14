package humanmanagement;

public class Engineer extends Person {
	private String major;

	public Engineer(String name, int old, String gender, String address, String major) {
		super(name, old, gender, address);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Worker{" + name + " Major: " + major + " Age: " + old + " Gender: " + gender + " Address: " + address
				+ "}";

	}
}
