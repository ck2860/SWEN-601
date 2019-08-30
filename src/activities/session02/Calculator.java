package activities.session02;
/**
 * Using java.util.Scanner class as standard input
 */

import java.util.Scanner;

public class Calculator {
    /**
     * This function calculate two given numbers together
     * and prints keys,addition, multiplication, subtraction, and division.
     *
     * @param x The first number to calculate.
     * @param y The second number to calculate.
     */

    public static void calculate(float x, float y) {
        System.out.println("x = "+ x + " y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x / y = " + (x / y));
    }
    /**
     * This function converts pounds to kilograms by dividing 2.2
     * and returns the result.
     *
     * @param pounds The given weight in pounds.
     * @return the given weight in kilograms.
     */

    public static float convert(float pounds) {
        System.out.println("pounds: " + pounds);
        System.out.println("kilos: " + (pounds/2.2));
        return (float) (pounds/2.2);
    }
    /**
     * The first System.out was used for prompt
     * Scanner function was used for standard input
     * The 1st calculate function prints the calculation of your input.
     * The 2nd calculate function prints the calculation of 4 and 6 respectively.
     * The 3rd calculate function prints the calculation of 5 and 3 respectively.
     * The 4th calculate function prints the calculation of 8 and 9 respectively.
     * The 1st convert function prints the pounds to kilograms weight conversion, converts 186.2 pounds to 84.6363 kilos
     * The 1st convert function prints the pounds to kilograms weight conversion, converts 207 pounds to 94.0909 kilos
     * The final print statement is the total of two conversions in kilograms.
     */
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner scanner  = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        calculate(A, B);
        calculate(4,6 );
        calculate(5,3);
        calculate(8, 9);
        float result = convert((float)186.2);
        float result1 = convert((float)207);
        System.out.println("total: " + (result+result1));

    }
}
