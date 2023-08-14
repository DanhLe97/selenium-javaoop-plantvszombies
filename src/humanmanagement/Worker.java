package humanmanagement;

public class Worker extends Person {
	private int level;

	public Worker(String name, int old, String gender, String address, int level) {
		super(name, old, gender, address);
		this.level = level;
		// TODO Auto-generated constructor stub
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Worker{" + name + " level: " + level + " Age: " + old + " Gender: " + gender + " Address: " + address
				+ "}";

	}
}
