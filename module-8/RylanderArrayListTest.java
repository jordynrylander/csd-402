/* 
 * Jordyn Rylander
 * CSD 402 - Module 8.2
 * 7/11/2026
 * create an ArrayList of integers entered by the user
 * and return the largest value in the list.
 */



import java.util.ArrayList;
import java.util.Scanner;

public class RylanderArrayListTest {

    public static void main(String[] args) {

        // create a Scanner for user input
        Scanner input = new Scanner(System.in);

        // create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // variable to store each number entered
        int number;

        System.out.println("Enter integers (enter 0 to stop):");

        // add every number to the list, including 0
        do {
            number = input.nextInt();
            numbers.add(number);
        } while (number != 0);

        // call the max method
        Integer largest = max(numbers);

        // display the result
        System.out.println("The largest value is: " + largest);

        input.close();
    }

    // return the largest value in the ArrayList
    public static Integer max(ArrayList<Integer> list) {

        // return 0 if the list is empty
        if (list.isEmpty()) {
            return 0;
        }

        Integer largest = list.get(0);

        // compare each number to the current largest value
        for (Integer number : list) {
            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }
}