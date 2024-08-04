class Enacapsulation {
  // Private properties
  #name;
  #age;

  constructor(name, age) {
    this.#name = name; // Initialize private property
    this.#age = age; // Initialize private property
  }

  // Public method to get the name
  getName() {
    return this.#name; // Accessing private property
  }

  // Public method to get the age
  getAge() {
    return this.#age; // Accessing private property
  }

  // Public method to set the age with validation
  setAge(age) {
    if (age >= 0) {
      this.#age = age; // Update private property
    } else {
      console.log("Age must be a positive number.");
    }
  }
}

// Example usage
const person = new Enacapsulation("Alice", 30);
console.log(person.getName()); // Output: Alice
console.log(person.getAge()); // Output: 30

person.setAge(35); // Update age to 35
console.log(person.getAge()); // Output: 35

person.setAge(-5); // Attempt to set invalid age
// Output: Age must be a positive number.
