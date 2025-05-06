import java.util.Scanner;

public class Project
{
  public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
       
              
      System.out.println("***Main Menu***");
      System.out.println("\nPlease select one of the following:");
      System.out.println("\t1. Display my available credit");
      System.out.println("\t2. Add credit to my account");
      System.out.println("\t3. Play the guessing game ");
      System.out.println("\t4. Display my statistics");
      System.out.println("\t5. Save my statistics");
      System.out.println("\t6. To Exit"); 
      
      int choice =input.nextInt();
      //int credit =0;
      switch (choice)
      {
          case 1 -> System.out.println("Display my available credit");
          case 2 -> System.out.println("Add credit to account ");
          case 3 -> System.out.println("Play the guessing game");
          case 4 -> System.out.println("Display my stastistics");        
          case 5 -> System.out.println("Save my statistics");
          case 6 -> System.out.println("To Exit");
              
           
          //System.out.println(" How much ");
              
          
      }    
      
               
  }      

}
