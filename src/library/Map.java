package library;

import java.util.Objects;

public class Map extends Item {

	private String location;
	private String period;

	public Map() {
		super();
	}

	public Map(String title, int edition, String section, boolean available, String location, String period) {
		super(title, edition, section, available);
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

	@Override
	public String retentionPeriod() {
		return "12 Years";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(location, period);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Map other = (Map) obj;
		return Objects.equals(location, other.location) && Objects.equals(period, other.period);
	}

	@Override
	public String toString() {
		return "Id:" + getId() + ", Title: " + getTitle() + ", Edition: " + getEdition() + ", Section: " + getSection()
				+ ", " + "Location: " + location + ", Period: " + period + ", Available: " + isAvailable();
	}

}
