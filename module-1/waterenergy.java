/*
 * Jordyn Rylander
 * Module 1.3
 * Calculates the energy needed to heat water.
 */

import java.util.Scanner;
// class to calculate the energy needed to heat water
public class WaterEnergy {
// main method to execute the program
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
// prompt the user for the amount of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();
// prompt the user for the initial and final temperatures in Celsius
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();
// prompt the user for the final temperature in Celsius
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();
// calculate the energy needed to heat the water in joules
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;
// display the result to the user
        System.out.println("The energy needed is " + Q + " joules.");
// close the scanner to prevent resource leaks
        input.close();
    }
}