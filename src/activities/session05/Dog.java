package activities.session05;

import java.sql.SQLOutput;

public class Dog {
    private String name;
    private float weight;
    private int age;
    private String bark;
//    private String breed;


    public Dog(String name, float weight, int age, String bark) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.bark = bark;
    }
    //Parameterless
    public Dog() {
        name = "Millie";
        age = 12;
    }

    // chaining constructor
    public Dog(String name) {
        this(name, 23, 12, "woooof!");
    }

//
    public void birthday(int age) {
        age = age + 1;
        System.out.println("Happy Birthday, " + name + "! You turned " + age + " years old!");
    }

    public void walk(float distance) {
        float calories = 100 * distance;
        weight -= (3000 / calories);
    }

    public void feed(float calories) {
        weight += (3000 / calories);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }

    public String getBark(){
        return bark;
    }
    @Override
    public String toString() {
        return "Dog [ name= " + getName() + ", age= " + getAge() + "]";
    }
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