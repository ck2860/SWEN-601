/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session07;

public class Shape {
    /**
     * The private fields: pos, fillColor, lineColor were used as states for each object
     */
    private Position pos;
    private String fillColor;
    private String lineColor;

    /**
     * The Position pos, String color, and String linecolor are used as parameters for the constructor.
     * @param pos set the position
     * @param fillColor sets a color
     * @param lineColor sets a line color
     */

    public Shape(Position pos, String fillColor, String lineColor){
        this.pos = pos;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
    }

    /**
     * setting the position but default for fillColor and linecolor
     * @param pos sets in as position.
     */
    public Shape(Position pos) {
        this(pos, "transparent", "Black" );
    }

    /**
     * The move method is used to set the position
     * @param x int x
     * @param y int y
     */
    public void move(int x, int y){
        move(new Position(x,y));
    }

    /**
     * this method is called if the Position is used.
     * @param pos from Position
     */
    public void move(Position pos){
        this.pos = pos;
    }

    /**
     * the getter for Pos
     * @return pos
     */

    public Position getPos() {
        return pos;
    }

    /**
     * the getter for area
     * @return 0
     */

    public double getArea(){
        return 0;
    }

    /**
     * getter for perimeter
     * @return 0
     */
    public double getPerimeter(){
        return 0;
    }
//    public void move(int x,int y) {
//        pos.setX(x);
//        pos.setY(y);
//    }
}
