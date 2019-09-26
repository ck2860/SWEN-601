package activities.session04;

import java.util.Scanner;

public class Countup {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        for (int i = 0; i <= limit; i++) {
            System.out.println(i);
        }
    }
}