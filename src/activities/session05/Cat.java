/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session05;

public class Cat {
    /**
     * showing that we can use setters and getters outside of the class since the fields are private.
     * as the object is created, the object's name can be changed by using the setter.
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        Dog dog = new Dog(); // public
//        dog.name=""; // showing you that it is private
        dog.setName("Silly Dog"); // showing you it is public
        System.out.println(dog.getName());
        System.out.println(dog);

    }
}
