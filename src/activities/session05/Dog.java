/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session05;

public class Dog {
    /**
     * the private field are created for the objects : name, weight, age, and bark.
     */
    private String name;
    private float weight;
    private int age;
    private String bark;
//    private String breed;

    /**
     * The constructor that takes String name, float weight, int age, and String bark.
     * @param name string name
     * @param weight float weight
     * @param age int age
     * @param bark string bark
     */
    public Dog(String name, float weight, int age, String bark) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.bark = bark;
    }

    /**
     * the parameterless constructor is used when the object is created but none of the states is added to this object.
     */
    public Dog() {
        name = "Millie";
        age = 12;
    }

    /**
     *     // chaining constructor is used when the object is created but only added a name.
     * @param name an object's name
     */
    public Dog(String name) {
        this(name, 23, 12, "woooof!");
    }

    /**
     * the method is used for birthdays.
     * when the user enters an age, the age will be incremented by one.
     * would be say happy birthday and the incremented age.
     * @param age int age
     */
    public void birthday(int age) {
        age = age + 1;
        System.out.println("Happy Birthday, " + name + "! You turned " + age + " years old!");
    }

    /**
     * The method is used when this object walk as they burn calories/lose weight.
     * @param distance in meters as an object walks.
     */

    public void walk(float distance) {
        float calories = 100 * distance;
        weight -= (3000 / calories);
    }

    /**
     * the method is called when the object consumes calories and gained weight.
     * @param calories
     */

    public void feed(float calories) {
        weight += (3000 / calories);
    }

    /**
     *
     * The getter is created for name.
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     * the setter is created for name
     * @param name sets a name
     */

    public void setName(String name) {
        this.name=name;
    }

    /**
     * the getter for age
     * @return age
     */

    public int getAge(){
        return age;
    }

    /**
     * setter for an age
     * @param age sets age
     */

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * setters for bark
     * @param bark sets for bark
     */

    public void setBark(String bark) {
        this.bark = bark;
    }

    /**
     * getter for bark
     * @return bark
     */

    public String getBark(){
        return bark;
    }

    /**
     * the toString method is used to print the properties of an object.
     * @return the name, age, and bark
     */
    @Override
    public String toString() {
        return "Dog [ name= " + getName() + ", age= " + getAge() + ", bark =" + getBark() + "]";
    }

    /**
     * The objects are created by calling the Dog method.
     * The constructors are used in order to create objects.
     * prints each object's name and age.
     * The chaining constructor is used as well.
     * The birthday method was called.
     * The distance and calories were called to show you the dog's weight.
     * calling the objects to print the toString.
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println(dog1.name);
        Dog buttercup = new Dog("Buttercup", 62, 8, "woof");
        Dog thunder = new Dog("Thunder", 60, 13, "woof");
        System.out.println(buttercup.name);
        System.out.println(buttercup.age);
        System.out.println(thunder.name);
        System.out.println(thunder.age);
        Dog puppy = new Dog("Harry");
        System.out.println(puppy.name);
        buttercup.birthday(13);
//        System.out.println(dog1.age);
        System.out.println(buttercup.weight);
        buttercup.walk(0.8f);
        System.out.println(buttercup.weight);
        buttercup.feed(1000);
        System.out.println(buttercup.weight);
        System.out.println(buttercup);
        System.out.println(thunder);
        System.out.println(puppy);
        System.out.println(dog1);
    }
}


//        Dog puppy = new Dog();
//        System.out.print(puppy.name);
//        System.out.println(dog1.name);
//        System.out.println(dog1.age);
//        System.out.println(dog1.weight);
//        System.out.println(dog1.bark);
//        System.out.println(dog2.name);
//        System.out.println(dog2.age);
//        System.out.println(dog2.weight);
//        System.out.println(dog2.bark);
//        Dog buttercup = new Dog();
//        Dog thunder = new Dog();
//        Dog buttercup= new Dog("buttercup", 80, 12,"bark");
//        Dog thunder= new Dog("thunder", 120, 15, "yipp");
//        System.out.println(buttercup.name);
//        System.out.println(buttercup.age);
//        System.out.println(thunder.age);
//        System.out.println(buttercup.weight);
//        Dog puppy = new Dog();
//        System.out.println(puppy.name);
//        System.out.println(puppy.weight);
//    }
//}