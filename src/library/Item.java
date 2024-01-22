package library;

public class Item {

	private String title;
	private int edition;
	private String section;

	public Item() {
		super();
	}

	public Item(String title, int edition, String section) {
		super();
		setTitle(title);
		setEdition(edition);
		setSection(section);

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

}
