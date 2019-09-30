/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session03;
/**
 * the scanner from the java library is used.
 */
import java.util.Scanner;

public class Week {
    /**
     * The dayofTheWeek method is used for to assign the day as monday, etc..
     * The switch statement is used when the user enters a number for a day.
     * @param day for the user to enter an integer for a day
     * @return string in a day.
     */
    public static String dayofTheWeek(int day) {
            String name = "not a valid day";
            switch(day) {
                case 0:
                    name = "Monday";
                    break;
                case 1:
                    name = "Tuesday";
                    break;
                case 2:
                    name = "Wednesday";
                    break;
                case 3:
                    name = "Thursday";
                    break;
                case 4:
                    name = "Friday";
                    break;
                case 5:
                    name = "Saturday";
                    break;
                case 6:
                    name = "Sunday";
                    break;
                default:
                    name = "not a valid day";
            }
            return name;
    }

    /**
     * The scanner was used to get the user's input
     * The prompt is printed to let the user to enter a number for a day
     * As the dayName method is executed, it would print a string as a day.
     * @param args is a part of main method, for command arguments.
     */

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        String dayName = dayofTheWeek(day);
        System.out.println("This is "+ dayName);
    }
}

