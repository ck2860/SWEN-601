package activities.session04;

import java.util.Scanner;

public class Countup {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        for (int i = 0; limit > i; i++) {
            System.out.println(i);
        }
    }
}