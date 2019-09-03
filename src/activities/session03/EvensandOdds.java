package activities.session03;

import java.util.Scanner;

public class EvensandOdds {
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