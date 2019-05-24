package Classes;

public abstract class General extends Library {

	private String coverCol;
	private Boolean condition;
	private int pageNo;

	public General(String location, int itemId, String publisher, double id, int stock, String coverCol,
			Boolean condition, int pageNo) {
		super(location, itemId, publisher, id, stock);
		this.coverCol = coverCol;
		this.condition = condition;
		this.pageNo = pageNo;
	}

	public String getCoverCol() {
		return coverCol;
	}

	public void setCoverCol(String coverCol) {
		this.coverCol = coverCol;
	}

	public Boolean getCondition() {
		return condition;
	}

	public void setCondition(Boolean condition) {
		this.condition = condition;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

}
