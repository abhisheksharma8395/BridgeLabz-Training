import java.util.Scanner;

public class DemonstratePolyMorphism {
    public static void main(String[] args) {

        // Object of calculator class
        Calculator calculator = new Calculator();
        calculator.add(5,7);
        calculator.add(18,45,7);
        calculator.add(20.34,45.27,7.89);

        //Object of Dog and Cat class
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        // Calling sound method on dog and cat object
        dog1.sound();
        cat1.sound();
    }
}

// Compile Time polymorphism
class Calculator{
    public void add(int a,int b){
        System.out.println("Addition of "+a+" and "+b+" are : "+(a+b));
    }

    public void add(int a,int b,int c){
        System.out.println("Addition of "+a+", "+b+" and "+c+" are : "+(a+b+c));
    }

    public void add(double a,double b,double c){
        System.out.printf("Addition of %.2f , %.2f and %.2f are : %.2f\n",a,b,c,(a+b+c));
    }
}

// Run time Polymorphism
class Animal{
    public void sound(){
        System.out.println("Animal Sound is : ");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        super.sound();
        System.out.println("Dog sound is : Woof Woof");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        super.sound();
        System.out.println("Cat sound is : Meow Meow");
    }
}
