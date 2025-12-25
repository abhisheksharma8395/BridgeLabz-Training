// In this program we are creating the Parent class Animal And Creating the Dog , Cat and Bird subclass
// And performing basic inheritance , Method overriding and polymorphism.
public class AnimalHierarchy {
    public static void main(String[] args) {
    	
    	// Creating Dog Class objects
        Animal Dog1 = new Dog("Shehbaaz Sharif", 12);
        Animal Dog2 = new Dog("Asim Munir", 6);
        Animal Dog3 = new Dog("Hafiz Saeed", 3);
        
        // Creating Cat Class objects
        Animal Cat1 = new Cat("Luna", 7);
        Animal Cat2 = new Cat("Nimbus", 8);
        
        // Creating Bird Class objects
        Animal Bird = new Bird("Sparrow", 9);

        // Calling makeSound() on all objects to demonstrate polymorphism .
        Dog1.makeSound();
        Dog2.makeSound();
        Dog3.makeSound();
        Cat1.makeSound();
        Cat2.makeSound();
        Bird.makeSound();
    }
}

// Animal Superclass
class Animal {
    String name;                              // Stores name of Animal
    int age;                                  // Stores Age of Animal
    
    // Constructor of Animal class
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // This Method display what sound a specific animal does
    void makeSound() {
        System.out.println("Animal Sound is : ");
    }
}

// Dog subclass of Animal
class Dog extends Animal {
	// Constructor of Dog class
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(this.name + " barks : WOOF WOOF!");
    }
}

// Cat subclass of Animal
class Cat extends Animal {
	// Constructor of Cat class
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(this.name + " meows : MEOW MEOW!");
    }
}

// Bird subclass of Animal
class Bird extends Animal {
	// Constructor of Bird class
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(this.name + " chirps : TWEET TWEET!");
    }
}
