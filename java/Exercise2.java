import java.util.Scanner;

public class Exercise2{
    public static void main(String args[]){
        int length,width,perimeter;

      Scanner myScanner = new Scanner(System.in);
      System.out.print("Enter length:");
       length = myScanner.nextInt();

      System.out.print("Enter width:");
       width = myScanner.nextInt();

      perimeter = length*width;

       System.out.print("perimeter:"+perimeter);

    }
}