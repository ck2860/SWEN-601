/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session06;

public class Car {
    /**
     *  The Make (enum) make, String model, int year, string color, string vin, and static int car_count are created as private fields
     */
    private Make make;
    private String model;
    private int year;
    private String color;
    private String VIN;
    private static int CAR_COUNT = 0;


    /**
     * initializing constructor is used for each object as providing Make make, String model, int year, string color and string vin.
     * The counter for car is added each time, the new car is created/or use this constructor.
     * @param _make from the make enum
     * @param Model string model
     * @param Year int year
     * @param Color string color
     * @param VIN string vin
     */
    public Car(Make _make, String Model, int Year, String Color, String VIN) {
        this.make = _make;
        this.model = Model;
        this.year = Year;
        this.color = Color;
        this.VIN = VIN;
        CAR_COUNT =  CAR_COUNT + 1;
    }

    /**
     * the getter for CAR_COUNT
     * @return CAR_COUNT
     */
    public static int getCarCount() {
        return CAR_COUNT;
    }

    /**
     * the getter for make
     * @return make
     */

    public Make getMake() {
        return this.make;
    }

    /**
     *  the getter for model
     * @return model
     */

    public String getModel() {
        return model;
    }

    /**
     * getter for a year
     * @return year
     */

    public int getYear() {
        return year;
    }

    /**
     * getter for the color
     * @return color
     */

    public String getColor() {
        return color;
    }

    /**
     *  getter for VIN
     * @return VIN
     */

    public String getVIN() {
        return VIN;
    }

    /**
     * setter for color
     * @param colour
     */

    public void setColor(String colour) {
        this.color = colour;
    }

    /**
     * the equal(obj) method is used for deep equality.
     * So the objects' colors have to be same to return true, otherwise false.
     * @param obj an object
     * @return a boolean value if the both cars' colors are the same.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            return car.color.equals(this.color);
        }
        return false;
    }

    /**
     * the toString method is used to print the properties for the car.
     * @return make, model,year, color and VIN for car
     */

    @Override
    public String toString() {
        return "Car [ Make = " + getMake()
                + " Model = " + getModel()
                + " Year = " + getYear()
                + " Color = " + getColor()
                + " VIN = " + getVIN() + "]";
    }

    /**
     * CAR_COUNT is called to show you that each time the car is created, the count for car is incremented.
     * Three cars were created and used for testing the equality.
     * @param args is a part of main method, for command arguments.
     */

    public static void main(String[] args) {
        System.out.println(CAR_COUNT);
        Car dart1 = new Car(Make.Dodge, "Dart", 2013, "Tungsten", "1234523242");
        System.out.println(CAR_COUNT);
        Car dart2 = new Car(Make.Dodge, "Dart", 2013, "Tungsten", "1234523242");
        System.out.println(CAR_COUNT);
        Car equiox = new Car(Make.Ford, "Equinox", 2010, "Mocha", "1234523298");
        System.out.println(CAR_COUNT);
        System.out.println("Dart 1: " +dart1);
        System.out.println("Dart 2: " +dart2);
        System.out.println("Equiox:" +equiox);
        System.out.println("dart1.equals(dart2): " +dart1.equals(dart2));
        System.out.println("dart1 == dart 2: " + (dart1 == dart2));
        System.out.println("dart1.equals(equiox): " +dart1.equals(equiox));

    }
}


