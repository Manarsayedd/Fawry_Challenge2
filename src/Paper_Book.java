public class Paper_Book extends Book{
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;

    public Paper_Book(String ISBN,String title,int year,float price,String author,int quantity)
    {
        super( ISBN, title, year,price,author);
        this.quantity = quantity;
    }
}
