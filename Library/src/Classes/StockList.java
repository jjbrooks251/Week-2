package Classes;

import java.util.ArrayList;

import Interfaces.CheckInable;
import Interfaces.CheckOutable;

public class StockList implements CheckInable, CheckOutable {

	private ArrayList<Library> libraryList = new ArrayList<Library>();

	public ArrayList<Library> getLibraryList() {
		return libraryList;
	}

	public void setLibraryList(ArrayList<Library> libraryList) {
		this.libraryList = libraryList;
	}

	public void addToList(Library name) {
		getLibraryList().add(name);
	}

	public void remFromList(Library name) {
		getLibraryList().remove(name);
	}

	public void clearList() {
		getLibraryList().clear();
	}

	@Override
	public void decrease(Library name) {
		name.setStock(name.getStock() - 1);
	}

	@Override
	public void increase(Library name) {
		name.setStock(name.getStock() + 1);

	}
}
