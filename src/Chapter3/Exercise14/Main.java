package Chapter3.Exercise14;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int coin_status = (int)(Math.random()*2);
        Scanner input = new Scanner(System.in);

        System.out.print("Head or tails? 0 for tail and 1 for head ");
        int guess = input.nextInt();

        if(guess<0||guess>1){
            System.out.println("Invalid guess");
        }else{
            if(coin_status==0){
                if(guess==0){
                    System.out.println("Tail - Correct guess");
                }else{
                    System.out.println("Tail - Incorrect guess");
                }
            }else{
                if(guess==1){
                    System.out.println("Head - Correct guess");
                }else{
                    System.out.println("Head - Incorrect guess");
                }
            }
        }
    }
}