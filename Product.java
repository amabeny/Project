public abstract class Product {

    private String name;
    private double price;
    private int stock;
    private int ID;
    private static double minPrice;
    private int amount;
    
    
    public Product(String name, double price, int stock, int ID){
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.ID = ID;
      
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price= price;
    }
    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock= stock;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID= ID;
    }
    public double getMinPrice(){
        return minPrice;
    
    }
    public void setMinPrice(double minPrice){
        Product.minPrice = minPrice;
    }
    public double getAmount(){
        return amount;
    
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public static boolean compareTo(Product product){
        if ( product.getPrice() < minPrice) {
            return true;
        } else 
            return false;
    }
    
    
    public void display() {
        System.out.println("Name: " + this.getName());
        System.out.println("ID: " + this.getID() + "\tID: " + this.ID);
        System.out.println("Price: " + this.price);
    }
    }
    