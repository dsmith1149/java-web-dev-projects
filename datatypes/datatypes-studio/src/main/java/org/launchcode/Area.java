package org.launchcode;

import java.util.Scanner;

import static studios.areaofacircle.Circle.getArea;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double r = input.nextDouble();
        double area = getArea(r);
        System.out.println("The area of a circle of radius " + r + " is: " + area);

    }
}
