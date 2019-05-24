package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catalogue {

	private int price;
	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public void vehicleList(String colour) {

		List<Vehicle> vehicleList2 = vehicleList.stream().filter(p -> colour.equals(p.getColour()))
				.collect(Collectors.toList());
		System.out.println(vehicleList2);
	}

	public ArrayList<Vehicle> getList() {
		return vehicleList;
	}

	public void setList(ArrayList<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public void costVehicle(ArrayList<Vehicle> vehicleList) {

		for (Vehicle v : vehicleList) {
			if (v instanceof Boat) {

				System.out.print("boat price is ");

				price = 10000 + v.getSeatNo() * 80 + ((Boat) v).getPropNo() * 250;

				System.out.println(price);

			} else if (v instanceof Plane) {

				System.out.print("plane price is ");

				price = 10000 + v.getSeatNo() * 80 + ((Plane) v).getPilotNo() * 500;

				System.out.println(price);

			} else if (v instanceof Car) {

				System.out.print("car price is ");

				price = 10000 + v.getSeatNo() * 80 + ((Car) v).getWheelNo() * 50;

				System.out.println(price);

			} else {
				System.out.println("No entry");
			}
		}

	}

	public void addVehcile(Vehicle name) {
		getList().add(name);
	}

	public void remVehcile(Vehicle name) {
		getList().remove(name);
	}

	public void emptyVehicle() {
		getList().clear();

	}

}