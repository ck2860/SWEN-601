package activities.session07;

public class Shape {
    private Position pos;
    private String fill;
    private String line;

    public Shape(Position pos, String fill, String line){
        this.pos = pos;
        this.fill = fill;
        this.line = line;
    }
    public double area() {
        return 0;
    }
    public double perimeter(){
        return 0;
    }

    public double getArea(){
        return area();
    }
    public double getPerimeter(){
        return perimeter();
    }
//    public void move(int x,int y) {
//        pos.setX(x);
//        pos.setY(y);
//    }
    public void move(int x, int y){
        move(new Position(x,y));
    }
    public void move(Position pos){
        this.pos = pos;
    }
    public Shape(Position pos){
        this(pos, "transparent", "black");
    }

}
