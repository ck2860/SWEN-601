/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session06;

public class Shallow {
    /**
     * The private fields for name and age.
     */
    private String name;
    private int age;

    /**
     * a constructor that takes name and age.
     * @param name String name
     * @param age int age
     */
    public Shallow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Showing you that even if the objects' states are the same but they are stored in different memory, so they aren't exactly same.
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        Shallow Harry = new Shallow("Harry", 17);
        Shallow Ron = new Shallow("Harry", 17);
        System.out.println("Harry == Ron: " + (Harry == Ron));


    }
}