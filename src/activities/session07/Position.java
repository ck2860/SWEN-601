package activities.session07;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Position) {
            Position p = (Position) obj;
            return p.x == this.x && p.y == this.y;
        }else{
            return  false;
        }
    }

    public static void main(String [] args) {
        Position one = new Position(50, 75);
        Position two = new Position(50, 75);

        System.out.println("one == two " + (one == two));
        System.out.println("one.equals(one) " + one.equals(one));
        System.out.println("one.equals(two) " + one.equals(two));
    }
}
