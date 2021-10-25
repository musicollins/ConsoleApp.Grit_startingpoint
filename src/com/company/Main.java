package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int discountAge = 20;

        // TODO: Print to the Console => How Old Are You?
        System.out.println("How Old Are You?");
        //TODO: Get user input
        int userInput = scanner.nextInt();

        //TODO: Check userInput < 20 ? "Eligible" : "Not Eligible"
        //TODO: Print Message to Console
        CheckDiscountEligibility(discountAge, userInput);


    }

    /*
    private static void CheckDiscountEligibility(int discountAge, int userInput, String name) {
        if(userInput > discountAge){
            System.out.println(name + " Is Not Eligible");
        }
        else
        {
            System.out.println(name + " Is Eligible");
        }
    }*/
    private static void CheckDiscountEligibility(int discountAge, int userInput) {
        if(userInput > discountAge)
        {
            System.out.println(" Is Not Eligible");
        }
        else
        {
            System.out.println(" Is Eligible");
        }
    }


}
