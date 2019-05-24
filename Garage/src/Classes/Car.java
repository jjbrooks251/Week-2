package Classes;

public class Car extends Public {

	private Double engSize;
	private int doorNo;

	public Car(String colour, int seatNo, String model, String make, int wheelNo, String indicate, Double engSize,
			int doorNo) {
		super(colour, seatNo, model, make, wheelNo, indicate);
		this.engSize = engSize;
		this.doorNo = doorNo;
	}

	public Double getEngSize() {
		return engSize;
	}

	public void setEngSize(Double engSize) {
		this.engSize = engSize;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	@Override
	public String toString() {
		return getColour() + " " + getSeatNo() + " " + getModel() + " " + getMake() + " " + getWheelNo() + " "
				+ getIndicate() + " " + engSize + " " + doorNo + "\n";
	}

}
