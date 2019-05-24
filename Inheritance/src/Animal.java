
public class Animal {

	private int age;
	private String species;
	private String colour;

	public int getage() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Animal(int age, String species, String colour) {
		this.age = age;
		this.species = species;
		this.colour = colour;
	}
}
