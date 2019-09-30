/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session07;

public class Position {
    /**
     * the states for position
     */
    private int x;
    private int y;

    /**
     * the method to set a position with int x and int y.
     * @param x int x
     * @param y int y
     */

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * the setter for x
     * @param x
     */

    public void setX(int x) {
        this.x = x;
    }

    /**
     * the setter for y
     * @param y
     */

    public void setY(int y) {
        this.y = y;
    }

    /**
     * the getter for x
     * @return x
     */

    public int getX() {
        return x;
    }

    /**
     * the getter for Y
     * @return Y
     */

    public int getY() {
        return y;
    }

    /**
     * the toString method is used to print the position
     * @return
     */

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * the equal(object) method is used for deep equality
     * @param obj
     * @return
     */

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Position) {
            Position p = (Position) obj;
            return p.x == this.x && p.y == this.y;
        }else{
            return  false;
        }
    }

    /**
     * the main method is used to test the equality of positions.
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String [] args) {
        Position one = new Position(50, 75);
        Position two = new Position(50, 75);

        System.out.println("one == two " + (one == two));
        System.out.println("one.equals(one) " + one.equals(one));
        System.out.println("one.equals(two) " + one.equals(two));
    }
}
