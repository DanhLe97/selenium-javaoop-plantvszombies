package humanmanagement;

public class Staff extends Person {
	private String career;
public Staff (String name, int old, String gender, String address, String career) {
	super (name,old,gender,address);
	this.career=career;
}
public String getCareer () {
	return career;
}
public void setCareer(String career) {
	this.career=career;
}
@Override
public String toString () {
	return "{Staf : "+name+" age: "+old+" gender: "+gender+" address: "+address+" career: "+career+"}";
			
}
}
