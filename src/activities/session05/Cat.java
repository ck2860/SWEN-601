package activities.session05;

public class Cat {
    public static void main(String[] args) {
        Dog dog = new Dog(); // public
//        dog.name=""; // showing you that it is private
        dog.setName("Silly Dog"); // showing you it is public
        System.out.println(dog.getName());
        System.out.println(dog);

    }
}
