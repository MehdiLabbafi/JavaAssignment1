// Pakege chapter 4 

/*
*4.36 (Sides of a Triangle) Write an application that reads three nonzero 
*values entered by the user and determines and prints whether they could represent the sides of a triangle.
*/

import java.util.Scanner;

public class chapter436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of three sides of a triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        if (isValidTriangle(side1, side2, side3)) {
            System.out.println("These values could represent the sides of a triangle.");
        } else {
            System.out.println("These values could not represent the sides of a triangle.");
        }

        scanner.close();
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}
