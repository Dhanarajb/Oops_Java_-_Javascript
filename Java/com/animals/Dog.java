package Java.com.animals;

/**
 * The `Dog` class represents a dog, which is a type of animal.
 * It extends the `Animal` class and provides a constructor to set the dog's
 * name.
 * The `main` method creates a new `Dog` instance and demonstrates how to access
 * the dog's name and make it produce a sound.
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println("Dog name: " + dog.name);
        dog.makeSound();
    }
}