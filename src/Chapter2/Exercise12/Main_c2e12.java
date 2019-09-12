package Chapter2.Exercise12;
import java.util.Scanner;

public class Main_c2e12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration:");
        double v = input.nextDouble();
        double a = input.nextDouble();;

        System.out.print("The minimum runway length for this airplane is ");
        System.out.println((v*v)/(2*a));
    }
}