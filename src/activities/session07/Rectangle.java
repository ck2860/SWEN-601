package activities.session07;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Position pos, double width, double height){
        super(pos);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public double getPerimeter(){
        return width*2 + height*2;
    }


    public static void main(String[] args) {
        Rectangle r = new Rectangle(new Position(100, 100), 200, 100);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
//        System.out.println(r.scale(2));
    }
}
