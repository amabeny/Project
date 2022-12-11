import java.util.ArrayList;
import java.util.Scanner;

//import java.util.Collections;

public class Bookstore {
    private ArrayList<Product>productInventory = new ArrayList<>();
    public ArrayList<Member> MembersList = new ArrayList<>();
    private ArrayList<PremiumMember>premiumMembersList = new ArrayList<>();
    private ArrayList<Double> cart = new ArrayList<>();
    private String name;


    public Bookstore(){
        Product book1 = new Book("Kill a Mocking Bird", 10, 30, 1, "Harper Lee");
        Product book2 = new Book("Farinheit 451", 11, 30, 2, "Ray Badbury");
        Product book3 = new Book("Purple Hibscus", 12, 30, 3, "Chimamanda Ngozi Adichie ");
        Product CD1 = new CD("Good 4 U", 10, 30, 4, "Olivia Rodrigo");
        Product CD2 = new CD("When We Were Young", 11, 30, 5, "Adele");
        Product CD3 = new CD("Shape of you", 12, 30, 6, "Ed Sherran");
        Product DVD1 = new DVD("Smile", 13, 30, 7, "Horror");
        Product DVD2 = new DVD("The Matrix", 14, 30, 8, "Action");
        Product DVD3 = new DVD("John Wick", 15, 30, 9, "Action");

        productInventory.add(book1);
        productInventory.add(book2);
        productInventory.add(book3);
        productInventory.add(CD1);
        productInventory.add(CD2);
        productInventory.add(CD3);
        productInventory.add(DVD1);
        productInventory.add(DVD2);
        productInventory.add(DVD3);

        
        


           
    Member rmember1 = new Member("Jordan Hartfield", 2);
    Member rmember2 = new Member("Nina Brown", 0);
    Member rmember3 = new Member("Deena Abdul", 1);
    

    MembersList.add(rmember1);
    MembersList.add(rmember2);
    MembersList.add(rmember3);



    PremiumMember pmember1 = new PremiumMember("Kimaya Ken", 5, false);
    PremiumMember pmember2 = new PremiumMember("Cameron Davis", 3, true);
    PremiumMember pmember3 = new PremiumMember("Edward Lopez", 2, true);

    premiumMembersList.add(pmember1);
    premiumMembersList.add(pmember2);
    premiumMembersList.add(pmember3);

   
    }
    /**
     * @param 
     * @param ID 
     * 
     */


public void Compare(){
    for (Product product : productInventory) {
     
        if (product instanceof Product && Product.compareTo(product)) {
            ((Product)product).display();
            int count = 0;
            count++;
            System.out.println("********");
            System.out.println( count + " Our products.");
        }
    }

}


    public void buyBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Do you want to buy a Book? Y or N");
        char buyBook = sc.next().charAt(0);
        if (buyBook == 'Y') {
        int bookID = 0;
      
    
      System.out.println(" Choose a number 1 - 3 ");
      bookID = sc.nextInt();
      while (bookID < 1 || bookID > 3) {
        System.out.println("Oops! Try Again");
        System.out.println("Enter a number 1 - 3");
        bookID = sc.nextInt();
      }
        for(Product product: productInventory){
            if(product.getID() == bookID) {
                    System.out.println("Your choice is: " + ((Book) product).getName());
                    double bookPrice = ((Book) product).getPrice();
                    itemPrice(bookPrice);
                   cart.add(bookPrice);
            }
        }
    
    } else if (buyBook == 'N'){
        System.out.println("Okay!");    
    }
}
    public void buyCd(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Do you want to buy a CD? Y or N");
        char buyCd = sc.next().charAt(0);
        if (buyCd == 'Y') {
        int cdID = 0;
        System.out.println(" Choose a number 4 - 6 ");
             cdID = sc.nextInt();
        while (cdID < 4 || cdID > 6) {
            System.out.println("Oops! Try Again");
            System.out.println("Enter a number 4 - 6");
               cdID = sc.nextInt();
               
             }
        for(Product product: productInventory){
                   if(product.getID() == cdID) {
                           System.out.println("Your choice is: " + ((CD) product).getName());
                           double cdPrice = ((CD) product).getPrice();
                           itemPrice(cdPrice);
                           cart.add(cdPrice);
                   }
                }
            }  
            else if (buyCd == 'N'){
                System.out.println("Okay!");
            }
    }
    public void buyDvd() {
        Scanner sc = new Scanner(System.in);
        int dvdID = 0;
        System.out.println(" Do you want to buy a DVD? Y or N");
        char buyDvd = sc.next().charAt(0);
        if (buyDvd == 'Y') {
        System.out.println(" Choose a number 7 - 9 ");
                dvdID = sc.nextInt();
        while (dvdID < 7 || dvdID > 9) {
            System.out.println("Oops! Try Again");
            System.out.println("Enter a number 7 - 9");
                  dvdID = sc.nextInt();
            }
                  for(Product product: productInventory){
                      if(product.getID() == dvdID) {
                              System.out.println("Your choice is: " + ((DVD) product).getName());
                              Double dvdPrice = ((DVD) product).getPrice();
                            itemPrice(dvdPrice);
                            cart.add(dvdPrice);
                      }
        } 
    }
    else if (buyDvd == 'N'){
        System.out.println("Okay!");
    }
    } 
    // prints out item price and gives sum of cart to buy
     public void completePurchase(){
        System.out.println(cart);
        double sum = 0;
        for(Double d: cart)
            sum += d;
        
       System.out.println("Your total is: $" + sum );
     }

    public void itemPrice(double checkout){
  
     System.out.println("this item is: $" + checkout);
   

     

    }
   
// Shows inventory
    public void displayInventory(){
        for(Product product: productInventory){
            if(product instanceof DVD){
            System.out.println("+ DVD name: " + product.getName() + "|Category name: " + ((DVD) product).getCategory() +
            "|Price: $" + product.getPrice() + "|Product ID: " + product.getID());
            } if(product instanceof Book){
                System.out.println("+ Book name: " + product.getName() + " |Author name: " + ((Book) product).getAuthor() +
                "|Price: $" + product.getPrice() + "|Product ID: " + product.getID());
            }if(product instanceof CD){
                System.out.println("+ CD name: " + product.getName() + " |Artist name: " + ((CD) product).getArtist() +
                "|Price: $" + product.getPrice() + "|Product ID: " + product.getID());
            }
        }
    }




 // Adds a member
public void addMember(){
for (Member rmember: MembersList){
    if(rmember.getName() == name){
        MembersList.add(rmember);
}
}
}public void addPMember(){
for (PremiumMember pmember: premiumMembersList){
        if(pmember.getName() == name){
            premiumMembersList.add(pmember);
    }
}
}


public void showMemberList(){
for (Member rmember: MembersList){
    System.out.println(rmember.getName() + " " + rmember.getNumPurchases());
}
}

public void showPMemberList(){
    for (PremiumMember pmember: premiumMembersList){
        System.out.println(pmember.getName() + " " + pmember.getNumPurchases());
    }
}

    public ArrayList<Product> getProductInventory() {
        return productInventory;
    
    }



    
    public void decrementInventory(int stock){
        stock--;
    }
   
    public void displayMemberStatus(int hasPaidDues){
        

    
    }

    

}