/**
 * Represents a hero character in the game.
 *
 * The `Hero` class encapsulates the basic properties and methods for a hero character.
 * It provides methods to get and set the hero's health, and stores the hero's name and level.
 */
class Hero {
  // Property declarations
  name;
  #health; // Private field
  level;

  // Constructor to initialize properties
  constructor(name, health, level) {
    this.name = name;
    this.#health = health;
    this.level = level;
  }

  // Getter for health
  getHealth() {
    return this.#health;
  }

  // Setter for health
  setHealth(value) {
    this.#health = value;
  }
}

// Example usage
const hero = new Hero("Arthur", 100, "A"); // Use constructor to initialize properties

console.log(`Name: ${hero.name}`);
console.log(`Health: ${hero.getHealth()}`); // Use getter to get health
console.log(`Level: ${hero.level}`);
