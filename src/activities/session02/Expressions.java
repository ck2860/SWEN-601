/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session02;

public class Expressions {
    /**
     * the int variable x is defined as 2.
     * the int variable y is defined/calculated as 8/2*6.
     * the int variable z is defined x + y.
     * prints all of three variables (x, y, and z).
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        int x = 2;
        int y = 8 / 2 * 6;
        int z = x + y;
        System.out.println(y);
        System.out.println(x);
        System.out.println(z);
    }
}
