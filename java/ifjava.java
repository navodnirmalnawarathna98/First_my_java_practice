import java.util.Scanner;

public class ifjava{
    public static void main(String args[]){
       
      Scanner myScanner = new Scanner(System.in);
      System.out.print("Enter Option:");
      int opt = myScanner.nextInt();

      if(opt==1){
        System.out.println("ampara Campus");
      }
      else if(opt==2){
        System.out.println("matara Campus");
      }
      else if(opt==3){
        System.out.println("Malabe Campus");
      }
      else if(opt==4){
         System.out.println("kurunagala");
      }


    }
}    