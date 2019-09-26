package activities.session04;

import java.util.Scanner;

public class FillinganArray {

    public static int [] makesTens(int n) {
        int [] tens = new int [n];
            for (int i = 0; i < n; i++) {
                tens[i] = i * 10;
        }
        return tens;
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int [] tens = makesTens(n);

//        for (int i=0; i < tens.length; i++){
        for (int i : tens) {
            System.out.println(i);
        }
    }

}
