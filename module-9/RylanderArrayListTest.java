/*
 * Jordyn Rylander
 * Module 9.2 Assignment
 * CSD 402
 *
 * this program stores Strings in an ArrayList and allows
 * the user to select an element to display again.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class RylanderArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();

        items.add("Shrek");
        items.add("Moana");
        items.add("Frozen");
        items.add("Toy Story");
        items.add("Finding Nemo");
        items.add("The Lion King");
        items.add("Cars");
        items.add("Coco");
        items.add("Tangled");
        items.add("Inside Out");

        System.out.println("Movie List:");

        for (String movie : items) {
            System.out.println(movie);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "\nEnter the movie number (0-9) you would like to see again: ");

        String input = scanner.nextLine();

        try {
            Integer choice = Integer.valueOf(input);

            System.out.println("\nYou selected: " + items.get(choice));

        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(
                    "Exception has been thrown: Out of Bounds");
        }

        scanner.close();
    }
}