import java.util.Scanner;

public class Input{
    public static void main(String args[]){
        String name;
        int age;
        float salary;

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter Your name:");
        name = myScanner.next();
       

        System.out.print("Enter Your Age:");
        age = myScanner.nextInt();
        

        System.out.print("Enter Your Salary:");
        salary = myScanner.nextFloat();


        System.out.println("Name="+ name);
        System.out.println("Age="+ age);
        System.out.println("Salary="+ salary);


        
    }
}