/* Jordyn Rylander
 * CSd 402 - Module 5.2
 * 6/28/2026
 *  demonstrating method overloading by calculating averages for arrays of different data types.
 */ 

public class Rylander_mod_5_2_402 {
    // locate the largest value in a double array
public static int[] locateLargest(double[][] arrayParam) {
    int[] location = {0, 0};
    double largest = arrayParam[0][0];

    for (int row = 0; row < arrayParam.length; row++) {
        for (int col = 0; col < arrayParam[row].length; col++) {
            if (arrayParam[row][col] > largest) {
                largest = arrayParam[row][col];
                location[0] = row;
                location[1] = col;
            }
        }
    }

    return location;
}

// Locate the largest value in an int array
public static int[] locateLargest(int[][] arrayParam) {
    int[] location = {0, 0};
    int largest = arrayParam[0][0];

    for (int row = 0; row < arrayParam.length; row++) {
        for (int col = 0; col < arrayParam[row].length; col++) {
            if (arrayParam[row][col] > largest) {
                largest = arrayParam[row][col];
                location[0] = row;
                location[1] = col;
            }
        }
    }

    return location;
}

// Locate the smallest value in a double array
public static int[] locateSmallest(double[][] arrayParam) {
    int[] location = {0, 0};
    double smallest = arrayParam[0][0];

    for (int row = 0; row < arrayParam.length; row++) {
        for (int col = 0; col < arrayParam[row].length; col++) {
            if (arrayParam[row][col] < smallest) {
                smallest = arrayParam[row][col];
                location[0] = row;
                location[1] = col;
            }
        }
    }

    return location;
}

// Locate the smallest value in an int array
public static int[] locateSmallest(int[][] arrayParam) {
    int[] location = {0, 0};
    int smallest = arrayParam[0][0];

    for (int row = 0; row < arrayParam.length; row++) {
        for (int col = 0; col < arrayParam[row].length; col++) {
            if (arrayParam[row][col] < smallest) {
                smallest = arrayParam[row][col];
                location[0] = row;
                location[1] = col;
            }
        }
    }

    return location;
}
public static void main(String[] args) {
// Create a 2D double array
double[][] doubleArray = {
    {3.5, 8.2, 1.4},
    {9.8, 2.6, 7.1},
    {4.3, 6.9, 5.0}
};

// Create a 2D int array
int[][] intArray = {
    {12, 7, 25},
    {3, 18, 9},
    {15, 1, 20}
};

// Find the locations in the double array
int[] largestDouble = locateLargest(doubleArray);
int[] smallestDouble = locateSmallest(doubleArray);

// Find locations in the int array
int[] largestInt = locateLargest(intArray);
int[] smallestInt = locateSmallest(intArray);

// Display the results for the double array
System.out.println("Double Array:");
System.out.println("Largest value location: Row " + largestDouble[0] + ", Column " + largestDouble[1]);
System.out.println("Smallest value location: Row " + smallestDouble[0] + ", Column " + smallestDouble[1]);

System.out.println();

// Display the results for the int array
System.out.println("Int Array:");
System.out.println("Largest value location: Row " + largestInt[0] + ", Column " + largestInt[1]);
System.out.println("Smallest value location: Row " + smallestInt[0] + ", Column " + smallestInt[1]);
}
    }