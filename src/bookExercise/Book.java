package bookExercise;

public class Book {

	// Attributes

	private String title;
	private String author;
	private String genre;
	private String edition;
	private int pageCount;
	private boolean isOpen;

	// Constructor

	public Book(String title, int pageCount, String edition) {
		this.title = title;
		this.pageCount = pageCount;
		this.edition = edition;
	}

	// Methods

	public void open() {
		this.isOpen = true;
	}

	public void closed() {
		this.isOpen = false;
	}

	// getters

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

	public String getEdition() {
		return edition;
	}

	public String getPageCount() {
		return pageCount;
	}

	public boolean getIsOpen() {
		return isOpen;
	}

	// setters

	public void setTitle(String newTitle) {
		this.title = newTitle;
	}

	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}

	public void setGenre(String newGenre) {
		this.genre = newGenre;
	}

	public void setEdition(String newEdition) {
		this.edition = newEdition;
	}

	public void setPageCount(int newPageCount) {
		this.pageCount = newPageCount;
	}

	public void setIsOpen(boolean newIsOpen) {
		this.isOpen = newIsOpen;
	}

}
