package activities.session02;

public class Calculator {
    public static void calculate(float x, float y) {
        System.out.println("x = "+ x + " y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x / y = " + (x / y));

    }

    public static float convert(float pounds) {
        System.out.println("pounds: " + pounds);
        System.out.println("kilos: " + (pounds/2.2));
        return (pounds);
    }

    public static void main(String[] args) {
        calculate(4,6 );
        calculate(5,3);
        calculate(8, 9);
        float result = convert((float)186.2);
        float result1 = convert((float)207);
        System.out.println("total: " + ((result+result1)/2.2));

    }
}
