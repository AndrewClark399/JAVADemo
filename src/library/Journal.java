package library;

import java.util.Objects;

public class Journal extends Item {

	private String lastUpdate;

	public Journal() {
		super();
	}

	public Journal(String title, int edition, String section, boolean available, String lastUpdate) {
		super(title, edition, section, available);
		setLastUpdate(lastUpdate);

	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String retentionPeriod() {
		return "8 Years";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(lastUpdate);
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
		Journal other = (Journal) obj;
		return Objects.equals(lastUpdate, other.lastUpdate);
	}

	@Override
	public String toString() {
		return "Id:" + getId() + ", Title: " + getTitle() + ", Edition: " + getEdition() + ", Section: " + getSection()
				+ ", " + "Most Recent Update: " + lastUpdate + ", Available: " + isAvailable();
	}

}
