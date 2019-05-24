package Classes;

public abstract class Vehicle {

	private String colour;
	private int seatNo;
	private String model;
	private String make;

	public Vehicle(String colour, int seatNo, String model, String make) {
		this.colour = colour;
		this.seatNo = seatNo;
		this.model = model;
		this.make = make;
	}

	public String getColour() {
		return colour;
	}

	public void setCOlour(String colour) {
		this.colour = colour;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

}
