package Classes;

public class Plane extends Vehicle {

	private double wingSize;
	private int pilotNo;

	public Plane(String colour, int seatNo, String model, String make, double wingSize, int pilotNo) {
		super(colour, seatNo, model, make);
		this.wingSize = wingSize;
		this.pilotNo = pilotNo;
	}

	public double getWingSize() {
		return wingSize;
	}

	public void setWingSize(double wingSize) {
		this.wingSize = wingSize;
	}

	public int getPilotNo() {
		return pilotNo;
	}

	public void setPilotNo(int pilotNo) {
		this.pilotNo = pilotNo;
	}

	@Override
	public String toString() {
		return getColour() + " " + getSeatNo() + " " + getModel() + " " + getMake() + " " + wingSize + " " + pilotNo
				+ "\n";
	}

}
