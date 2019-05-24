import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {

	private ArrayList<Person> personList = new ArrayList<Person>();

	public void personList(String name) {

		List<Person> s = personList.stream().filter(p -> name.equals(p.getName())).collect(Collectors.toList());
		System.out.println(s);
	}

	public void setPersonList(ArrayList<Person> personList) {
		this.personList = personList;

	}

	public ArrayList<Person> getPersonList() {
		return personList;
	}
}
