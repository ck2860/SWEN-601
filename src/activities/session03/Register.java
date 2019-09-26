package activities.session03;
import java.util.Scanner;

public class Register {
    public static String makeChange (double charge, double payment) {

        System.out.println(charge+" and "+payment);

        float change = (float)payment -(float)charge ;
        System.out.println(change);
        // 8.99 and 10.0 = 1.01
        // Your change is 1 dollar and 1 cent
        int dollars =  (int) change;
        float cents =  (change - dollars);
        cents = cents * 100.0f;
        System.out.println(dollars+" and "+cents);

        return "Your change is " + dollars+" "+(dollars == 1? "dollar " : "dollars ") + "and " + String.format("%2.0f",cents)+" "+(cents >= 2 ? "cents " : "cent ");
    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter the charge: ");
        double charge = scanner.nextDouble();
        System.out.print("Enter the payment: ");
        double payment = scanner.nextDouble();
        System.out.println(makeChange(charge, payment));
    }
}




