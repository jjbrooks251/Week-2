
public class Bird extends Animal {

	private String beakColour;
	private double wingSpan;
	private String wingColour;

	public String getBeakColour() {
		return beakColour;
	}

	public void setBeakColour(String beakColour) {
		this.beakColour = beakColour;

	}

	public double getWingSpan() {
		return wingSpan;
	}

	public void getWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}

	public String getwingColour() {
		return wingColour;
	}

	public void setEyeColour(String wingColour) {

		this.wingColour = wingColour;
	}

	public Bird(int age, String species, String colour, String beakColour, double wingSpan, String wingColour) {
		super(age, species, colour);
		this.beakColour = beakColour;
		this.wingSpan = wingSpan;
		this.wingColour = wingColour;

	}

}
