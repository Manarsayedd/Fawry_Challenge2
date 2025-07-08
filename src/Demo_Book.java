public class Demo_Book extends Book {
    public boolean sale() {
        return false;
    }

    public Demo_Book(String ISBN, String title, int year, float price, String author) {
        super(ISBN, title, year, price, author);
    }
}
