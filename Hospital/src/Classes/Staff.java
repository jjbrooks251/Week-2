package Classes;

public abstract class Staff extends Person {

	private int staffID;

	public Staff(String name, int staffID) {
		super(name);
		this.staffID = staffID;
	}

	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Staff Id: " + staffID + ", ";
	}

}
