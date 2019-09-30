/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session03;
/*
* this is for scanner, to get the user's input.
 */
import java.util.Scanner;

public class Calendar {
    /**
     * this method is for the day date, the switch statement is executed for the suffix.
     * @param D is a number that an user enters for a day
     * @return a string for suffix.
     */
    public static String dayDate(int D) {
        String suffix;
        if (D < 32) {
            switch (D % 10) {
                case 1:
                    if (D != 11) {
                        suffix = D+"st";
                    } else {
                        suffix = D+"th";
                    }
                    break;
                case 2:
                    if (D != 12) {
                        suffix = D+"nd";
                    } else {
                        suffix = D+"th";
                    }
                    break;
                case 3:
                    if (D != 13) {
                        suffix = D+"rd";
                    } else {
                        suffix = D+"th";
                    }
                    break;
                default:
                    suffix = D+"th";
                    break;
            }
        }else{
            suffix = "not a day";
        }
        return suffix;
    }

    /**
     * The scanner was used to get the user's input
     * The prompt was used to let the user know she/he needs to enter a number/day
     * the day function is executed so it prints a day with suffix.
     * @param args is a part of main method, for command arguments.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the month: ");
        int day = scanner.nextInt();
        System.out.println("It is the " + dayDate(day));
    }
}
