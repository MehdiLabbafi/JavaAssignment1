// Pakege chapter 4 

/*
*4.40 (World Population Growth) World population has grown considerably
*over the centuries. Continued growth could eventually challenge the limits
*of breathable air, drinkable water, arable cropland and other limited resources.
*There’s evidence that growth has been slowing in recent years and that world population
*could peak some time this century, then start to decline.
*For this exercise, research world population growth issues online. Be sure to investigate
*various viewpoints. Get estimates for the current world population and its growth rate (the percentage by which it’s likely to increase this year). 
*Write a program that calculates world population growth each year for the next 75 years, using
*the simplifying assumption that the current growth rate will stay constant. Print the results
*n a table. The first column should display the year from year 1 to year 75. The second column 
*should display the anticipated world population at the end of that year. The third column should
*display the numerical increase in the world population that would occur that year. Using your results,
*determine the year in which the population would be double what it is today, if this year’s growth rate were to persist.
*/


public class chapter440 {
    public static void main(String[] args) {
        // Constants
        final double CURRENT_POPULATION = 7.9e9; // Current world population
        final double GROWTH_RATE = 1.05; // Current annual growth rate (5%)

        // Variables
        double population = CURRENT_POPULATION;

        // Print table header
        System.out.println("Year\tPopulation\tIncrease");

        // Calculate and print population growth for the next 75 years
        for (int year = 1; year <= 75; year++) {
            double increase = population * (GROWTH_RATE - 1);
            population *= GROWTH_RATE;
            System.out.printf("%d\t%.0f\t\t%.0f%n", year, population, increase);
        }

        // Determine the year when population would be double
        double doublePopulation = CURRENT_POPULATION * 2;
        double futurePopulation = CURRENT_POPULATION;
        int yearDouble = 0;
        while (futurePopulation < doublePopulation) {
            yearDouble++;
            futurePopulation *= GROWTH_RATE;
        }

        System.out.println("\nYear when population would be double: " + yearDouble);
    }
}
