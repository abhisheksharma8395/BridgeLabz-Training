package annotation;

public class OverrideAnnotation {
    public static void main(String[] args) {
        // Creating the object of Dog class By using reference of Animal class
        Animal dog1 = new Dog();
        // Calling the makeSound method of the dog1
        dog1.makeSound();
    }
}

// Animal class
class Animal{
    // makeSound method of Animal class
    public void makeSound(){
        System.out.println("Animal Makes Sound : ");
    }
}

// Class Dog subclass of Animal class
class Dog extends Animal{

    // Overriding the method of parent class(Animal) for child class(Dog)
    @Override
    public void makeSound(){
        System.out.println("Dog make sound : Woof Woof ");
    }
}
