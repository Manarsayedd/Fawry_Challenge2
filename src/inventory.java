import java.util.ArrayList;
import java.util.List;
import java.time.Year;
import java.util.Iterator;
import java.lang.Exception;
public class inventory {
    private List<Book> books;
    public inventory(){
        books = new ArrayList<>();
    }
     public void Addbook(Book b){
        books.add(b);

    }
    public List removeBook(int maxyear)
    {
        Iterator<Book>iterator = books.iterator();
        List<Book> remove = new ArrayList<>();
        int currentdate = Year.now().getValue();
        while(iterator.hasNext()){
            Book b = iterator.next();

            if((currentdate - b.getYear_publishing()) > maxyear){
                remove.add(b);
                iterator.remove();
            }
        }
        return remove;
    }
    public float buybook(String ISBN,int quantity,String mail,String address) throws Exception
    {
        for(Book b : books)
        {
            if(b.getISBN().equals(ISBN)){
                if(!b.sale()){
                    throw new Exception("Book is not for sale");
                }
                if(b instanceof Paper_Book)
                {
                    Paper_Book p = (Paper_Book) b;
                    if(p.getQuantity() < quantity)
                        throw new Exception("no enough books");
                    p.setQuantity(p.getQuantity()-quantity);
                    System.out.println("Quantum book store: Shipping paper book to " + address);
                    return p.getPrice()*quantity;
                } else if (b instanceof Ebook) {
                    Ebook e = (Ebook) b;
                    System.out.println("Quantum book store: Sending eBook to " + mail);
                    return e.getPrice();

                }
            }

        }
        throw new Exception("book not found");
    }
}
