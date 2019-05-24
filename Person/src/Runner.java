
public class Runner {

	public static void main(String[] args) {

		Person name = new Person("Chris", 4, "Student");
		Person name2 = new Person("Ben", 50, "Engineer");
		Person name3 = new Person("Chris", 8, "LumberJack");

		name.Print();
		name2.Print();

		Manager pm1 = new Manager();

		pm1.getPersonList().add(name);
		pm1.getPersonList().add(name2);
		pm1.getPersonList().add(name3);
		System.out.println(pm1.getPersonList().get(0));
		pm1.personList("Chris");

	}

}
