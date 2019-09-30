/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session02;

public class PetNames {
    /**
     * SayPetName function prints every single character of my pet name.
     */
    public static void sayPetName(){
        System.out.println("M");
        System.out.println("i");
        System.out.println("l");
        System.out.println("l");
        System.out.println("i");
        System.out.println("e");
    }
    /**
     * it prints the sayPetName function three times.
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        sayPetName();
        sayPetName();
        sayPetName();
    }
}
