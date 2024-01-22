package library;

public class Map extends Item {

	private String location;
	private String period;

	public Map() {
		super();
	}

	public Map(String title, int edition, String section, String location, String period) {
		super(title, edition, section);
		setLocation(location);
		setPeriod(period);

	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

}
