package activities.session06;

public class Shallow {
    private String name;
    private int age;

    public Shallow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Shallow Harry = new Shallow("Harry", 17);
        Shallow Ron = new Shallow("Harry", 17);
    }
}