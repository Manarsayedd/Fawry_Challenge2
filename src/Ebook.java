public class Ebook extends Book{
    private String filetype;
    private String mail;
    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public Ebook(String ISBN,String title,int year,float price,String author,String filetype,String mail){
        super( ISBN, title, year,price,author);
        this.filetype = filetype;
        this.mail = mail;
    }


}
