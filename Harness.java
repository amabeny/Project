import java.util.Scanner;
public class Harness

{

public static void main(String[] args) {

    Bookstore myBookstore = new Bookstore();
   


    Scanner sc = new Scanner(System.in);

   // see what the user wants to do
   System.out.println("Please select from the following menu of options, by typing a number:");
   System.out.println("\t 1. Shop through our inventory");
   System.out.println("\t 2. Register a Member");
   System.out.println("\t 3. Become a Premium Member");
   System.out.println("\t 4. Check the members list");
   System.out.println("\t 5. Check the Premium members list");
   System.out.println("\t 6. Check inventory");
   System.out.println("\t 7. Exit");



   int num = sc.nextInt();





   switch (num) {
           case 1:
         System.out.println("Here is a list of our inventory to buy: ");
            myBookstore.displayInventory();
            // Method to buy Book
            myBookstore.buyBook();
            //Method to buy CD
            myBookstore.buyCd();
            // method to buy DVD
            myBookstore.buyDvd();
            System.out.println("Here's everything you want to buy: ");
            myBookstore.completePurchase();
            char choice1 = sc.next().charAt(0);
            System.out.println("To confirm purchase enter Y or N");
           if( choice1 == 'Y') {
            System.out.println("Thank you! have a nice day ");
            int numPurchases = 1 ;
            
        } else if (choice1 == 'N') {
               System.out.println( "Have a nice day, goodbye" );
            }
        
           break;
           case 2:
           //keep track of members
           System.out.println("Do you want to become a member? ");
            System.out.println("Select Y or N");
            char choice = sc.next().charAt(0);
           if( choice == 'Y') {
            System.out.println("Enter your Name ");
            String name = sc.next();
            System.out.println("Thank you " + name + ", You are now a member ");
            myBookstore.addMember();
        } else if (choice == 'N') {
               System.out.println( "Okay Sorry!" );
            }
           
               break;
           
           case 3:
           System.out.println("Do you want to become a Premium Member? ");
           System.out.println("Select Y or N");
           char choice2 = sc.next().charAt(0);
          if( choice2 == 'Y') {
           System.out.println("Enter your Name ");
           String name = sc.next();
           System.out.println("Thank you " + name + ", You are now a Premium member, your new monthly fee wil be $10 ");
           myBookstore.addPMember();
       } else if (choice2 == 'N') {
              System.out.println( "Okay, maybe next time!" );
           }
             
               break;
            case 4:
            
            System.out.println("Heres a list of our regular members and the number of purchases: ");
                myBookstore.showMemberList();
     
                   break;
            case 5:
                   System.out.println("Heres a list of our Premium Members and the number of purchases:  ");
                      myBookstore.showPMemberList();
                       break;
            case 6:
                myBookstore.Compare();


            case 7:
               System.exit(0);
               break;
   
        }
        
    }
}
