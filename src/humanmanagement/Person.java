package humanmanagement;

public class Person {
	protected String name;
	protected String address;
	protected int old;
	protected String gender;
	
	public Person (String name, int old, String gender, String address) {
		this.name=name;
		this.old=old;
		this.gender=gender;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name; 
	}
	public int getOld () {
		return old;
	}
	public void setOld (int old) {
		this.old=old;
	}
	public String getGender () {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress (String address) {
		this.address=address;
	}
}
