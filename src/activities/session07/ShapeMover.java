package activities.session07;

public class ShapeMover {
    public static void moveAndPrint(Shape shape, Position moveTo){
        System.out.println("current location: " + shape.getPos());
        System.out.println("area: " + shape.getArea());
        shape.move(moveTo);
        System.out.println("new location: " + shape.getPos());
    }
    public static void main(String[] args) {
        Shape shape = new Shape(new Position(10, 20));
        moveAndPrint(shape, new Position(100, 150));

        Rectangle rectangle = new Rectangle(new Position(20, 40), 100, 200);
        moveAndPrint(rectangle, new Position(100, 200));

        Shape s = new Circle(new Position(0, 0), 35);
        moveAndPrint(s, new Position(50, 75));


    }
}
