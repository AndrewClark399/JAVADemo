package library;

import java.util.Objects;

public class Book extends Item {

	private String type;
	private String genre;

	public Book() {
		super();
	}

	public Book(String title, int edition, String section, boolean available, String type, String genre) {
		super(title, edition, section, available);
		setType(type);
		setGenre(genre);

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(genre, type);
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
		Book other = (Book) obj;
		return Objects.equals(genre, other.genre) && Objects.equals(type, other.type);
	}

	@Override
	public String retentionPeriod() {
		return "15 Years";
	}

	@Override
	public String toString() {
		return "Id:" + getId() + ", Title: " + getTitle() + ", Edition: " + getEdition() + ", Section: " + getSection()
				+ ", " + "Type: " + type + ", Genre: " + genre + ", Available: " + isAvailable();
	}

}
