package HTA0402;

/*Event class*/
//private String title;
//private String description;
//private String startDate;
//private String endDate;
//private boolean isClosed;

public class Review1Event {
	private String title;
	private String description;
	private String startDate;	
	private String endDate;
	private boolean isClosed;
	
	// 기본생성자 정의
	public Review1Event() {}

	// 모든 멤버변수를 초기화하는 생성자 정의 
	public Review1Event(String title, String description, String startDate, String endDate, boolean isClosed) {
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isClosed = isClosed;
	}
	
	// getter/setter 메소드 생성
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public boolean isClosed() {
		return isClosed;
	}

	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}
}


