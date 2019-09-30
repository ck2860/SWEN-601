/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session04;
/**
 * the scanner from the java library is used.
 */
import java.util.Scanner;

public class FillinganArray {
    /**
     * The for loop was used until the condition becomes false.
     * The array was created and the for loop executes and fills the array.
     * @param n a number the user enters
     * @return a multiple of the number that the user enters
     */
    public static int [] makesTens(int n) {
        int [] tens = new int [n];
            for (int i = 0; i < n; i++) {
                tens[i] = i * 10;
        }
        return tens;
    }
    /**
     *  As the user enters a number, the array is created.
     *  The method is used to filling the array and the for each loop is used to print the array.
     * @param args is a part of main method, for command arguments.
     */
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
