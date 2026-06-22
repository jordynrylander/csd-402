/*
 * Jordyn Rylander
 * CSD 402
 * Module 4.2
 * 06/21/2026
 *
 * Demonstrating a method overloading by calculating
 * averages for arrays of different data types.
 */

public class Rylander_Mod4_CSD402 {

    // Average for short array
    public static short average(short[] array) {
    short sum = 0;

    for (short value : array) {
        sum += value;
    }

    return (short) (sum / array.length);
}

// Average for int array
public static int average(int[] array) {
    int sum = 0;

    for (int value : array) {
        sum += value;
    }

    return sum / array.length;
}

// Average for long array
public static long average(long[] array) {
    long sum = 0;

    for (long value : array) {
        sum += value;
    }

    return sum / array.length;
}

// Average for double array
public static double average(double[] array) {
    double sum = 0;

    for (double value : array) {
        sum += value;
    }

    return sum / array.length;
}

public static void main(String[] args) {


// Create arrays of different sizes
short[] shortArray = {10, 20, 30};

int[] intArray = {5, 10, 15, 20};

long[] longArray = {100, 200, 300, 400, 500};

double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

System.out.println("Short Array:");

for (short num : shortArray) {
    System.out.print(num + " ");
}

System.out.println("\nAverage: " + average(shortArray));
System.out.println();

System.out.println("Int Array:");

for (int num : intArray) {
    System.out.print(num + " ");
}

System.out.println("\nAverage: " + average(intArray));
System.out.println();

System.out.println("Long Array:");

for (long num : longArray) {
    System.out.print(num + " ");
}

System.out.println("\nAverage: " + average(longArray));
System.out.println();

System.out.println("Double Array:");

for (double num : doubleArray) {
    System.out.print(num + " ");
}

System.out.println("\nAverage: " + average(doubleArray));
System.out.println();

}

}