package activities.session07;

public class Circle extends Shape {
    private double radius;
    public Circle(Position pos, double radius) {
        super(pos);
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return Math.PI*radius*2;
    }
}
