package Classes;

public class Boat extends Vehicle {

	private int propNo;
	private String name;

	public Boat(String colour, int seatNo, String model, String make, int propNo, String name) {
		super(colour, seatNo, model, make);
		this.propNo = propNo;
		this.name = name;
	}

	public int getPropNo() {
		return propNo;
	}

	public void setPropNo(int propNo) {
		this.propNo = propNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getColour() + " " + getSeatNo() + " " + getModel() + " " + getMake() + " " + propNo + " " + name + "\n";
	}

}
