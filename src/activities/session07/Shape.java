package activities.session07;

public class Shape {
    private Position pos;
    private String fillColor;
    private String lineColor;

    public Shape(Position pos, String fillColor, String lineColor){
        this.pos = pos;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
    }
    public Shape(Position pos) {
        this(pos, "transparent", "Black" );
    }
    public void move(int x, int y){
        move(new Position(x,y));
    }
    public void move(Position pos){
        this.pos = pos;
    }

    public Position getPos() {
        return pos;
    }

    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
//    public void move(int x,int y) {
//        pos.setX(x);
//        pos.setY(y);
//    }
}
