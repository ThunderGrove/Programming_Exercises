package Chapter3.Exercise24;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a cardnumber you want to pick: ");
        int pickedCard = input.nextInt();
        int rankedCard = pickedCard;

        while(rankedCard>13){
            rankedCard=rankedCard-13;
        }

        System.out.print("The card you picked is ");
        switch(rankedCard){
            case 1:
                System.out.print("ace");
                break;
            case 2:
                System.out.print("2");
                break;
            case 3:
                System.out.print("3");
                break;
            case 4:
                System.out.print("4");
                break;
            case 5:
                System.out.print("5");
                break;
            case 6:
                System.out.print("6");
                break;
            case 7:
                System.out.print("7");
                break;
            case 8:
                System.out.print("8");
                break;
            case 9:
                System.out.print("9");
                break;
            case 10:
                System.out.print("10");
                break;
            case 11:
                System.out.print("jack");
                break;
            case 12:
                System.out.print("queen");
                break;
            case 13:
                System.out.print("king");
                break;
        }

        System.out.print(" of ");

        if(pickedCard>39){
            System.out.println("Spades");
        }else if(pickedCard>26){
            System.out.println("Hearts");
        }else if(pickedCard>13){
            System.out.println("Diamonds");
        }else{
            System.out.println("Clubs");
        }
    }
}