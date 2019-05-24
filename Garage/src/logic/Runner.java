package logic;

import Classes.Boat;
import Classes.Car;
import Classes.Catalogue;
import Classes.Plane;

public class Runner {

	public static void main(String[] args) {

		Plane p1 = new Plane("White", 85, "Boeing", "747", 87.5, 2);
		Boat b1 = new Boat("Blue", 3, "Speed", "beach", 1, "SpongeBob");
		Car c1 = new Car("Red", 5, "Fiat", "Picasso", 4, "yes", 1.6, 5);
		Boat b2 = new Boat("White", 1000, "Cruise", "Liner", 4, "Titanic");

		Catalogue g1 = new Catalogue();

		// g1.getList().add(p1);
		// g1.getList().add(b1);
		// g1.getList().add(c1);
		// g1.getList().add(b2);

		g1.addVehcile(c1);
		g1.addVehcile(p1);
		g1.addVehcile(b1);
		g1.addVehcile(b2);

		System.out.println(g1.getList());

		g1.costVehicle(g1.getList());

		g1.vehicleList("White");

		g1.remVehcile(b1);

		System.out.println(g1.getList());

		g1.emptyVehicle();

		System.out.println(g1.getList());
	}

}
