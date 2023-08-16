package humanmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Management {
private List <Person> persons;
public Management () {
	this.persons=new ArrayList<>();
}
public void addPerson (Person person) {
	this.persons.add(person);
}
public List<Person> searchPersonByName (String name){
	return this.persons.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
}
public void showListInforPerson () {
	this.persons.forEach(o -> System.out.println(o.toString()));
}
}
