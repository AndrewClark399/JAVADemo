package library;

public class Staff extends Person {

	private String startDate;
	private int jobRank;
	private boolean firstAider;

	public Staff() {
		super();
	}

	public Staff(String name, int age, String address, String tel, String startDate, int jobRank, boolean firstAider) {
		super(name, age, address, tel);
		setStartDate(startDate);
		setJobRank(jobRank);
		setFirstAider(firstAider);
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public int getJobRank() {
		return jobRank;
	}

	public void setJobRank(int jobRank) {
		this.jobRank = jobRank;
	}

	public boolean isFirstAider() {
		return firstAider;
	}

	public void setFirstAider(boolean firstAider) {
		this.firstAider = firstAider;
	}

	@Override
	public String toString() {
		return "Id:" + getId() + ", Name: " + getName() + ", Age: " + getAge() + ", Address: " + getAddress()
				+ ", Tel: " + getTel() + ", Start Date: " + startDate + ", Job Rank: " + jobRank + ", First Aider: "
				+ firstAider;
	}

}
