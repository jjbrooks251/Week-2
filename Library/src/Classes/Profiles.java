package Classes;

import java.util.ArrayList;

public class Profiles {

	private ArrayList<Customers> profileList = new ArrayList<Customers>();

	public ArrayList<Customers> getProfileList() {
		return profileList;
	}

	public void setProfileList(ArrayList<Customers> profileList) {
		this.profileList = profileList;
	}

	public void addProfile(Customers name) {
		getProfileList().add(name);
	}

	public void remFromProfile(Customers name) {
		getProfileList().remove(name);
	}

	public void clearProfile() {
		getProfileList().clear();
	}
}
