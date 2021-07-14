import java.util.Scanner;

public class switchjava{
    public static void main(String args[]){

      Scanner myScanner = new Scanner(System.in);
      System.out.print("Enter Option:");
      int opt = myScanner.nextInt(); 

      switch(opt){
          case 1:  System.out.println("matara Campus");
                    break;
          case 2:  System.out.println("Malabe Campus");
                    break; 
          case 3:  System.out.println("Malabe Campus");
                    break;          
      }


    }
}    