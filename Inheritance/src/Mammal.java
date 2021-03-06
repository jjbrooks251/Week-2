
public class Mammal extends Animal {

	private String hairColour;
	private Boolean oxygen;

	public String getHairColour() {
		return hairColour;
	}

	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}

	public Boolean getOxygen() {
		return oxygen;
	}

	public void setOxygen(Boolean oxygen) {
		this.oxygen = oxygen;
	}

	public Mammal(int age, String species, String colour, String hairColour, Boolean oxygen) {

		super(age, species, colour);
		this.hairColour = hairColour;
		this.oxygen = oxygen;
	}

}
