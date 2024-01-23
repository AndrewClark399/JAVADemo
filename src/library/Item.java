package library;

import java.util.Objects;

public abstract class Item implements Comparable<Item> {

	private static int count;

	private final int id;
	private String title;
	private int edition;
	private String section;
	private boolean available;

	public Item() {
		super();
		this.id = ++count;
	}

	public Item(String title, int edition, String section, boolean available) {
		super();
		this.id = ++count;
		setTitle(title);
		setEdition(edition);
		setSection(section);
		setAvailable(available);

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getId() {
		return id;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public int compareTo(Item i) {
		return id - i.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(available, edition, id, section, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Item other = (Item) obj;
		return available == other.available && edition == other.edition && id == other.id
				&& Objects.equals(section, other.section) && Objects.equals(title, other.title);
	}

	public abstract String retentionPeriod();

	@Override
	public String toString() {
		return "Id:" + getId() + ", Title: " + title + ", Edition: " + edition + ", Section: " + section
				+ ", Available: " + available;
	}

}
