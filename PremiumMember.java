public class PremiumMember {


    private boolean hasPaidDues;

    private String name;
    private int numPurchases;



    public PremiumMember(String name, int numPurchases, boolean hasPaidDues){
      
        this.name = name;
        this.numPurchases = numPurchases;
        this.hasPaidDues = hasPaidDues;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getNumPurchases(){
        return numPurchases;
    }
    public void setNumPurchases(int numPurchases){
        this.numPurchases = numPurchases;
    }
  
    public boolean hasPaidDues(){
        return hasPaidDues;
    }
    public void setPaidDues(boolean hasPaidDues){
        this.hasPaidDues = hasPaidDues;
    }
    public static void addNewPremMember(String name) {
    }
}