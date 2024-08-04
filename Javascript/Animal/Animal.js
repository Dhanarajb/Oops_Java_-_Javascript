/**
 * Represents an animal with a name.
 */
class Animal {
  constructor(name) {
    this._name = name; // Using underscore to indicate "protected"
  }

  /**
   * Causes the animal to make its characteristic sound.
   */
  speak() {
    console.log(`${this._name} makes a sound`);
  }
}

/**
 * Represents a dog, which is a type of animal.
 * The `Dog` class extends the `Animal` class and adds the ability for the dog to bark.
 */
class Dog extends Animal {
  constructor(name) {
    super(name);
  }

  /**
   * Makes the dog bark.
   */
  bark() {
    console.log(`${this._name} barks!`); // Accessing "protected" member
  }
}

/**
 * Creates a new Dog instance with the name "Buddy".
 */
const dog = new Dog("Buddy");
dog.speak(); // Output: Buddy makes a sound
dog.bark(); // Output: Buddy barks!

// Trying to access the "protected" member from outside the class
console.log(dog._name); // Output: Buddy (but this is not recommended)
