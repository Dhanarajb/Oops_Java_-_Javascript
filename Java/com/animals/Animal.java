package Java.com.animals;

public class Animal {
    protected String name;

    /**
     * Constructs a new Animal with the given name.
     *
     * @param name the name of the Animal
     */
    public Animal(String name) {
        this.name = name;
    }

    protected void makeSound() {
        System.out.println("Animal sound");
    }
}
