/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session04;
/**
 * the scanner from the java library is used.
 */
import java.util.Scanner;

public class CountDown {
    /**
     * The scanner method was used to get the user's input.
     * As the prompt asks to enter a number, it would count down as it decrements.
     * It would print the decremented numbers
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        while (number >= 0) {
            System.out.println(number);
            number--;
            //        number = number -1;
        }
    }
}
