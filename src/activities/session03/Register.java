/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session03;
/**
 * the scanner from the java library is used.
 */
import java.util.Scanner;

public class Register {
    /**
     * The change is assigned as charge is subtracted by payment.
     * The dollar is assigned as the first digits as the whole number in changes.
     * the cent is assigned as change and the whole number of the dollars in order to get the digits after the decimal.
     * @param charge enter an amount of charge
     * @param payment enter an amount of your payment
     * @return
     */
    public static String makeChange (double charge, double payment) {

        System.out.println(charge+" and "+payment);

        float change = (float)payment -(float)charge ;
//        System.out.println(change);
        // 8.99 and 10.0 = 1.01
        // Your change is 1 dollar and 1 cent
        int dollars =  (int) change;
        float cents =  (change - dollars);
        cents = cents * 100.0f;
        System.out.println(dollars+" and "+cents);

        return "Your change is " + dollars+" "+(dollars == 1? "dollar " : "dollars ") + "and " + String.format("%2.0f",cents)+" "+(cents >= 2 ? "cents " : "cent ");
    }

    /**
     * The scanner is used to get the user's input.
     * prompt for charge is printed, once the user enters the amount of charge then the prompt prints to get the payment amount.
     * after the user enters the amount of payment, the change would be printed.
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter the charge: ");
        double charge = scanner.nextDouble();
        System.out.print("Enter the payment: ");
        double payment = scanner.nextDouble();
        System.out.println(makeChange(charge, payment));
    }
}




