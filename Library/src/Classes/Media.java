package Classes;

public abstract class Media extends Library {

	private String title;

	public Media(String location, int itemId, String publisher, double id, int stock, String title) {
		super(location, itemId, publisher, id, stock);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
