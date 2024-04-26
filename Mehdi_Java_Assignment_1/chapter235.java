// Pakege chapter 2 

/*
*2.35 (Car-Pool Savings Calculator) Research several car-pooling websites. 
*Create an application that calculates your daily driving cost, so that you 
*can estimate how much money could be saved by car pooling, which also has
*other advantages such as reducing carbon emissions and reducing traffic congestion.
*The application should input the following information and display 
 the user’s cost per day of driving to work:

*Total miles driven per day.
*Cost per gallon of gasoline.
*Average miles per gallon.
*Parking fees per day.
*Tolls per day.
*/

import java.util.Scanner;

public class chapter235 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the required information
        System.out.println("Enter the total miles driven per day:");
        double totalMilesDriven = scanner.nextDouble();

        System.out.println("Enter the cost per gallon of gasoline:");
        double costPerGallon = scanner.nextDouble();

        System.out.println("Enter the average miles per gallon:");
        double averageMilesPerGallon = scanner.nextDouble();

        System.out.println("Enter the parking fees per day:");
        double parkingFeesPerDay = scanner.nextDouble();

        System.out.println("Enter the tolls per day:");
        double tollsPerDay = scanner.nextDouble();

        // Calculate the daily driving cost
        double gallonsUsedPerDay = totalMilesDriven / averageMilesPerGallon;
        double fuelCostPerDay = gallonsUsedPerDay * costPerGallon;
        double totalCostPerDay = fuelCostPerDay + parkingFeesPerDay + tollsPerDay;

        // Display the user's cost per day of driving to work
        System.out.println("Your cost per day of driving to work is: $" + totalCostPerDay);

        // Close the Scanner
        scanner.close();
    }
}
