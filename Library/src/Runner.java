
import Classes.Book;
import Classes.Customers;
import Classes.Magazines;
import Classes.StockList;
import Classes.Thesis;

public class Runner {
	public static void main(String[] args) {

		Book b1 = new Book("Shelf", 5435415, "King Fischer", 5646454, 20, "yellow", true, 150, true);
		Magazines m1 = new Magazines("Rack", 45656, "Heat", 5435453, 2, "Red", true, 40, 256);
		Thesis t1 = new Thesis("Draw", 54564864, "Cranfield University", 48647, 1, "Student", "Physics");

		Customers c1 = new Customers(5, "jake");

		StockList s1 = new StockList();

		s1.addToList(b1);
		s1.addToList(m1);
		s1.addToList(t1);

		System.out.println(s1.getLibraryList());

		s1.increase(b1);

		System.out.println(s1.getLibraryList());

		s1.decrease(m1);

		System.out.println(s1.getLibraryList());
	}
}
