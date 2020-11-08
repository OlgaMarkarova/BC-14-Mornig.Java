package day03_modul02;

class Books2 {
    private String title;
    private String author;
    private String publishingHouse;
    private int numberOfCopiesInStore;
    private int numberOfCopiesSold;
    private int availability;
    private int totalPages;
    private int pagesRead;
    private int leftPages;
    private String series;
    private int yearOfPublishing;
    private int bookmark;

    public Books2(String title, String author, String series, String publishingHouse, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.series = series;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
    }

    void checkStoreAvailability(int numberOfCopies, int numberOfCopiesSold) {
        this.numberOfCopiesInStore = numberOfCopies;
        this.numberOfCopiesSold = numberOfCopiesSold;
        availability = numberOfCopies - numberOfCopiesSold;
        // System.out.println("На складе осталось: " + availability + " копий ");
    }

    void leftToRead(int totalPages, int pagesRead) {
        this.totalPages = totalPages;
        this.pagesRead = pagesRead;
        leftPages = totalPages - pagesRead;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return this.publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getNumberOfCopiesSold() {
        return this.numberOfCopiesSold;
    }

    public void setNumberOfCopiesSold(int numberOfCopiesSold) {
        this.numberOfCopiesSold = numberOfCopiesSold;
    }

    public int getAvailability() {
        return this.availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getSeries() {
        return this.series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getPagesRead() {
        return this.pagesRead;
    }

    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }

    public int getLeftPages() {
        return this.leftPages;
    }

    public void setLeftPages(int leftPages) {
        this.leftPages = leftPages;
    }

    public int getBookmark() {
        return this.bookmark = bookmark;
    }

    public void setBookmark(int newBookmark) {
        this.bookmark = newBookmark;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfCopiesInStore() {
        return this.numberOfCopiesInStore;
    }

    public void setNumberOfCopiesInStore(int availability) {
        this.numberOfCopiesInStore = availability;
    }
}

class BooksTest {
    public static void main(String[] args) {
        Books2 book = new Books2("Евгений Онегин", "Александр Пушкин",
                "Классика", "АСТ", 2010);
        book.checkStoreAvailability(2000, 1990);
        System.out.println(book.getTitle() + " -  " + book.getNumberOfCopiesInStore()
                + " экземпляров в магазине");

        book.setNumberOfCopiesInStore(book.getNumberOfCopiesInStore());
        System.out.println(book.getTitle() + " -  " + book.getNumberOfCopiesSold()
                + " экземпляров в магазине");
        book.leftToRead(316, 200);

        System.out.println("Всего страниц: " + book.getTotalPages());
        System.out.println("Закладка на стр.- " + book.getBookmark());
        book.setBookmark(book.getLeftPages());
        System.out.println("Прочитано: " + book.getPagesRead() + " стр., "
                + " Закладка на " + book.getBookmark() + " стр.");

    }
}
