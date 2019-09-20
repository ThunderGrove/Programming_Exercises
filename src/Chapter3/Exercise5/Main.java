package Chapter3.Exercise5;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day of the week as number: ");
        int dayOfWeek = input.nextInt();

        if(dayOfWeek==1){
            System.out.println("Today is monday.");
        }else if(dayOfWeek==2){
            System.out.println("Today is tuesday.");
        }else if(dayOfWeek==3){
            System.out.println("Today is wednesday.");
        }else if(dayOfWeek==4){
            System.out.println("Today is thursday.");
        }else if(dayOfWeek==5){
            System.out.println("Today is friday.");
        }else if(dayOfWeek==6){
            System.out.println("Today is saturday.");
        }else if(dayOfWeek==7){
            System.out.println("Today is sunday.");
        }else{
            System.out.println("Today is oh-no-day");
        }
    }
}