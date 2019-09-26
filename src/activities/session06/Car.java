package activities.session06;

import java.lang.annotation.Documented;

public class Car {
    private Make make;
    private String Model;
    private int Year;
    private String Color;
    private String VIN;

//     initializing constructor
    public Car(Make _make, String Model, int Year, String Color, String VIN) {
        this.make = _make;
        this.Model = Model;
        this.Year = Year;
        this.Color = Color;
        this.VIN = VIN;
    }

    public Make getMake() {
        return this.make;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    public String getColor() {
        return Color;
    }

    public String getVIN() {
        return VIN;
    }

    public void setColor(String colour) {
        this.Color = colour;
    }

//    @Override
//    public boolean equals (Object obj){
//        if (obj instanceof Car) {
//            Car car  = (Car)obj;
//            return Car.Color.equals(this.Color);
////        }
//
//
////    @Override
////    public String toString() {
////        return "Car[Make= " + getMake() + "Model = +" + getModel() + "Year=" + getYear() + "Color=" + getColor() + "VIN=" + getVIN() + "]";
////    }
//
//    public static void main(String[] args) {
//        Car dart1 = new Car(Make.Ford, "Dart", 2013, "Tungsten", "1234523242");
//        Car dart2 = new Car(Make.Ford, "Dart", 2013, "Tungsten", "1234523242");
//        Car equiox = new Car(Make.Dodge, "Equinox", 2013, "Tungsten", "1234523242");
//
//        System.out.println(dart1.toString());
//
//        System.out.println(dart1.equals(dart2));
    }


