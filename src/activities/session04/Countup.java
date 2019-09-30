/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session04;
/**
 * the scanner from the java library is used.
 */
import java.util.Scanner;

public class Countup {
    /**
     * The scanner method was used to get the user's input.
     * As the prompt asks to enter a number, it would count up and prints the numbers.
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        for (int i = 0; i <= limit; i++) {
            System.out.println(i);
        }
    }
}