import java.util.Scanner;

public class Exercise3{
    public static void main(String args[]){

      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter number one:");
      int  num1 = myScanner.nextInt();

      System.out.print("Enter number two:");
      int  num2 = myScanner.nextInt();

      System.out.print("Enter number three:");
       int num3 = myScanner.nextInt();

       if(num1<=num2 && num1<=num3){
            System.out.println("\n The Smallest number is: "+num1);
        }
        else if(num2<=num1 && num2<=num3){
            System.out.println("\n The Smallest number is: "+num2);
        }
        else{
            System.out.println("\n The Smallest number is: "+num3);
        }
        if(num1>=num2 && num1>=num3){
            System.out.println("\n The Smallest number is: "+num1);
        }
        else if(num2>=num1 && num2>=num3){
            System.out.println("\n The Smallest number is: "+num2);
        }
        else{
            System.out.println("\n The largest number is: "+num3);
        }

    }
}