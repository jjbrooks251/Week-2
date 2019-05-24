package Classes;

public class Patient extends Person {

	private int id;
	private String ward;
	private Boolean checkedIn;

	public Patient(String name, int id, String ward, Boolean checkedIn) {
		super(name);
		this.id = id;
		this.ward = ward;
		this.checkedIn = checkedIn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public Boolean getCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Patient Id: " + id + ", Ward: " + ward + ", In House: " + checkedIn;
	}

}
