package activities.session03;

import java.util.Scanner;

public class Calendar {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the month: ");
        int day = scanner.nextInt();
        System.out.println("It is the " + dayDate(day));
    }
}
