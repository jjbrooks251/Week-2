package Logic;

import Classes.Doctor;
import Classes.Patient;

public class Runner {

	public static void main(String[] args) {

		Doctor d1 = new Doctor("Jack Smith", 001, "Consultant", 6);
		Patient p1 = new Patient("Jane Doe", 001, "Ward 5", true);

		System.out.println(d1);
		System.out.println(p1);

	}

}
