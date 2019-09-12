package Chapter2.Exercise23;
import java.util.Scanner;

public class Main_c2e23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double d = input.nextDouble();
        System.out.print("Enter avg. km per liter: ");
        double e = input.nextDouble();
        System.out.print("Enter the price per liter: ");
        double p = input.nextDouble();

        System.out.print("The cost of driving is ");
        System.out.println((d/e)*p);
    }
}