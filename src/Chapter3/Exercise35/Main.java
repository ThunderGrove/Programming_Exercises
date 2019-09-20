package Chapter3.Exercise35;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if(number%2==1){
            System.out.print(number);
            System.out.println(" is odd");
        }else{
            System.out.print(number);
            System.out.println(" is even");
        }
    }
}