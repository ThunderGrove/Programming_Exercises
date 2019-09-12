package Chapter2.Exercise1;
import java.util.Scanner;

public class Main_c2e1{
    public static void main(String[] args){
        double km_per_mile = 7.53248; //Amount of kilometers per danish mile.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles:");
        double miles = input.nextDouble();

        System.out.print(miles);
        System.out.print(" miles is ");
        System.out.print(miles*km_per_mile);
        System.out.println(" kilometers");
    }
}