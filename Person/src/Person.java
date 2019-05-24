
public class Person {

	private String Firstname;
	private int age;
	private String Occupation;

	public Person(String word) {

		this.Firstname = word;

	}

	public Person(String first, int num, String job) {

		this.Firstname = first;
		this.age = num;
		this.Occupation = job;
	}

	public void Print() {

		System.out.println(Firstname + ", " + age + ", " + Occupation);

	}

	public String getName() {
		return Firstname;
	}

	public void setName(String Firstname) {
		this.Firstname = Firstname;
	}

	public String getJob() {
		return Occupation;
	}

	public void setJob(String Occupation) {
		this.Occupation = Occupation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return Firstname + ", " + age + ", " + Occupation;
	}

}
