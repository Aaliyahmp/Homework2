package com.tts;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        System.out.println("Hello World");
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String firstName = input.nextLine();
        System.out.printf("Hello %s\n", firstName);



      System.out.println("Would you like to continue? Y or N");
        String answerHere = input.nextLine();
        boolean flag = answerHere.equalsIgnoreCase("y");

       boolean approved = answerHere.equals("Y") || answerHere.equals("y");
if (approved){
    System.out.println("Do you have a red car?");
    String carColor = input.nextLine();
        }


        System.out.println("What is th name of your favorite pet?");
       String favPet = input.nextLine();
       System.out.println("What is the age of your favorite pet?");
       String petAge = input.nextLine();
       System.out.println("What is your lucky number?");
       String luckyNumber = input.nextLine();
       System.out.println("Do they have a favorite quarterback?  If so what is their jersey number?");
        String FavQT = input.nextLine();
       System.out.println("What is two-digit model year of their car?");
        String carModel = input.nextLine();
        System.out.println("What is the first name of the their favorite actor or actress? ");
        String favActor = input.nextLine();
        System.out.println("Enter a random number between 1 and 50. ");
        String RanNum = input.nextLine();

    }
}
