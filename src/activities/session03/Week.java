package activities.session03;

import java.util.Scanner;

public class Week {

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
        }
        return name;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        String dayName = dayofTheWeek(day);
        System.out.println("This is "+ dayName);
    }
}

