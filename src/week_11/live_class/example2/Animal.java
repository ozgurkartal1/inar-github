package src.week_11.live_class.example2;

public class Animal {

    public void makeSound(){
        System.out.println("some generic sound...");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bark !! ");
    }

    public void fetch(){
        System.out.println("Fetching the ball");
    }
}

class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Meow !! ");
    }

    public void climb(){
        System.out.println("Climbing the furniture...");
    }
}

class PolymorphismExample{
    public static void main(String[] args) {
        // Creating object of different types

        Animal dog = new Dog(); // implicit casting
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        // Explicit casting

        ((Dog)dog).fetch();
        ((Cat)cat).climb();


    }
}
