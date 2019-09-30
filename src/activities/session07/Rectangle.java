/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session07;

public class Rectangle extends Shape {
    /**
     * This rectangle is inherited from the shape.
     * the width and height are used as the state for the rectangle
     */
    private double width;
    private double height;
    /**
     * the constructor for rectangle that takes Position pos, double width, and double height
     * Super method is used from shape parent class.
     */
    public Rectangle(Position pos, double width, double height){
        super(pos);
        this.width = width;
        this.height = height;
    }
    /**
     * the method is overridden for the area.
     * @return the area for the rectangle
     */
    @Override
    public double getArea(){
        return width * height;
    }
    /**
     * the method is overridden for the perimeter
     * @return the perimeter for the rectangle
     */
    @Override
    public double getPerimeter(){
        return width*2 + height*2;
    }

    /**
     * the main method is used to show the the area and perimeter of the rectangle.
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle(new Position(100, 100), 200, 100);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
//        System.out.println(r.scale(2));
    }
}
