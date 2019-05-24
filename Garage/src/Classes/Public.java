package Classes;

public abstract class Public extends Vehicle {

	private int wheelNo;
	private String indicate;

	public Public(String colour, int seatNo, String model, String make, int wheelNo, String indicate) {
		super(colour, seatNo, model, make);
		this.wheelNo = wheelNo;
		this.indicate = indicate;
	}

	public int getWheelNo() {
		return wheelNo;
	}

	public void setWheelNo(int wheelNo) {
		this.wheelNo = wheelNo;
	}

	public String getIndicate() {
		return indicate;
	}

	public void setIndicate(String indicate) {
		this.indicate = indicate;
	}
}
