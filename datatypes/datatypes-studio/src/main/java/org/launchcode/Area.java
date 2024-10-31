package org.launchcode;
import java.util.concurrent.ExecutionException;
import java.util.Scanner;
import static java.lang.Double.isNaN;
import static studios.areaofacircle.Circle.getArea;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double r = input.nextDouble();

        try {
            while (r <= 0 || Double.isNaN(r)) {
                System.out.println("Enter a radius:");
                r = input.nextDouble();
            }
        } catch (NumberFormatException e) {
            System.out.println("Error");
            input.reset();
        } finally {
            double area = getArea(r);
            System.out.println("The area of a circle of radius " + r + " is: " + area);
        input.close();
        }
    }
}
