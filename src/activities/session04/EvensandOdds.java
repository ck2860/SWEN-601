package activities.session04;

import java.util.Scanner;

public class EvensandOdds {
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