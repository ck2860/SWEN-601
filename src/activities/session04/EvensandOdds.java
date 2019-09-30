/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session04;
/**
 * the scanner from the java library is used.
 */
import java.util.Scanner;

public class EvensandOdds {
    /**
     * as the user enters a number, the do while loop is used in order to print at least once.
     * it would either prints even or odd.
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Even.");
              }
            else {
                System.out.println("Odd.");
            }
        } while (number != 0);
        System.out.println("Done!");
    }
}