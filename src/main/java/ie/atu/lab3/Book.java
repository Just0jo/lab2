package ie.atu.lab3;
public class Book {

    private String title;
    private String author;

    private String isbn;
    private int published_Year;

    public Book(String title, String author, String isbn, int published_Year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.published_Year = published_Year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getpublished_Year() {
        return published_Year;
    }

    public void setpublished_Year(int published_Year) {
        this.published_Year= published_Year;
    }

}
