// Pakege chapter 4 

/*
*4.34 (Multiples of 2 with an Infinite Loop) Write an application 
*that keeps displaying in the command window the multiples of the integer 
*2—namely, 2, 4, 8, 16, 32, 64, and so on. Your loop should not terminate 
*(i.e., it should create an infinite loop). What happens when you run this program?
*/

import java.util.Scanner;

public class chapter434 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum multiple of 2 (positive integer): ");
        int maxMultiple = scanner.nextInt();

        for (int number = 2; number <= maxMultiple; number *= 2) {
            System.out.println(number);
        }

        scanner.close();
    }
}
