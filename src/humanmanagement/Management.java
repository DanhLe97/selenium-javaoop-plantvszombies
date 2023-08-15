package humanmanagement;

import java.util.ArrayList;
import java.util.List;

public class Management {
private List <Person> persons;
public Management () {
	this.persons=new ArrayList<>();
}
public void addPerson (Person person) {
	this.persons.add(person);
}
}
