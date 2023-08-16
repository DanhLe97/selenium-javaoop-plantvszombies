package humanmanagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] humanmanagement) {
		Scanner sc = new Scanner(System.in);
		Management managePerson = new Management();
		while (true) {
			System.out.println("Human Resource Management");
			System.out.println("Enter 1: To insert person: ");
			System.out.println("Enter 2: To search person by name: ");
			System.out.println("Enter 3: To show information of person: ");
			System.out.println("Enter 4: To exit ");
			String select = sc.nextLine();
			switch (select) {
			case "1": {
				System.out.println("Enter A: To insert Staff: ");
				System.out.println("Enter B: To insert Worker: ");
				System.out.println("Enter C: To insert Engineer: ");
				String op = sc.nextLine();
				switch (op) {
				case "A": {
					System.out.println("Insert name: ");
					String name = sc.nextLine();
					System.out.println("Insert age: ");
					int old = sc.nextInt();
					System.out.println("Insert gender: ");
					String gender = sc.nextLine();
					System.out.println("Insert address: ");
					String address = sc.nextLine();
					System.out.println("Insert career: ");
					String career = sc.nextLine();
					Staff staff = new Staff(name, old, gender, address, career);
					managePerson.addPerson(staff);
					System.out.println(staff.toString());
					break;
				}
				case "B": {
					System.out.println("Insert name: ");
					String name = sc.nextLine();
					System.out.println("Insert age: ");
					int old = sc.nextInt();
					System.out.println("Insert gender: ");
					String gender = sc.nextLine();
					System.out.println("Insert address: ");
					String address = sc.nextLine();
					System.out.println("Insert level: ");
					int level = sc.nextInt();
					Worker worker = new Worker(name, old, gender, address, level);
					System.out.println(worker.toString());
					break;
				}

				case "C": {
					System.out.println("Insert name: ");
					String name = sc.nextLine();
					System.out.println("Insert age: ");
					int old = sc.nextInt();
					System.out.println("Insert gender: ");
					String gender = sc.nextLine();
					System.out.println("Insert address: ");
					String address = sc.nextLine();
					System.out.println("Insert major: ");
					String major = sc.nextLine();
					Engineer engineer = new Engineer(name, old, gender, address, major);
					System.out.println(engineer.toString());
					break;
				}
				default:
					System.out.println("Invalid");
					break;

				}
				break;
			}
			case "2": {
				System.out.println("Enter a name to search: ");
				String name = sc.nextLine();
				managePerson.searchPersonByName(name).forEach(person -> {
					System.out.println(person.toString());
				});
				break;
			}
			case "3": {
				managePerson.showListInforPerson();
			}
				break;
			case "4": {
				return;
			}
			default:
				System.out.println("Invalid");
				continue;
			}
		}
	}
}
