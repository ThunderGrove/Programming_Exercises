package Chapter2.Exercise2;
import java.util.Scanner;

public class Main_c2e2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the sides and height of the Equilateral triangle:");
        double length = input.nextDouble();
        double area = (Math.sqrt(3)/4)*(length*length);

        System.out.print("The area is ");
        System.out.println(area);
        System.out.print("The volume of the Triangular prism is ");
        System.out.println(area*length);
    }
}