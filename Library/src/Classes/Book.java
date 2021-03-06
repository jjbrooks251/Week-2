package Classes;

public class Book extends General {

	private Boolean coverType;

	public Book(String location, int itemId, String publisher, double id, int stock, String coverCol, Boolean condition,
			int pageNo, Boolean coverType) {
		super(location, itemId, publisher, id, stock, coverCol, condition, pageNo);
		this.coverType = coverType;
	}

	public Boolean getCoverType() {
		return coverType;
	}

	public void setCoverType(Boolean coverType) {
		this.coverType = coverType;
	}

	@Override
	public String toString() {
		return getLocation() + ", " + getItemId() + ", " + getPublisher() + ", " + getId() + ", Stock: " + getStock()
				+ ", " + getCoverCol() + ", " + getCondition() + ", " + getPageNo() + ", " + coverType + "\n";
	}

}
