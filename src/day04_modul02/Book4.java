package day04_modul02;

public class Book4 {
    private static int exemplar = 0;
    private String title;
    private String author;
    private String isbn;
    private int page;
    private int year;

    public Book4(String title, String author, String isbn, int page, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.page = page;
        this.year = year;
    }

    public static int getExemplar() {
        return exemplar;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPage() {
        return page;
    }

    public int getYear() {
        return year;
    }

    public static void setExemplar(int exemplar) {
        Book4.exemplar = exemplar;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book4{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", page=" + page +
                ", year=" + year +
                '}';
    }
}
 class BookTest{

 }


