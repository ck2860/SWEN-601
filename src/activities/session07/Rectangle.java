package activities.session07;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Position pos, double width, double height){
        super(pos);
        this.width = width;
        this.height = height;
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(new Position(30, 50), 50, 50);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
