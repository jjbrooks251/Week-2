package Classes;

public class Doctor extends Staff {

	private String position;
	private int grade;

	public Doctor(String name, int staffID, String position, int grade) {
		super(name, staffID);
		this.position = position;
		this.grade = grade;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Position: " + position + ", Grade: " + grade;
	}

}
