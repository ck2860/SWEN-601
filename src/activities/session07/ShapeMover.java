/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session07;

public class ShapeMover {
    /**
     * the current location is printed before it changes the position.
     * The area for those shapes is also printed.
     * @param shape shape, rectangle or circle
     * @param moveTo move to the next position.
     */
    public static void moveAndPrint(Shape shape, Position moveTo){
        System.out.println("current location: " + shape.getPos());
        System.out.println("area: " + shape.getArea());
        shape.move(moveTo);
        System.out.println("new location: " + shape.getPos());
    }

    /**
     * shape, circle and rectangle are created at first, then
     * execute the moveAndprint method.
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        Shape shape = new Shape(new Position(10, 20));
        moveAndPrint(shape, new Position(100, 150));

        Rectangle rectangle = new Rectangle(new Position(20, 40), 100, 200);
        moveAndPrint(rectangle, new Position(100, 200));

        Shape s = new Circle(new Position(0, 0), 35);
        moveAndPrint(s, new Position(50, 75));
    }
}
