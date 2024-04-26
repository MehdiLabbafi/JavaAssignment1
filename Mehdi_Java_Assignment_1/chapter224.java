// Pakege chapter 2 

/*
*2.24 (Largest and Smallest Integers) Write an application that reads five 
integers and determines and prints the largest and smallest integers in 
he group. Use only the programming techniques you learned in this chapter.
*/

import java.util.Scanner;

public class chapter224 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter five integers
        System.out.println("Enter five integers:");

        // Read the first integer
        int num1 = scanner.nextInt();
        int largest = num1;
        int smallest = num1;

        // Read the remaining integers and determine the largest and smallest
        for (int i = 1; i < 5; i++) {
            int num = scanner.nextInt();
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }

        // Print the largest and smallest integers
        System.out.println("Largest integer: " + largest);
        System.out.println("Smallest integer: " + smallest);

        scanner.close();
    }
}
