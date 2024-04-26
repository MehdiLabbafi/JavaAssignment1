// Pakege chapter 5

/*
*5.11 (Find the Smallest Value) Write an application that finds 
*the smallest of several integers. Assume that the first
*value read specifies the number of values to input from the user.
*/


import java.util.Scanner;

public class chapter511 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of values: ");
        int count = input.nextInt();
        
        System.out.print("Enter value 1: ");
        int smallest = input.nextInt();
        
        for (int i = 2; i <= count; i++) {
            System.out.print("Enter value " + i + ": ");
            int value = input.nextInt();
            
            if (value < smallest) {
                smallest = value;
            }
        }
        
        System.out.println("The smallest value is: " + smallest);
        
        input.close();
    }
}
