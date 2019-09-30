/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session03;
/**
 * the scanner from the java library is used.
 */

import java.util.Scanner;

public class EvensandOdds {
    /**
     * The scanner was used in order to get the user's input
     * The prompt was printed.
     *
     * the if/else statements were used to execute whenever if the condition is true.
     * if none of those conditions is true then the else statement would be executed.
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = scanner.nextInt();
        if (i % 5 == 0) {
            System.out.println("The number is divisible by 5.");
        }else if (i % 2 == 0) {
            System.out.println("The number is even.");
        }else {
            System.out.println("The number is odd.");
        }
    }
}