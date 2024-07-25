/**
 * Represents a hero character in the game.
 *
 * The `Hero` class encapsulates the basic properties and methods for a hero character.
 * It provides methods to get and set the hero's health, and stores the hero's name and level.
 */
class Hero {
  // Property declarations
  name;
  #health;
  level;

  gethealth() {
    return this.#health;
  }
  sethealth(value) {
    this.#health = value;
  }
}

// Example usage
const hero = new Hero();

hero.name = "Arthur";
hero.sethealth(100);
hero.level = "A";

console.log(`Name: ${hero.name}`);
console.log(`Health: ${hero.gethealth()}`);
console.log(`Level: ${hero.level}`);
