/*
 * Jordyn Rylander
 * Module 1.3
 * Calculates the energy needed to heat water.
 */

import java.util.Scanner;

public class WaterEnergy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is " + Q + " joules.");

        input.close();
    }
}