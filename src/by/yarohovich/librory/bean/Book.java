package by.yarohovich.librory.bean;

public class Book extends Entity {
	private String tittle;
	private Author author;
	
	public Book(int id, String tittle) {
		super(id);
		this.tittle = tittle;
	}
	
	public Book(int id) {
		super(id);
		
	}

	

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((tittle == null) ? 0 : tittle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (tittle == null) {
			if (other.tittle != null)
				return false;
		} else if (!tittle.equals(other.tittle))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Book [tittle=" + tittle + ", author=" + author + "]";
	}
	
}
