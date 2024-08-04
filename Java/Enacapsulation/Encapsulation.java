package Java.Enacapsulation;

public class Encapsulation {
  // Private properties
  private String name;
  private int age;

  // Constructor to initialize properties
  public Encapsulation(String name, int age) {
    this.name = name; // Initialize name
    this.age = age; // Initialize age
  }

  // Public method to get the name
  public String getName() {
    return name; // Accessing private property
  }

  // Public method to get the age
  public int getAge() {
    return age; // Accessing private property
  }

  // Public method to set the age with validation
  public void setAge(int age) {
    if (age >= 0) {
      this.age = age; // Update private property
    } else {
      System.out.println("Age must be a positive number.");
    }
  }

  // Main method to demonstrate usage
  public static void main(String[] args) {
    Encapsulation person = new Encapsulation("Alice", 30);

    // Accessing properties using getters
    System.out.println("Name: " + person.getName()); // Output: Name: Alice
    System.out.println("Age: " + person.getAge()); // Output: Age: 30

    // Updating age
    person.setAge(35); // Update age to 35
    System.out.println("Updated Age: " + person.getAge()); // Output: Updated Age: 35

    // Attempt to set invalid age
    person.setAge(-5); // Output: Age must be a positive number.
  }
}
