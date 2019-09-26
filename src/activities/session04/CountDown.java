package activities.session04;

import java.util.Scanner;

public class CountDown {
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
