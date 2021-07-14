import java.util.Scanner;

public class calculation{
    public static void main(String args[]){
        int no=50;
        long value=7000000;
        double sal=4500.55;
        float rate=34.5f;

        int reminder = no%3;
        double contribution = value * 100;
        double area = 22.0/7 * rate*rate;

        System.out.println(reminder);
        System.out.println(contribution);
        System.out.println(area);

    }
}    