package activities.session06;

import java.util.Scanner;

public class StringTester {
    public static void main(String[] args) {
        int s = 10;
        float d = 10.0f;
        int w = s;
        char a = 'A';
        int b =65;
        System.out.println("s==s "+ (s==s));
        System.out.println("s==d "+ (s==d));
        System.out.println("s==w "+ (s==w));
        System.out.println("d==w "+ (d==w));
        System.out.println("d==b "+ (d==b));
        System.out.println("a==b "+ (a==b));
        String x = "Buttercup" + 1;
        String y = "Buttercup" + 1;
        String z = "Thunder";
        System.out.println("x==x "+ (x==x));
        System.out.println(x);
        System.out.println("x==y "+ (x==y));
        System.out.println("x==z "+ (x==z));
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String string2 = scanner.next();
        System.out.println("string==string2 "+ (string==string2));
        System.out.println("z == string 2" + (z == string2));

    }
}
