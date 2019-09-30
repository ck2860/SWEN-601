/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session06;
/**
 * the scanner from the java library is used.
 */
import java.util.Scanner;

public class StringTester {
    /**
     * This is showing you how we compare the strings, primitive types, etc..
     * For primitive types, they would be compared as a type.
     * For literal string, they would be compared as a string, since they are stored in the same memory to save memory.
     * For inputs, they are stored in different memory so they are compared as in as memory.
     * @param args is a part of main method, for command arguments.
     */

    public static void main(String[] args) {
        int s = 10;
        float d = 10.0f;
        int w = s;
        char a = 'A';
        int b =65;
        System.out.println("s == s: "+ (s==s));
        System.out.println("s == d: "+ (s==d));
        System.out.println("s == w: "+ (s==w));
        System.out.println("d == w: "+ (d==w));
        System.out.println("d == b: "+ (d==b));
        System.out.println("a == b: "+ (a==b));
        String x = "Buttercup";
        String y = "Buttercup";
        String z = "Thunder";
        System.out.println("---------");
        System.out.println("x==x:  "+ (x==x));
        System.out.println("x==y: "+ (x==y));
        System.out.println("x==z: "+ (x==z));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String a:");
        String string = scanner.nextLine();
        System.out.println("Enter String b:");
        String string2 = scanner.nextLine();
        System.out.println("string a == string b: "+ (string == string2));
        System.out.println("z == string b: " + (z == string2));
        System.out.println(Car.getCarCount()); // showing you that you can use getters from different class.


    }
}
