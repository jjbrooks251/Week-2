package Classes;

public abstract class Library {

	private String location;
	private int itemId;
	private String publisher;
	private double id;
	private int Stock;

	public Library(String location, int itemId, String publisher, double id, int stock) {
		this.location = location;
		this.itemId = itemId;
		this.publisher = publisher;
		this.id = id;
		Stock = stock;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}
}
