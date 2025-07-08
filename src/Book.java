public class Book {
    private String title;
    private String ISBN;
    private int year_publishing;
    private float price;
    private String author;

    public String getauthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public float getPrice() {
        return price;
    }

    public int getYear_publishing() {
        return year_publishing;
    }

    public void setAuthor(String name) {
        this.author = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setYear_publishing(int year_publishing) {
        this.year_publishing = year_publishing;
    }
    public boolean sale(){
        return true;
    }
    public Book(String ISBN,String title,int year,float price,String author){
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.year_publishing = year;
        this.price = price;

    }
}
