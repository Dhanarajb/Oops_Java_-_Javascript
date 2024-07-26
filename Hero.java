/**
 * The `Hero` class represents a game character with a name, health, and level.
 * 
 * The `health` property is private and can only be accessed through the
 * `getHealth()`
 * and `setHealth()` methods. This allows for better encapsulation and control
 * over
 * the health value.
 * 
 * The `main()` method demonstrates how to create a `Hero` instance, set its
 * properties,
 * and print the values using the getter and setter methods.
 */
public class Hero {
    // Properties
    String name;
    private int health; // Made private
    char level;

    // Constructor to initialize Hero properties
    public Hero(String name, int health, char level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Setter for health
    public void setHealth(int health) {
        this.health = health;
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        Hero hero = new Hero("Arthur", 100, 'A'); // Use constructor to initialize properties

        // Print the properties
        System.out.println("Name: " + hero.name);
        System.out.println("Health: " + hero.getHealth()); // Use getter to get health
        System.out.println("Level: " + hero.level);
    }
}
