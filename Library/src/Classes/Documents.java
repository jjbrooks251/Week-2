package Classes;

public abstract class Documents extends Library {

	private String writer;

	public Documents(String location, int itemId, String publisher, double id, int stock, String writer) {
		super(location, itemId, publisher, id, stock);
		this.writer = writer;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

}
