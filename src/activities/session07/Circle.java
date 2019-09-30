/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session07;

public class Circle extends Shape {
    /**
     * This circle is inherited from the shape.
     * the radius is used as the state for the circle
     */
    private double radius;
    /**
     * the constructor for circle that takes Position pos and double radius
     * Super method is used from shape parent class.
     */
    public Circle(Position pos, double radius) {
        super(pos);
        this.radius = radius;
    }

    /**
     * the method is overridden for the area.
     * @return the area for the circle
     */
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    /**
     * the method is overridden for the perimeter.
     * @return the perimeter for the circle
     */
    @Override
    public double getPerimeter(){
        return Math.PI*radius*2;
    }
}
