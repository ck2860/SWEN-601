package activities.session06;

public class Car {
    private Make make;
    private String model;
    private int year;
    private String color;
    private String VIN;
    private static int CAR_COUNT = 0;

    //     initializing constructor
    public Car(Make _make, String Model, int Year, String Color, String VIN) {
        this.make = _make;
        this.model = Model;
        this.year = Year;
        this.color = Color;
        this.VIN = VIN;
        CAR_COUNT =  CAR_COUNT + 1;
    }

    public static int getCarCount() {
        return CAR_COUNT;
    }

    public Make getMake() {
        return this.make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getVIN() {
        return VIN;
    }

    public void setColor(String colour) {
        this.color = colour;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            return car.color.equals(this.color);
        }
        return false;
    }


    @Override
    public String toString() {
        return "Car[Make= " + getMake()
                + "Model = +" + getModel()
                + "Year=" + getYear()
                + "Color=" + getColor()
                + "VIN=" + getVIN() + "]";
    }

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


