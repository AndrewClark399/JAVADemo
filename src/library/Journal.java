package library;

public class Journal extends Item {

	private String lastUpdate;

	public Journal() {
		super();
	}

	public Journal(String title, int edition, String section, String lastUpdate) {
		super(title, edition, section);
		setLastUpdate(lastUpdate);

	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
