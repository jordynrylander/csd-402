/*
 * Jordyn Rylander
 * Module 9.2 Assignment
 * CSD 402
 *
 * this program creates or appends random numbers to a file,
 * then reads and displays the file contents
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RylanderDataFile {

    public static void main(String[] args) {

        File file = new File("data.file");
        Random random = new Random();

        try {
            FileWriter writer = new FileWriter(file, true);

            for (int i = 0; i < 10; i++) {
                writer.write(random.nextInt(100) + " ");
            }

            writer.write("\n");
            writer.close();

        } catch (IOException e) {
            System.out.println(
                    "An error occurred while writing to the file.");
        }

        try {
            Scanner fileScanner = new Scanner(file);

            System.out.println("Contents of data.file:");

            while (fileScanner.hasNext()) {
                System.out.print(fileScanner.next() + " ");
            }

            fileScanner.close();

        } catch (IOException e) {
            System.out.println(
                    "An error occurred while reading the file.");
        }
    }
}