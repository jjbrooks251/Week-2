package Classes;

public abstract class Person {

	private String Name;

	public Person(String name) {

		Name = name;

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Name: " + Name + ", ";
	}

}
