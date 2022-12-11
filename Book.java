
public class Book extends Product{

    private String author;
    
    
    public Book(String name, double price, int stock, int ID, String author){
        super(name, price, stock, ID);
        this.author = author;
    }
    
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author= author;
    }
    
    
    }