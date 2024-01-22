package library;

public class Book extends Item {

	private String type;
	private String genre;

	public Book() {
		super();
	}

	public Book(String title, int edition, String section, String type, String genre) {
		super(title, edition, section);
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

}
