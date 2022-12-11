public class DVD extends Product{

    private String category;
    
    
    public DVD(String name, double price, int stock, int ID, String category){
        super(name, price, stock, ID);
        this.category = category;
    }
    
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category= category;
    }
    
    
    }