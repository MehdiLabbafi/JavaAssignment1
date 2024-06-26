// Pakege chapter 4 

/*
*4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get.
*One driver has kept track of several trips by recording the miles driven and gallons
*used for each tankful. Develop a Java application that will input the miles driven and
*gallon used for each trip and will calculate and display the miles per gallon obtained for each   gallons used (both as integers) for each trip. The program should calculate and display
*the miles per gallon obtained for each trip and print the combined miles per gallon obtained
*from forfor all trips up to this point. All averaging calculations should produce floating-point results.
*Use class Scanner and sentinel-controlled iteration to obtain the data from the user.
*/

import java.util.Scanner;

public class chapter417 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;
        int trips = 0;

        System.out.println("Enter miles driven and gallons used for each trip (Enter -1 to exit):");

        int miles;
        while ((miles = input.nextInt()) != -1) {
            int gallons = input.nextInt();
            totalMiles += miles;
            totalGallons += gallons;
            double milesPerGallon = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", milesPerGallon);
            trips++;
        }

        if (trips > 0) {
            double combinedMilesPerGallon = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon for all trips: %.2f%n", combinedMilesPerGallon);
        } else {
            System.out.println("No trips recorded.");
        }

        input.close();
    }
}
