package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven:");
        double miles = input.nextDouble();

        System.out.println("How much gas have you consumed in gallons:");
        double gallons = input.nextDouble();

        double milesPerGallon = miles / gallons;
        System.out.println("You are running on" + milesPerGallon + "mpg.");
    }
}
