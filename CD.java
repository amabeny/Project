public class CD extends Product{

    private String artist;
    
    
    public CD(String name, double price, int stock, int ID, String artist){
        super(name, price, stock, ID);
        this.artist = artist;
    }
    
    public String getArtist(){
        return artist;
    }
    public void setAritst(String artist){
        this.artist= artist;
    }
    
    
    }